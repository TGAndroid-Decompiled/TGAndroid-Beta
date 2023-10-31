package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public class QuoteSpan implements LeadingMarginSpan {
    public boolean adaptLineHeight = true;
    private final Paint backgroundPaint;
    private final Path backgroundPath;
    private final float[] backgroundPathRadii;
    private int color;
    public final boolean edit;
    public int end;
    public boolean first;
    public boolean last;
    private final Paint linePaint;
    private final Path linePath;
    private final float[] linePathRadii;
    private final Drawable quoteDrawable;
    public boolean rtl;
    public boolean singleLine;
    public int start;
    public final QuoteStyleSpan styleSpan;

    @Override
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }

    public QuoteSpan(boolean z, QuoteStyleSpan quoteStyleSpan) {
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

    public static int putQuote(Spannable spannable, int i, int i2) {
        if (spannable == null) {
            return -1;
        }
        QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spannable.getSpans(i, i2, QuoteSpan.class);
        if (quoteSpanArr == null || quoteSpanArr.length <= 0) {
            int clamp = Utilities.clamp(i, spannable.length(), 0);
            int clamp2 = Utilities.clamp(i2, spannable.length(), 0);
            QuoteStyleSpan quoteStyleSpan = new QuoteStyleSpan();
            QuoteSpan quoteSpan = new QuoteSpan(false, quoteStyleSpan);
            quoteStyleSpan.span = quoteSpan;
            quoteSpan.start = clamp;
            quoteSpan.end = clamp2;
            spannable.setSpan(quoteStyleSpan, clamp, clamp2, 33);
            spannable.setSpan(quoteSpan, clamp, clamp2, 33);
            return clamp2;
        }
        return -1;
    }

    public static int putQuoteToEditable(Editable editable, int i, int i2) {
        if (editable == null) {
            return -1;
        }
        int clamp = Utilities.clamp(i, editable.length(), 0);
        int clamp2 = Utilities.clamp(i2, editable.length(), 0);
        if (clamp > 0 && editable.charAt(clamp - 1) != '\n') {
            editable.insert(clamp, "\n");
            clamp++;
            clamp2++;
        }
        int i3 = clamp2 + 1;
        if (clamp2 >= editable.length() || editable.charAt(clamp2) != '\n') {
            editable.insert(clamp2, "\n");
        }
        QuoteStyleSpan quoteStyleSpan = new QuoteStyleSpan();
        QuoteSpan quoteSpan = new QuoteSpan(true, quoteStyleSpan);
        quoteStyleSpan.span = quoteSpan;
        quoteSpan.start = clamp;
        quoteSpan.end = clamp2;
        editable.setSpan(quoteSpan, clamp, clamp2, 33);
        editable.setSpan(quoteStyleSpan, clamp, clamp2, 33);
        editable.insert(clamp2, "\ufeff");
        editable.delete(clamp2, i3);
        return i3;
    }

    public static ArrayList<Block> updateQuoteBlocks(Layout layout, ArrayList<Block> arrayList, boolean[] zArr) {
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
        for (int i = 0; i < quoteSpanArr.length; i++) {
            boolean z = quoteSpanArr[i].last;
            Block block = new Block(layout, spannable, quoteSpanArr[i]);
            QuoteSpan quoteSpan = block.span;
            if (quoteSpan.edit) {
                int i2 = quoteSpan.start;
                if (i2 != 0 && text.charAt(i2 - 1) != '\n') {
                    spannable.removeSpan(quoteSpanArr[i]);
                    spannable.removeSpan(quoteSpanArr[i].styleSpan);
                } else if (block.span.end != text.length() && text.charAt(block.span.end) != '\n') {
                    int i3 = block.span.end;
                    while (i3 <= text.length() && i3 != text.length() && text.charAt(i3) != '\n') {
                        i3++;
                    }
                    spannable.removeSpan(quoteSpanArr[i]);
                    spannable.removeSpan(quoteSpanArr[i].styleSpan);
                    spannable.setSpan(quoteSpanArr[i], block.span.start, i3, 33);
                    spannable.setSpan(quoteSpanArr[i].styleSpan, block.span.start, i3, 33);
                    block = new Block(layout, spannable, quoteSpanArr[i]);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (quoteSpanArr[i].last != z && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(block);
        }
        return arrayList;
    }

    public static ArrayList<Block> updateQuoteBlocksSpanned(Layout layout, ArrayList<Block> arrayList) {
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
        QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spanned.getSpans(0, spanned.length(), QuoteSpan.class);
        for (int i = 0; i < quoteSpanArr.length; i++) {
            boolean z = quoteSpanArr[i].last;
            Block block = new Block(layout, spanned, quoteSpanArr[i]);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(block);
        }
        return arrayList;
    }

    public static class Block {
        public final int bottom;
        public final QuoteSpan span;
        public final int top;
        public final int width;

        public Block(Layout layout, Spanned spanned, QuoteSpan quoteSpan) {
            int i;
            int i2;
            this.span = quoteSpan;
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
            float f = 0.0f;
            while (lineForOffset <= lineForOffset2) {
                f = Math.max(f, layout.getLineRight(lineForOffset));
                if (layout.getLineLeft(lineForOffset) > 0.0f) {
                    quoteSpan.rtl = true;
                }
                lineForOffset++;
            }
            this.width = (int) Math.ceil(f);
        }

        public void draw(Canvas canvas, float f, int i, int i2, float f2) {
            QuoteSpan quoteSpan;
            this.span.setColor(i2);
            int dp = this.span.edit ? i : this.width + AndroidUtilities.dp(32.0f);
            double d = i;
            Double.isNaN(d);
            if (dp >= d * 0.95d) {
                dp = i;
            }
            canvas.save();
            canvas.translate(0.0f, f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, this.top, dp, this.bottom);
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
            float dp2 = AndroidUtilities.dp(4.0f);
            fArr7[5] = dp2;
            fArr6[4] = dp2;
            fArr5[3] = dp2;
            fArr4[2] = dp2;
            this.span.backgroundPath.rewind();
            this.span.backgroundPath.addRoundRect(rectF, this.span.backgroundPathRadii, Path.Direction.CW);
            canvas.drawPath(this.span.backgroundPath, this.span.backgroundPaint);
            rectF.set(-AndroidUtilities.dp(3.0f), this.top, 0.0f, this.bottom);
            float[] fArr8 = this.span.linePathRadii;
            float[] fArr9 = this.span.linePathRadii;
            float[] fArr10 = this.span.linePathRadii;
            float[] fArr11 = this.span.linePathRadii;
            float dp3 = AndroidUtilities.dp(4.0f);
            fArr11[7] = dp3;
            fArr10[6] = dp3;
            fArr9[1] = dp3;
            fArr8[0] = dp3;
            float[] fArr12 = this.span.linePathRadii;
            float[] fArr13 = this.span.linePathRadii;
            float[] fArr14 = this.span.linePathRadii;
            this.span.linePathRadii[5] = 0.0f;
            fArr14[4] = 0.0f;
            fArr13[3] = 0.0f;
            fArr12[2] = 0.0f;
            this.span.linePath.rewind();
            this.span.linePath.addRoundRect(rectF, this.span.linePathRadii, Path.Direction.CW);
            canvas.drawPath(this.span.linePath, this.span.linePaint);
            if (!this.span.rtl) {
                int intrinsicHeight = (int) (((this.top + this.bottom) - quoteSpan.quoteDrawable.getIntrinsicHeight()) / 2.0f);
                if (intrinsicHeight > this.top + AndroidUtilities.dp(8.0f)) {
                    intrinsicHeight = this.top + AndroidUtilities.dp(4.0f);
                }
                this.span.quoteDrawable.setBounds((dp - this.span.quoteDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f), intrinsicHeight, dp - AndroidUtilities.dp(4.0f), this.span.quoteDrawable.getIntrinsicHeight() + intrinsicHeight);
                this.span.quoteDrawable.setAlpha((int) (255.0f * f2));
                this.span.quoteDrawable.draw(canvas);
            }
            canvas.restore();
        }
    }
}
