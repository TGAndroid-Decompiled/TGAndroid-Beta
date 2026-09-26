package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class p5 extends Drawable {
    public final Drawable f27223a;
    public final int f27224b;
    public final int f27225c;
    public int d = 255;

    public p5(int i10, int i11, Drawable drawable) {
        this.f27223a = drawable;
        this.f27224b = i10;
        this.f27225c = i11;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f27223a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f27225c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27224b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f27223a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
        Drawable drawable = this.f27223a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f27223a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
