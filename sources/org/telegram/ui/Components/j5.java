package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class j5 extends Drawable {
    public final Drawable f29635a;
    public final int f29636b;
    public final int f29637c;
    public int d = 255;

    public j5(int i9, int i10, Drawable drawable) {
        this.f29635a = drawable;
        this.f29636b = i9;
        this.f29637c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f29635a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f29637c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29636b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f29635a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.d = i9;
        Drawable drawable = this.f29635a;
        if (drawable != null) {
            drawable.setAlpha(i9);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29635a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
