package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class QuoteSpan implements LeadingMarginSpan {
    public static int COLLAPSE_LINES = 3;
    public boolean adaptLineHeight = true;
    private final Paint backgroundPaint;
    private final Path backgroundPath;
    private final float[] backgroundPathRadii;
    public QuoteCollapseButton collapseButton;
    public QuoteCollapsedPart collapsedSpan;
    private int color;
    public final boolean edit;
    public int end;
    public boolean first;
    public boolean isCollapsing;
    public boolean last;
    private final Paint linePaint;
    private final Path linePath;
    private final float[] linePathRadii;
    private SpannableString newline;
    private final Drawable quoteDrawable;
    public boolean rtl;
    public boolean singleLine;
    public int start;
    public final QuoteStyleSpan styleSpan;

    public static class QuoteButtonNewLineSpan extends CharacterStyle {
        @Override
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    @Override
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }

    public QuoteSpan(boolean z, boolean z2, QuoteStyleSpan quoteStyleSpan) {
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        this.backgroundPathRadii = new float[8];
        this.backgroundPath = new Path();
        Paint paint2 = new Paint(1);
        this.linePaint = paint2;
        this.linePathRadii = new float[8];
        this.linePath = new Path();
        this.color = -1;
        this.edit = z;
        this.styleSpan = quoteStyleSpan;
        this.isCollapsing = z2;
        this.quoteDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.mini_quote).mutate();
        paint2.setColor(this.color);
        paint.setColor(ColorUtils.setAlphaComponent(this.color, 30));
    }

    public void setColor(int i) {
        if (this.color != i) {
            Drawable drawable = this.quoteDrawable;
            this.color = i;
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            this.linePaint.setColor(i);
            this.backgroundPaint.setColor(ColorUtils.setAlphaComponent(i, 30));
        }
    }

    @Override
    public int getLeadingMargin(boolean z) {
        return AndroidUtilities.dp(this.adaptLineHeight ? 8.0f : 10.0f);
    }

    public static class QuoteStyleSpan extends MetricAffectingSpan implements LineHeightSpan {
        public QuoteSpan span;

        @Override
        public void updateDrawState(TextPaint textPaint) {
            if (textPaint == null) {
                return;
            }
            textPaint.setTextSize(AndroidUtilities.dp(this.span.edit ? 16.0f : SharedConfig.fontSize - 2));
        }

        @Override
        public void updateMeasureState(TextPaint textPaint) {
            textPaint.setTextSize(AndroidUtilities.dp(this.span.edit ? 16.0f : SharedConfig.fontSize - 2));
            textPaint.setTextScaleX(this.span.edit ? 1.1f : 1.0f);
        }

        @Override
        public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            QuoteSpan quoteSpan = this.span;
            if (quoteSpan.adaptLineHeight) {
                int i5 = quoteSpan.singleLine ? 7 : 2;
                if (i <= quoteSpan.start) {
                    fontMetricsInt.ascent -= AndroidUtilities.dp((quoteSpan.last ? 2 : 0) + i5);
                    fontMetricsInt.top -= AndroidUtilities.dp((this.span.last ? 2 : 0) + i5);
                }
                if (i2 >= this.span.end) {
                    float f = i5;
                    fontMetricsInt.descent += AndroidUtilities.dp(f);
                    fontMetricsInt.bottom += AndroidUtilities.dp(f);
                }
            }
        }
    }

    public static int putQuote(Spannable spannable, int i, int i2, boolean z) {
        if (spannable == null) {
            return -1;
        }
        QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spannable.getSpans(i, i2, QuoteSpan.class);
        if (quoteSpanArr != null && quoteSpanArr.length > 0) {
            return -1;
        }
        int iClamp = Utilities.clamp(i, spannable.length(), 0);
        int iClamp2 = Utilities.clamp(i2, spannable.length(), 0);
        QuoteStyleSpan quoteStyleSpan = new QuoteStyleSpan();
        QuoteSpan quoteSpan = new QuoteSpan(false, z, quoteStyleSpan);
        quoteStyleSpan.span = quoteSpan;
        quoteSpan.start = iClamp;
        quoteSpan.end = iClamp2;
        spannable.setSpan(quoteStyleSpan, iClamp, iClamp2, 33);
        spannable.setSpan(quoteSpan, iClamp, iClamp2, 33);
        return iClamp2;
    }

    public static int putQuoteToEditable(Editable editable, int i, int i2, boolean z) {
        if (editable == null) {
            return -1;
        }
        int iClamp = Utilities.clamp(i, editable.length(), 0);
        int iClamp2 = Utilities.clamp(i2, editable.length(), 0);
        if (iClamp > 0 && editable.charAt(iClamp - 1) != '\n') {
            editable.insert(iClamp, "\n");
            iClamp++;
            iClamp2++;
        }
        int i3 = iClamp2 + 1;
        if (iClamp2 >= editable.length() || editable.charAt(iClamp2) != '\n') {
            editable.insert(iClamp2, "\n");
        }
        QuoteStyleSpan quoteStyleSpan = new QuoteStyleSpan();
        QuoteSpan quoteSpan = new QuoteSpan(true, z, quoteStyleSpan);
        quoteStyleSpan.span = quoteSpan;
        quoteSpan.start = iClamp;
        quoteSpan.end = iClamp2;
        editable.setSpan(quoteSpan, Utilities.clamp(iClamp, editable.length(), 0), Utilities.clamp(iClamp2, editable.length(), 0), 33);
        editable.setSpan(quoteStyleSpan, Utilities.clamp(iClamp, editable.length(), 0), Utilities.clamp(iClamp2, editable.length(), 0), 33);
        editable.insert(Utilities.clamp(iClamp2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.clamp(iClamp2, editable.length(), 0), Utilities.clamp(i3, editable.length(), 0));
        return i3;
    }

    public static ArrayList updateQuoteBlocks(View view, Layout layout, ArrayList arrayList, boolean[] zArr) {
        int lineStart;
        QuoteSpan quoteSpan;
        int i;
        boolean z;
        int i2;
        if (layout == null) {
            if (arrayList != null) {
                arrayList.clear();
            }
            return arrayList;
        }
        CharSequence text = layout.getText();
        if (text == null || !(text instanceof Spannable)) {
            if (arrayList != null) {
                arrayList.clear();
            }
            return arrayList;
        }
        Spannable spannable = (Spannable) text;
        if (arrayList != null) {
            arrayList.clear();
        }
        QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spannable.getSpans(0, spannable.length(), QuoteSpan.class);
        ArrayList arrayList2 = arrayList;
        for (int i3 = 0; i3 < quoteSpanArr.length; i3++) {
            QuoteSpan quoteSpan2 = quoteSpanArr[i3];
            boolean z2 = quoteSpan2.last;
            Block block = new Block(view, layout, spannable, quoteSpan2);
            QuoteSpan quoteSpan3 = block.span;
            if (quoteSpan3.edit) {
                int i4 = quoteSpan3.start;
                if (i4 != 0 && text.charAt(i4 - 1) != '\n') {
                    spannable.removeSpan(quoteSpanArr[i3]);
                    spannable.removeSpan(quoteSpanArr[i3].styleSpan);
                    QuoteCollapsedPart quoteCollapsedPart = quoteSpanArr[i3].collapsedSpan;
                    if (quoteCollapsedPart != null) {
                        spannable.removeSpan(quoteCollapsedPart);
                    }
                } else {
                    if (block.span.end != text.length() && text.charAt(block.span.end) != '\n') {
                        int i5 = block.span.end;
                        while (i5 <= text.length() && i5 != text.length() && text.charAt(i5) != '\n') {
                            i5++;
                        }
                        spannable.removeSpan(quoteSpanArr[i3]);
                        spannable.removeSpan(quoteSpanArr[i3].styleSpan);
                        spannable.setSpan(quoteSpanArr[i3], block.span.start, i5, 33);
                        spannable.setSpan(quoteSpanArr[i3].styleSpan, block.span.start, i5, 33);
                        block = new Block(view, layout, spannable, quoteSpanArr[i3]);
                    }
                    if (spannable instanceof SpannableStringBuilder) {
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                        int i6 = block.span.end - 1;
                        boolean z3 = i6 >= 0 && spannableStringBuilder.charAt(i6) == '\n';
                        if (block.hasButton()) {
                            int i7 = block.span.end;
                            if (i7 - 2 < 0 || layout.getLineRight(layout.getLineForOffset(i7 - 1)) - AndroidUtilities.dp(12.0f) <= block.width - block.buttonWidth()) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        if (z3 != z) {
                            int i8 = block.span.end;
                            if (z3) {
                                i2 = i8 - 1;
                                spannableStringBuilder.delete(i8 - 1, i8);
                            } else {
                                i2 = i8 + 2;
                                boolean z4 = Selection.getSelectionStart(spannableStringBuilder) == block.span.end && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder);
                                QuoteSpan quoteSpan4 = block.span;
                                spannableStringBuilder.insert(quoteSpan4.end, (CharSequence) quoteSpan4.getNewlineHack());
                                if (z4) {
                                    int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                    int i9 = block.span.end;
                                    if (selectionStart != i9) {
                                        Selection.setSelection(spannableStringBuilder, i9, i9);
                                    }
                                }
                            }
                            block.span.end = Math.min(i2, spannable.length());
                            spannable.removeSpan(quoteSpanArr[i3]);
                            spannable.removeSpan(quoteSpanArr[i3].styleSpan);
                            QuoteSpan quoteSpan5 = quoteSpanArr[i3];
                            QuoteSpan quoteSpan6 = block.span;
                            spannable.setSpan(quoteSpan5, quoteSpan6.start, quoteSpan6.end, 33);
                            QuoteStyleSpan quoteStyleSpan = quoteSpanArr[i3].styleSpan;
                            QuoteSpan quoteSpan7 = block.span;
                            spannable.setSpan(quoteStyleSpan, quoteSpan7.start, quoteSpan7.end, 33);
                            if (zArr != null) {
                                zArr[0] = true;
                            }
                        }
                    }
                    QuoteCollapsedPart quoteCollapsedPart2 = block.span.collapsedSpan;
                    if (quoteCollapsedPart2 != null) {
                        spannable.removeSpan(quoteCollapsedPart2);
                    }
                    QuoteSpan quoteSpan8 = block.span;
                    if (quoteSpan8.isCollapsing && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(quoteSpan8.start) + COLLAPSE_LINES, layout.getLineCount()))) < (i = (quoteSpan = block.span).end)) {
                        if (quoteSpan.collapsedSpan == null) {
                            quoteSpan.collapsedSpan = new QuoteCollapsedPart(block.span);
                        }
                        spannable.setSpan(block.span.collapsedSpan, lineStart, i, 33);
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (quoteSpanArr[i3].last == z2) {
                    }
                    arrayList2.add(block);
                }
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                if (quoteSpanArr[i3].last == z2 && zArr != null) {
                    zArr[0] = true;
                }
                arrayList2.add(block);
            }
        }
        return arrayList2;
    }

    public static ArrayList updateQuoteBlocksSpanned(Layout layout, ArrayList arrayList) {
        if (layout == null) {
            if (arrayList != null) {
                arrayList.clear();
            }
            return arrayList;
        }
        CharSequence text = layout.getText();
        if (text == null || !(text instanceof Spanned)) {
            if (arrayList != null) {
                arrayList.clear();
            }
            return arrayList;
        }
        Spanned spanned = (Spanned) text;
        if (arrayList != null) {
            arrayList.clear();
        }
        for (QuoteSpan quoteSpan : (QuoteSpan[]) spanned.getSpans(0, spanned.length(), QuoteSpan.class)) {
            boolean z = quoteSpan.last;
            Block block = new Block(null, layout, spanned, quoteSpan);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(block);
        }
        return arrayList;
    }

    public static class Block {
        public final int bottom;
        public RectF collapseButtonBounds;
        public final TextPaint paint;
        public final QuoteSpan span;
        public final int top;
        public final View view;
        public final int width;

        public Block(View view, Layout layout, Spanned spanned, QuoteSpan quoteSpan) {
            int i;
            int i2;
            this.view = view;
            this.span = quoteSpan;
            this.paint = layout.getPaint();
            quoteSpan.start = spanned.getSpanStart(quoteSpan);
            int spanEnd = spanned.getSpanEnd(quoteSpan);
            quoteSpan.end = spanEnd;
            if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(quoteSpan.end) != '\n' && spanned.charAt(quoteSpan.end - 1) == '\n') {
                quoteSpan.end--;
            }
            int lineForOffset = layout.getLineForOffset(quoteSpan.start);
            int lineForOffset2 = layout.getLineForOffset(quoteSpan.end);
            quoteSpan.singleLine = lineForOffset2 - lineForOffset < 1;
            quoteSpan.first = lineForOffset <= 0;
            quoteSpan.last = lineForOffset2 + 1 >= layout.getLineCount();
            if (quoteSpan.edit) {
                int lineTop = layout.getLineTop(lineForOffset);
                if (quoteSpan.singleLine) {
                    i = 0;
                } else {
                    i = (quoteSpan.first ? 2 : 0) + 3;
                }
                this.top = lineTop + AndroidUtilities.dp(3 - i);
                int lineBottom = layout.getLineBottom(lineForOffset2);
                if (quoteSpan.singleLine) {
                    i2 = 0;
                } else {
                    i2 = (quoteSpan.last ? 2 : 0) + 3;
                }
                this.bottom = lineBottom - AndroidUtilities.dp(2 - i2);
            } else {
                this.top = layout.getLineTop(lineForOffset) + AndroidUtilities.dp(3 - (quoteSpan.singleLine ? 1 : 2));
                this.bottom = layout.getLineBottom(lineForOffset2) - AndroidUtilities.dp(2 - (quoteSpan.singleLine ? 1 : 2));
            }
            quoteSpan.rtl = false;
            float fMax = 0.0f;
            while (lineForOffset <= lineForOffset2) {
                fMax = Math.max(fMax, layout.getLineRight(lineForOffset));
                if (layout.getLineLeft(lineForOffset) > 0.0f) {
                    quoteSpan.rtl = true;
                }
                lineForOffset++;
            }
            this.width = (int) Math.ceil(fMax);
            if (quoteSpan.edit && view != null && quoteSpan.collapseButton == null) {
                quoteSpan.collapseButton = new QuoteCollapseButton(view);
            }
        }

        public void draw(Canvas canvas, float f, int i, int i2, float f2, TextPaint textPaint) {
            this.span.setColor(i2);
            int iDp = this.span.edit ? i : this.width + AndroidUtilities.dp(32.0f);
            int i3 = ((double) iDp) >= ((double) i) * 0.95d ? i : iDp;
            canvas.save();
            canvas.translate(0.0f, f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, this.top, i3, this.bottom);
            float[] fArr = this.span.backgroundPathRadii;
            float[] fArr2 = this.span.backgroundPathRadii;
            float[] fArr3 = this.span.backgroundPathRadii;
            this.span.backgroundPathRadii[7] = 0.0f;
            fArr3[6] = 0.0f;
            fArr2[1] = 0.0f;
            fArr[0] = 0.0f;
            float[] fArr4 = this.span.backgroundPathRadii;
            float[] fArr5 = this.span.backgroundPathRadii;
            float[] fArr6 = this.span.backgroundPathRadii;
            float[] fArr7 = this.span.backgroundPathRadii;
            float fDp = AndroidUtilities.dp(4.0f);
            fArr7[5] = fDp;
            fArr6[4] = fDp;
            fArr5[3] = fDp;
            fArr4[2] = fDp;
            this.span.backgroundPath.rewind();
            Path path = this.span.backgroundPath;
            float[] fArr8 = this.span.backgroundPathRadii;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr8, direction);
            canvas.drawPath(this.span.backgroundPath, this.span.backgroundPaint);
            QuoteSpan quoteSpan = this.span;
            if (quoteSpan.edit && this.view != null && quoteSpan.collapseButton != null) {
                if (this.collapseButtonBounds == null) {
                    this.collapseButtonBounds = new RectF();
                }
                int iDp2 = AndroidUtilities.dp(3.333f);
                QuoteSpan quoteSpan2 = this.span;
                quoteSpan2.collapseButton.draw(canvas, this.collapseButtonBounds, i3 - iDp2, this.bottom - iDp2, i2, quoteSpan2.isCollapsing, hasButton());
            }
            rectF.set(-AndroidUtilities.dp(3.0f), this.top, 0.0f, this.bottom);
            float[] fArr9 = this.span.linePathRadii;
            float[] fArr10 = this.span.linePathRadii;
            float[] fArr11 = this.span.linePathRadii;
            float[] fArr12 = this.span.linePathRadii;
            float fDp2 = AndroidUtilities.dp(4.0f);
            fArr12[7] = fDp2;
            fArr11[6] = fDp2;
            fArr10[1] = fDp2;
            fArr9[0] = fDp2;
            float[] fArr13 = this.span.linePathRadii;
            float[] fArr14 = this.span.linePathRadii;
            float[] fArr15 = this.span.linePathRadii;
            this.span.linePathRadii[5] = 0.0f;
            fArr15[4] = 0.0f;
            fArr14[3] = 0.0f;
            fArr13[2] = 0.0f;
            this.span.linePath.rewind();
            this.span.linePath.addRoundRect(rectF, this.span.linePathRadii, direction);
            canvas.drawPath(this.span.linePath, this.span.linePaint);
            QuoteSpan quoteSpan3 = this.span;
            if (!quoteSpan3.rtl) {
                int intrinsicHeight = (int) (((this.top + this.bottom) - quoteSpan3.quoteDrawable.getIntrinsicHeight()) / 2.0f);
                if (intrinsicHeight > this.top + AndroidUtilities.dp(8.0f)) {
                    intrinsicHeight = this.top + AndroidUtilities.dp(4.0f);
                }
                this.span.quoteDrawable.setBounds((i3 - this.span.quoteDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f), intrinsicHeight, i3 - AndroidUtilities.dp(4.0f), this.span.quoteDrawable.getIntrinsicHeight() + intrinsicHeight);
                this.span.quoteDrawable.setAlpha((int) (255.0f * f2));
                this.span.quoteDrawable.draw(canvas);
            }
            canvas.restore();
        }

        public int buttonWidth() {
            QuoteCollapseButton quoteCollapseButton = this.span.collapseButton;
            return quoteCollapseButton != null ? quoteCollapseButton.width() : AndroidUtilities.dp(23.66f) + (AndroidUtilities.dp(3.333f) * 2);
        }

        public boolean hasButton() {
            return this.span.edit && ((float) (this.bottom - this.top)) > (this.paint.getTextSize() * 1.3f) * ((float) QuoteSpan.COLLAPSE_LINES);
        }
    }

    public static boolean onTouch(MotionEvent motionEvent, int i, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                Block block = (Block) it.next();
                QuoteCollapseButton quoteCollapseButton = block.span.collapseButton;
                boolean z2 = block.hasButton() && block.collapseButtonBounds.contains(motionEvent.getX(), motionEvent.getY() - ((float) i));
                if (motionEvent.getAction() == 0) {
                    if (quoteCollapseButton != null) {
                        quoteCollapseButton.setPressed(z2);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (quoteCollapseButton != null && quoteCollapseButton.isPressed() && z2) {
                        QuoteSpan quoteSpan = block.span;
                        quoteSpan.isCollapsing = !quoteSpan.isCollapsing;
                        if (runnable != null) {
                            runnable.run();
                        }
                        z = true;
                    }
                    if (quoteCollapseButton != null) {
                        quoteCollapseButton.setPressed(false);
                    }
                } else if (motionEvent.getAction() == 3 && quoteCollapseButton != null) {
                    quoteCollapseButton.setPressed(false);
                }
                if (quoteCollapseButton == null || !quoteCollapseButton.isPressed()) {
                    if (z) {
                    }
                }
                z = true;
            }
            return z;
        }
    }

    public static void mergeQuotes(SpannableStringBuilder spannableStringBuilder, ArrayList arrayList) {
        boolean z;
        if (arrayList == null || !(spannableStringBuilder instanceof Spanned)) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i);
            if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                int i2 = messageEntity.offset;
                int i3 = messageEntity.length + i2;
                if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                    treeSet.add(Integer.valueOf(i2));
                    treeSet.add(Integer.valueOf(i3));
                    map.put(Integer.valueOf(i2), Integer.valueOf((map.containsKey(Integer.valueOf(i2)) ? ((Integer) map.get(Integer.valueOf(i2))).intValue() : 0) | (messageEntity.collapsed ? 16 : 1)));
                    map.put(Integer.valueOf(i3), Integer.valueOf((map.containsKey(Integer.valueOf(i3)) ? ((Integer) map.get(Integer.valueOf(i3))).intValue() : 0) | 2));
                }
            }
            i++;
        }
        Iterator it = treeSet.iterator();
        int i4 = 0;
        int i5 = 0;
        loop1: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop1;
                }
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                int iIntValue2 = ((Integer) map.get(num)).intValue();
                if (i4 != iIntValue) {
                    int i6 = iIntValue - 1;
                    int i7 = (i6 < 0 || i6 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i6) != '\n') ? iIntValue : iIntValue - 1;
                    if (i5 > 0) {
                        putQuoteToEditable(spannableStringBuilder, i4, i7, z);
                    }
                    i4 = iIntValue + 1;
                    if (i4 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(iIntValue) != '\n') {
                        i4 = iIntValue;
                    }
                }
                if ((iIntValue2 & 2) != 0) {
                    i5--;
                }
                if ((iIntValue2 & 1) != 0 || (iIntValue2 & 16) != 0) {
                    i5++;
                    if ((iIntValue2 & 16) != 0) {
                        z = true;
                    }
                }
            }
        }
        if (i4 >= spannableStringBuilder.length() || i5 <= 0) {
            return;
        }
        putQuoteToEditable(spannableStringBuilder, i4, spannableStringBuilder.length(), z);
    }

    public static void normalizeQuotes(Editable editable) {
        boolean z;
        if (editable == null) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        HashMap map = new HashMap();
        QuoteStyleSpan[] quoteStyleSpanArr = (QuoteStyleSpan[]) editable.getSpans(0, editable.length(), QuoteStyleSpan.class);
        int i = 0;
        while (true) {
            if (i >= quoteStyleSpanArr.length) {
                break;
            }
            QuoteStyleSpan quoteStyleSpan = quoteStyleSpanArr[i];
            int spanStart = editable.getSpanStart(quoteStyleSpan);
            int spanEnd = editable.getSpanEnd(quoteStyleSpan);
            treeSet.add(Integer.valueOf(spanStart));
            map.put(Integer.valueOf(spanStart), Integer.valueOf((quoteStyleSpan.span.isCollapsing ? 16 : 1) | (map.containsKey(Integer.valueOf(spanStart)) ? ((Integer) map.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            map.put(Integer.valueOf(spanEnd), Integer.valueOf((map.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) map.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            editable.removeSpan(quoteStyleSpan);
            editable.removeSpan(quoteStyleSpan.span);
            i++;
        }
        Iterator it = treeSet.iterator();
        int i2 = 0;
        int i3 = 0;
        loop1: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop1;
                }
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                int iIntValue2 = ((Integer) map.get(num)).intValue();
                if (i2 != iIntValue) {
                    int i4 = iIntValue - 1;
                    int i5 = (i4 < 0 || i4 >= editable.length() || editable.charAt(i4) != '\n') ? iIntValue : iIntValue - 1;
                    if (i3 > 0) {
                        putQuoteToEditable(editable, i2, i5, z);
                    }
                    i2 = iIntValue + 1;
                    if (i2 >= editable.length() || editable.charAt(iIntValue) != '\n') {
                        i2 = iIntValue;
                    }
                }
                if ((iIntValue2 & 2) != 0) {
                    i3--;
                }
                if ((iIntValue2 & 1) != 0 || (iIntValue2 & 16) != 0) {
                    i3++;
                    if ((iIntValue2 & 16) != 0) {
                        z = true;
                    }
                }
            }
        }
        if (i2 >= editable.length() || i3 <= 0) {
            return;
        }
        putQuoteToEditable(editable, i2, editable.length(), z);
    }

    public SpannableString getNewlineHack() {
        if (this.newline == null) {
            SpannableString spannableString = new SpannableString("\n");
            this.newline = spannableString;
            spannableString.setSpan(new QuoteButtonNewLineSpan(), 0, this.newline.length(), 33);
        }
        return this.newline;
    }

    public static CharSequence stripNewlineHacks(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        QuoteButtonNewLineSpan[] quoteButtonNewLineSpanArr = (QuoteButtonNewLineSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), QuoteButtonNewLineSpan.class);
        for (int length = quoteButtonNewLineSpanArr.length - 1; length >= 0; length--) {
            QuoteButtonNewLineSpan quoteButtonNewLineSpan = quoteButtonNewLineSpanArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(quoteButtonNewLineSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(quoteButtonNewLineSpan);
            spannableStringBuilder.removeSpan(quoteButtonNewLineSpan);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public static class QuoteCollapsedPart extends CharacterStyle {
        private final QuoteSpan span;

        public QuoteCollapsedPart(QuoteSpan quoteSpan) {
            this.span = quoteSpan;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Theme.blendOver(Theme.multAlpha(textPaint.getColor(), 0.55f), Theme.multAlpha(this.span.color, 0.4f)));
        }
    }

    public static class ExpandDrawable extends Drawable {
        private int alpha;
        private final AnimatedFloat animatedState;
        private final Paint paint;
        private final Path path;
        private boolean state;
        private final View view;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public ExpandDrawable(View view) {
            Paint paint = new Paint(1);
            this.paint = paint;
            Path path = new Path();
            this.path = path;
            this.alpha = 255;
            this.view = view;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
            this.animatedState = new AnimatedFloat(view, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            float fDpf2 = AndroidUtilities.dpf2(4.66f);
            float fDpf3 = AndroidUtilities.dpf2(2.16f);
            path.rewind();
            path.moveTo(fDpf2 / 2.0f, 0.0f);
            float f = (-fDpf2) / 2.0f;
            path.lineTo(f, 0.0f);
            float f2 = f + fDpf3;
            path.lineTo(f2, -fDpf3);
            path.moveTo(f, 0.0f);
            path.lineTo(f2, fDpf3);
        }

        public void setColor(int i) {
            this.paint.setColor(i);
            this.paint.setAlpha(this.alpha);
        }

        public void setState(boolean z) {
            if (this.state != z) {
                this.state = z;
                this.view.invalidate();
            }
        }

        @Override
        public void draw(Canvas canvas) {
            int iCenterX = getBounds().centerX();
            int iCenterY = getBounds().centerY();
            float f = this.animatedState.set(this.state);
            float fDpf2 = AndroidUtilities.dpf2(2.51f);
            canvas.save();
            canvas.translate(iCenterX, iCenterY);
            canvas.save();
            canvas.translate(fDpf2, fDpf2);
            canvas.rotate(45.0f);
            canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, f), 1.0f);
            canvas.drawPath(this.path, this.paint);
            canvas.restore();
            canvas.save();
            float f2 = -fDpf2;
            canvas.translate(f2, f2);
            canvas.rotate(225.0f);
            canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, f), 1.0f);
            canvas.drawPath(this.path, this.paint);
            canvas.restore();
            canvas.restore();
        }

        @Override
        public void setAlpha(int i) {
            Paint paint = this.paint;
            this.alpha = i;
            paint.setAlpha(i);
        }
    }
}
