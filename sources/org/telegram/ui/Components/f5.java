package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class f5 extends Drawable {
    public final Drawable f33703a;
    public final int f33704b;
    public final int f33705c;
    public int d = 255;

    public f5(int i3, int i10, Drawable drawable) {
        this.f33703a = drawable;
        this.f33704b = i3;
        this.f33705c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f33703a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f33705c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f33704b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f33703a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.d = i3;
        Drawable drawable = this.f33703a;
        if (drawable != null) {
            drawable.setAlpha(i3);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f33703a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
