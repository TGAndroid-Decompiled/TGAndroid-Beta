package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class h5 extends Drawable {
    public final Drawable f34174a;
    public final int f34175b;
    public final int f34176c;
    public int d = 255;

    public h5(int i7, int i10, Drawable drawable) {
        this.f34174a = drawable;
        this.f34175b = i7;
        this.f34176c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f34174a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34176c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34175b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f34174a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
        Drawable drawable = this.f34174a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34174a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
