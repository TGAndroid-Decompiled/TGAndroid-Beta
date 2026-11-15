package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class f5 extends Drawable {
    public final Drawable f34519a;
    public final int f34520b;
    public final int f34521c;
    public int d = 255;

    public f5(int i7, int i10, Drawable drawable) {
        this.f34519a = drawable;
        this.f34520b = i7;
        this.f34521c = i10;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f34519a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34521c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34520b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f34519a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
        Drawable drawable = this.f34519a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34519a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
