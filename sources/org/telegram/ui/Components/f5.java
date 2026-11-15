package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class f5 extends Drawable {
    public final Drawable f34520a;
    public final int f34521b;
    public final int f34522c;
    public int d = 255;

    public f5(int i7, int i10, Drawable drawable) {
        this.f34520a = drawable;
        this.f34521b = i7;
        this.f34522c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f34520a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34522c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34521b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f34520a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
        Drawable drawable = this.f34520a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34520a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
