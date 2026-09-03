package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
public final class j00 extends ImageSpan {
    public int f35061a;

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (paint.getColor() != this.f35061a && getDrawable() != null) {
            Drawable drawable = getDrawable();
            int color = paint.getColor();
            this.f35061a = color;
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        }
        super.draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
    }
}
