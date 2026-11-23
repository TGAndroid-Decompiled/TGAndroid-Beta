package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class o5 extends Drawable {
    public final Drawable f38104a;
    public final int f38105b;
    public final int f38106c;
    public int d = 255;

    public o5(int i7, int i10, Drawable drawable) {
        this.f38104a = drawable;
        this.f38105b = i7;
        this.f38106c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f38104a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f38106c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f38105b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f38104a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
        Drawable drawable = this.f38104a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f38104a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
