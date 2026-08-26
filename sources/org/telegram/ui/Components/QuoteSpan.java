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
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.iv.RichTextCell;

public final class QuoteSpan implements LeadingMarginSpan {
    public boolean adaptLineHeight = true;
    public final Paint backgroundPaint;
    public final Path backgroundPath;
    public final float[] backgroundPathRadii;
    public QuoteCollapseButton collapseButton;
    public RichTextCell.CollapsedTextPart collapsedSpan;
    public int color;
    public final boolean edit;
    public int end;
    public boolean first;
    public boolean isCollapsing;
    public boolean last;
    public final Paint linePaint;
    public final Path linePath;
    public final float[] linePathRadii;
    public SpannableString newline;
    public final Drawable quoteDrawable;
    public boolean rtl;
    public boolean singleLine;
    public int start;
    public final QuoteStyleSpan styleSpan;

    public final class Block {
        public final int bottom;
        public RectF collapseButtonBounds;
        public final TextPaint paint;
        public final QuoteSpan span;
        public final int top;
        public final EditTextEffects view;
        public final int width;

        public Block(EditTextEffects editTextEffects, Layout layout, Spanned spanned, QuoteSpan quoteSpan) {
            int i;
            int i2;
            this.view = editTextEffects;
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
            boolean z = quoteSpan.edit;
            if (z) {
                int lineTop = layout.getLineTop(lineForOffset);
                if (quoteSpan.singleLine) {
                    i = 0;
                } else {
                    i = (quoteSpan.first ? 2 : 0) + 3;
                }
                this.top = AndroidUtilities.dp(3 - i) + lineTop;
                int lineBottom = layout.getLineBottom(lineForOffset2);
                if (quoteSpan.singleLine) {
                    i2 = 0;
                } else {
                    i2 = (quoteSpan.last ? 2 : 0) + 3;
                }
                this.bottom = lineBottom - AndroidUtilities.dp(2 - i2);
            } else {
                this.top = AndroidUtilities.dp(3 - (quoteSpan.singleLine ? 1 : 2)) + layout.getLineTop(lineForOffset);
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
            if (z && editTextEffects != null && quoteSpan.collapseButton == null) {
                quoteSpan.collapseButton = new QuoteCollapseButton(editTextEffects);
            }
        }

        public final void draw(Canvas canvas, int i, int i2) {
            float f;
            QuoteSpan quoteSpan = this.span;
            int i3 = quoteSpan.color;
            Paint paint = quoteSpan.backgroundPaint;
            Paint paint2 = quoteSpan.linePaint;
            Drawable drawable = quoteSpan.quoteDrawable;
            if (i3 != i2) {
                quoteSpan.color = i2;
                drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
                paint2.setColor(i2);
                paint.setColor(ColorUtils.setAlphaComponent(i2, 30));
            }
            boolean z = quoteSpan.edit;
            int iDp = z ? i : AndroidUtilities.dp(32.0f) + this.width;
            int i4 = ((double) iDp) >= ((double) i) * 0.95d ? i : iDp;
            canvas.save();
            canvas.translate(0.0f, 0.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            int i5 = this.top;
            float f2 = i5;
            int i6 = this.bottom;
            float f3 = i6;
            rectF.set(0.0f, f2, i4, f3);
            float[] fArr = quoteSpan.backgroundPathRadii;
            fArr[7] = 0.0f;
            fArr[6] = 0.0f;
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            float fDp = AndroidUtilities.dp(4.0f);
            fArr[5] = fDp;
            fArr[4] = fDp;
            fArr[3] = fDp;
            fArr[2] = fDp;
            Path path = quoteSpan.backgroundPath;
            path.rewind();
            int i7 = i4;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.drawPath(path, paint);
            if (!z || this.view == null || quoteSpan.collapseButton == null) {
                f = f3;
            } else {
                if (this.collapseButtonBounds == null) {
                    this.collapseButtonBounds = new RectF();
                }
                int iDp2 = AndroidUtilities.dp(3.333f);
                f = f3;
                quoteSpan.collapseButton.draw(canvas, this.collapseButtonBounds, i7 - iDp2, i6 - iDp2, i2, quoteSpan.isCollapsing, hasButton());
            }
            rectF.set(-AndroidUtilities.dp(3.0f), f2, 0.0f, f);
            float fDp2 = AndroidUtilities.dp(4.0f);
            float[] fArr2 = quoteSpan.linePathRadii;
            fArr2[7] = fDp2;
            fArr2[6] = fDp2;
            fArr2[1] = fDp2;
            fArr2[0] = fDp2;
            fArr2[5] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[2] = 0.0f;
            Path path2 = quoteSpan.linePath;
            path2.rewind();
            path2.addRoundRect(rectF, fArr2, direction);
            canvas.drawPath(path2, paint2);
            if (!quoteSpan.rtl) {
                int intrinsicHeight = (int) (((i5 + i6) - drawable.getIntrinsicHeight()) / 2.0f);
                if (intrinsicHeight > AndroidUtilities.dp(8.0f) + i5) {
                    intrinsicHeight = AndroidUtilities.dp(4.0f) + i5;
                }
                drawable.setBounds((i7 - drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f), intrinsicHeight, i7 - AndroidUtilities.dp(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
                drawable.setAlpha((int) 255.0f);
                drawable.draw(canvas);
            }
            canvas.restore();
        }

        public final boolean hasButton() {
            return this.span.edit && ((float) (this.bottom - this.top)) > (this.paint.getTextSize() * 1.3f) * ((float) 3);
        }
    }

    public final class ExpandDrawable extends Drawable {
        public int alpha;
        public final AnimatedFloat animatedState;
        public final Paint paint;
        public final Path path;
        public boolean state;
        public final View view;

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

        @Override
        public final void draw(Canvas canvas) {
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
            Path path = this.path;
            Paint paint = this.paint;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            float f2 = -fDpf2;
            canvas.translate(f2, f2);
            canvas.rotate(225.0f);
            canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, f), 1.0f);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.restore();
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            Paint paint = this.paint;
            this.alpha = i;
            paint.setAlpha(i);
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public final class QuoteButtonNewLineSpan extends CharacterStyle {
        @Override
        public final void updateDrawState(TextPaint textPaint) {
        }
    }

    public final class QuoteStyleSpan extends MetricAffectingSpan implements LineHeightSpan {
        public QuoteSpan span;

        @Override
        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            QuoteSpan quoteSpan = this.span;
            if (quoteSpan.adaptLineHeight) {
                int i5 = quoteSpan.singleLine ? 7 : 2;
                if (i <= quoteSpan.start) {
                    fontMetricsInt.ascent -= AndroidUtilities.dp((quoteSpan.last ? 2 : 0) + i5);
                    fontMetricsInt.top -= AndroidUtilities.dp((this.span.last ? 2 : 0) + i5);
                }
                if (i2 >= this.span.end) {
                    float f = i5;
                    fontMetricsInt.descent = AndroidUtilities.dp(f) + fontMetricsInt.descent;
                    fontMetricsInt.bottom = AndroidUtilities.dp(f) + fontMetricsInt.bottom;
                }
            }
        }

        @Override
        public final void updateDrawState(TextPaint textPaint) {
            if (textPaint == null) {
                return;
            }
            textPaint.setTextSize(AndroidUtilities.dp(this.span.edit ? 16.0f : SharedConfig.fontSize - 2));
        }

        @Override
        public final void updateMeasureState(TextPaint textPaint) {
            textPaint.setTextSize(AndroidUtilities.dp(this.span.edit ? 16.0f : SharedConfig.fontSize - 2));
            textPaint.setTextScaleX(this.span.edit ? 1.1f : 1.0f);
        }
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

    public static void normalizeQuotes(SpannableStringBuilder spannableStringBuilder) {
        boolean z;
        TreeSet treeSet = new TreeSet();
        HashMap map = new HashMap();
        QuoteStyleSpan[] quoteStyleSpanArr = (QuoteStyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), QuoteStyleSpan.class);
        int i = 0;
        while (true) {
            if (i >= quoteStyleSpanArr.length) {
                break;
            }
            QuoteStyleSpan quoteStyleSpan = quoteStyleSpanArr[i];
            int spanStart = spannableStringBuilder.getSpanStart(quoteStyleSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(quoteStyleSpan);
            treeSet.add(Integer.valueOf(spanStart));
            map.put(Integer.valueOf(spanStart), Integer.valueOf((quoteStyleSpan.span.isCollapsing ? 16 : 1) | (map.containsKey(Integer.valueOf(spanStart)) ? ((Integer) map.get(Integer.valueOf(spanStart))).intValue() : 0)));
            treeSet.add(Integer.valueOf(spanEnd));
            map.put(Integer.valueOf(spanEnd), Integer.valueOf((map.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) map.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            spannableStringBuilder.removeSpan(quoteStyleSpan);
            spannableStringBuilder.removeSpan(quoteStyleSpan.span);
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
                    int i5 = (i4 < 0 || i4 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i4) != '\n') ? iIntValue : iIntValue - 1;
                    if (i3 > 0) {
                        putQuoteToEditable(spannableStringBuilder, i2, i5, z);
                    }
                    i2 = iIntValue + 1;
                    if (i2 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(iIntValue) != '\n') {
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
        if (i2 >= spannableStringBuilder.length() || i3 <= 0) {
            return;
        }
        putQuoteToEditable(spannableStringBuilder, i2, spannableStringBuilder.length(), z);
    }

    public static void putQuote(Spannable spannable, int i, int i2, boolean z) {
        QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spannable.getSpans(i, i2, QuoteSpan.class);
        if (quoteSpanArr == null || quoteSpanArr.length <= 0) {
            int iClamp = Utilities.clamp(i, spannable.length(), 0);
            int iClamp2 = Utilities.clamp(i2, spannable.length(), 0);
            QuoteStyleSpan quoteStyleSpan = new QuoteStyleSpan();
            QuoteSpan quoteSpan = new QuoteSpan(false, z, quoteStyleSpan);
            quoteStyleSpan.span = quoteSpan;
            quoteSpan.start = iClamp;
            quoteSpan.end = iClamp2;
            spannable.setSpan(quoteStyleSpan, iClamp, iClamp2, 33);
            spannable.setSpan(quoteSpan, iClamp, iClamp2, 33);
        }
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

    public static ArrayList updateQuoteBlocks(EditTextEffects editTextEffects, Layout layout, ArrayList arrayList, boolean[] zArr) {
        boolean z;
        int lineStart;
        int i;
        boolean z2;
        int i2;
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spannable)) {
                Spannable spannable = (Spannable) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spannable.getSpans(0, spannable.length(), QuoteSpan.class);
                ArrayList arrayList2 = arrayList;
                int i3 = 0;
                while (i3 < quoteSpanArr.length) {
                    QuoteSpan quoteSpan = quoteSpanArr[i3];
                    boolean z3 = quoteSpan.last;
                    Block block = new Block(editTextEffects, layout, spannable, quoteSpan);
                    if (quoteSpan.edit) {
                        int i4 = quoteSpan.start;
                        if (i4 == 0 || text.charAt(i4 - 1) == '\n') {
                            if (quoteSpan.end != text.length() && text.charAt(quoteSpan.end) != '\n') {
                                int i5 = quoteSpan.end;
                                while (i5 <= text.length() && i5 != text.length() && text.charAt(i5) != '\n') {
                                    i5++;
                                }
                                spannable.removeSpan(quoteSpanArr[i3]);
                                spannable.removeSpan(quoteSpanArr[i3].styleSpan);
                                QuoteSpan quoteSpan2 = quoteSpanArr[i3];
                                QuoteSpan quoteSpan3 = block.span;
                                spannable.setSpan(quoteSpan2, quoteSpan3.start, i5, 33);
                                spannable.setSpan(quoteSpanArr[i3].styleSpan, quoteSpan3.start, i5, 33);
                                block = new Block(editTextEffects, layout, spannable, quoteSpanArr[i3]);
                            }
                            boolean z4 = spannable instanceof SpannableStringBuilder;
                            QuoteSpan quoteSpan4 = block.span;
                            if (z4) {
                                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannable;
                                int i6 = quoteSpan4.end - 1;
                                boolean z5 = i6 >= 0 && spannableStringBuilder.charAt(i6) == '\n';
                                if (block.hasButton()) {
                                    int i7 = quoteSpan4.end;
                                    if (i7 - 2 >= 0) {
                                        z = true;
                                        float lineRight = layout.getLineRight(layout.getLineForOffset(i7 - 1)) - AndroidUtilities.dp(12.0f);
                                        QuoteCollapseButton quoteCollapseButton = quoteSpan4.collapseButton;
                                        z2 = lineRight > ((float) (block.width - (quoteCollapseButton != null ? RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 3.333f, AndroidUtilities.dp(23.66f) + quoteCollapseButton.textWidth) : RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 3.333f, AndroidUtilities.dp(23.66f)))));
                                    } else {
                                        z = true;
                                    }
                                } else {
                                    z = true;
                                }
                                if (z5 != z2) {
                                    int i8 = quoteSpan4.end;
                                    if (z5) {
                                        i2 = i8 - 1;
                                        spannableStringBuilder.delete(i8 - 1, i8);
                                        text = text;
                                        quoteSpanArr = quoteSpanArr;
                                    } else {
                                        i2 = i8 + 2;
                                        boolean z6 = Selection.getSelectionStart(spannableStringBuilder) == quoteSpan4.end && Selection.getSelectionStart(spannableStringBuilder) == Selection.getSelectionEnd(spannableStringBuilder);
                                        int i9 = quoteSpan4.end;
                                        if (quoteSpan4.newline == null) {
                                            SpannableString spannableString = new SpannableString("\n");
                                            quoteSpan4.newline = spannableString;
                                            spannableString.setSpan(new QuoteButtonNewLineSpan(), 0, quoteSpan4.newline.length(), 33);
                                        }
                                        spannableStringBuilder.insert(i9, (CharSequence) quoteSpan4.newline);
                                        if (z6) {
                                            int selectionStart = Selection.getSelectionStart(spannableStringBuilder);
                                            int i10 = quoteSpan4.end;
                                            if (selectionStart != i10) {
                                                Selection.setSelection(spannableStringBuilder, i10, i10);
                                            }
                                        }
                                    }
                                    quoteSpan4.end = Math.min(i2, spannable.length());
                                    spannable.removeSpan(quoteSpanArr[i3]);
                                    spannable.removeSpan(quoteSpanArr[i3].styleSpan);
                                    spannable.setSpan(quoteSpanArr[i3], quoteSpan4.start, quoteSpan4.end, 33);
                                    spannable.setSpan(quoteSpanArr[i3].styleSpan, quoteSpan4.start, quoteSpan4.end, 33);
                                    if (zArr != null) {
                                        zArr[0] = z;
                                    }
                                } else {
                                    text = text;
                                    quoteSpanArr = quoteSpanArr;
                                }
                            } else {
                                text = text;
                                quoteSpanArr = quoteSpanArr;
                                z = true;
                            }
                            RichTextCell.CollapsedTextPart collapsedTextPart = quoteSpan4.collapsedSpan;
                            if (collapsedTextPart != null) {
                                spannable.removeSpan(collapsedTextPart);
                            }
                            if (quoteSpan4.isCollapsing && (lineStart = layout.getLineStart(Math.min(layout.getLineForOffset(quoteSpan4.start) + 3, layout.getLineCount()))) < (i = quoteSpan4.end)) {
                                if (quoteSpan4.collapsedSpan == null) {
                                    quoteSpan4.collapsedSpan = new RichTextCell.CollapsedTextPart(quoteSpan4);
                                }
                                spannable.setSpan(quoteSpan4.collapsedSpan, lineStart, i, 33);
                            }
                        } else {
                            spannable.removeSpan(quoteSpanArr[i3]);
                            spannable.removeSpan(quoteSpanArr[i3].styleSpan);
                            RichTextCell.CollapsedTextPart collapsedTextPart2 = quoteSpanArr[i3].collapsedSpan;
                            if (collapsedTextPart2 != null) {
                                spannable.removeSpan(collapsedTextPart2);
                            }
                            text = text;
                            quoteSpanArr = quoteSpanArr;
                        }
                        i3++;
                        text = text;
                        quoteSpanArr = quoteSpanArr;
                    } else {
                        text = text;
                        quoteSpanArr = quoteSpanArr;
                        z = true;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (quoteSpanArr[i3].last != z3 && zArr != null) {
                        zArr[0] = z;
                    }
                    arrayList2.add(block);
                    i3++;
                    text = text;
                    quoteSpanArr = quoteSpanArr;
                }
                return arrayList2;
            }
            if (arrayList != null) {
                arrayList.clear();
            }
        } else if (arrayList != null) {
            arrayList.clear();
            return arrayList;
        }
        return arrayList;
    }

    public static ArrayList updateQuoteBlocksSpanned(Layout layout, ArrayList arrayList) {
        if (layout != null) {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spanned)) {
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
            if (arrayList != null) {
                arrayList.clear();
            }
        } else if (arrayList != null) {
            arrayList.clear();
            return arrayList;
        }
        return arrayList;
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }

    @Override
    public final int getLeadingMargin(boolean z) {
        return AndroidUtilities.dp(this.adaptLineHeight ? 8.0f : 10.0f);
    }
}
