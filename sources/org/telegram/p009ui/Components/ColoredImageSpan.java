package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

public class ColoredImageSpan extends ReplacementSpan {
    Drawable drawable;
    int drawableColor;

    public ColoredImageSpan(Drawable drawable) {
        this.drawable = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.drawable.getIntrinsicWidth();
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.drawableColor != paint.getColor()) {
            this.drawableColor = paint.getColor();
            this.drawable.setColorFilter(new PorterDuffColorFilter(this.drawableColor, PorterDuff.Mode.MULTIPLY));
        }
        canvas.save();
        canvas.translate(f, i3 + (((i5 - i3) - this.drawable.getIntrinsicHeight()) / 2));
        this.drawable.draw(canvas);
        canvas.restore();
    }
}
