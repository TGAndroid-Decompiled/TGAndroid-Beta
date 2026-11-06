package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class h5 extends Drawable {
    public final Drawable f34214a;
    public final int f34215b;
    public final int f34216c;
    public int d = 255;

    public h5(int i7, int i10, Drawable drawable) {
        this.f34214a = drawable;
        this.f34215b = i7;
        this.f34216c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f34214a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34216c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34215b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f34214a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
        Drawable drawable = this.f34214a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34214a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
