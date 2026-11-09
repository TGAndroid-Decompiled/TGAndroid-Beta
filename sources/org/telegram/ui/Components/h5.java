package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class h5 extends Drawable {
    public final Drawable f34205a;
    public final int f34206b;
    public final int f34207c;
    public int d = 255;

    public h5(int i7, int i10, Drawable drawable) {
        this.f34205a = drawable;
        this.f34206b = i7;
        this.f34207c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f34205a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34207c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34206b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f34205a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
        Drawable drawable = this.f34205a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34205a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
