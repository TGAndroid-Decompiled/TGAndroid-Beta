package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class k5 extends Drawable {
    public final Drawable f28271a;
    public final int f28272b;
    public final int f28273c;
    public int d = 255;

    public k5(int i10, int i11, Drawable drawable) {
        this.f28271a = drawable;
        this.f28272b = i10;
        this.f28273c = i11;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f28271a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f28273c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f28272b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f28271a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
        Drawable drawable = this.f28271a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f28271a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
