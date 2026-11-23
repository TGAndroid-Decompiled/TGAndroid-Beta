package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class o5 extends Drawable {
    public final Drawable f38105a;
    public final int f38106b;
    public final int f38107c;
    public int d = 255;

    public o5(int i7, int i10, Drawable drawable) {
        this.f38105a = drawable;
        this.f38106b = i7;
        this.f38107c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f38105a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f38107c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f38106b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f38105a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
        Drawable drawable = this.f38105a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f38105a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
