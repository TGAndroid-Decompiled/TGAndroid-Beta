package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
public final class ny extends ImageSpan {
    public int f48142a;

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        if (paint.getColor() != this.f48142a && getDrawable() != null) {
            Drawable drawable = getDrawable();
            int color = paint.getColor();
            this.f48142a = color;
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        }
        super.draw(canvas, charSequence, i3, i10, f10, i11, i12, i13, paint);
    }
}
