package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public class j5 extends Drawable {

    public final Drawable f29591a;

    public final int f29592b;

    public final int f29593c;
    public int d = 255;

    public j5(int i10, int i11, Drawable drawable) {
        this.f29591a = drawable;
        this.f29592b = i10;
        this.f29593c = i11;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f29591a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f29593c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29592b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f29591a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
        Drawable drawable = this.f29591a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29591a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
