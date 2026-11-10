package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class g5 extends Drawable {
    public final Drawable f33799a;
    public final int f33800b;
    public final int f33801c;
    public int d = 255;

    public g5(int i7, int i10, Drawable drawable) {
        this.f33799a = drawable;
        this.f33800b = i7;
        this.f33801c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f33799a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f33801c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f33800b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f33799a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
        Drawable drawable = this.f33799a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f33799a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
