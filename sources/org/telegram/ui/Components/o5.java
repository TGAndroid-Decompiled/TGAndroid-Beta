package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class o5 extends Drawable {
    public final Drawable f26986a;
    public final int f26987b;
    public final int f26988c;
    public int d = 255;

    public o5(int i10, int i11, Drawable drawable) {
        this.f26986a = drawable;
        this.f26987b = i10;
        this.f26988c = i11;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f26986a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f26988c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26987b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f26986a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
        Drawable drawable = this.f26986a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f26986a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
