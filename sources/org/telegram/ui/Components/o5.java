package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class o5 extends Drawable {
    public final Drawable f31257a;
    public final int f31258b;
    public final int f31259c;
    public int d = 255;

    public o5(int i10, int i11, Drawable drawable) {
        this.f31257a = drawable;
        this.f31258b = i10;
        this.f31259c = i11;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f31257a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f31259c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f31258b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f31257a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
        Drawable drawable = this.f31257a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f31257a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
