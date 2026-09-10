package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class o5 extends Drawable {
    public final Drawable f25672a;
    public final int f25673b;
    public final int f25674c;
    public int d = 255;

    public o5(int i10, int i11, Drawable drawable) {
        this.f25672a = drawable;
        this.f25673b = i10;
        this.f25674c = i11;
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.f25672a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25674c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25673b;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f25672a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
        Drawable drawable = this.f25672a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25672a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
