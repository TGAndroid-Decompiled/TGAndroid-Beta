package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public final class MathSpan extends ReplacementSpan {
    public static final int $r8$clinit = 0;
    public final Bitmap bitmap;
    public final int depth;
    public final int height;
    public final Paint paint;
    public final String source;
    public final int width;

    public MathSpan(String str, Bitmap bitmap, int i, int i2, int i3, int i4) {
        Paint paint = new Paint(3);
        this.paint = paint;
        this.source = str;
        this.bitmap = bitmap;
        this.width = i;
        this.height = i2;
        this.depth = i4;
        paint.setColor(i3);
    }

    public static MathSpan create(String str, int i, float f) {
        Latex latexRender;
        if (str == null || str.isEmpty() || (latexRender = Latex.render(str, f, true)) == null) {
            return null;
        }
        return new MathSpan(str, (Bitmap) latexRender.bitmap, latexRender.width, latexRender.height, i, latexRender.depth);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return;
        }
        Paint paint2 = this.paint;
        paint2.setColor(paint.getColor());
        canvas.drawBitmap(bitmap, f, i4 - (this.height - this.depth), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = this.height;
            int i4 = this.depth;
            int i5 = -(i3 - i4);
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
            fontMetricsInt.descent = i4;
            fontMetricsInt.bottom = i4;
        }
        return this.width;
    }
}
