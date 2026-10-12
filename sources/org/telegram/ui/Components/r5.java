package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class r5 extends Drawable {
    public final Drawable f30031a;
    public final int f30032b;
    public final int f30033c;
    public int d = 255;

    public r5(int i10, int i11, Drawable drawable) {
        this.f30031a = drawable;
        this.f30032b = i10;
        this.f30033c = i11;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f30031a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f30033c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f30032b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f30031a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
        Drawable drawable = this.f30031a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f30031a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
