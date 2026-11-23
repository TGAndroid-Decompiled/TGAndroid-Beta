package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class s6 extends Drawable {
    public final int f31797a;
    public int f31798b;
    public Object f31799c;

    public s6(int i7) {
        this.f31797a = i7;
        switch (i7) {
            case 1:
                this.f31798b = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f31797a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f31799c);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f31797a) {
            case 1:
                return this.f31798b;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f31797a) {
            case 1:
                return (ColorFilter) this.f31799c;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f31797a) {
            case 0:
                return this.f31798b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f31797a) {
            case 0:
                return this.f31798b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f31797a) {
            case 0:
                return -2;
            default:
                return -1;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f31797a) {
            case 0:
                ((Paint) this.f31799c).setAlpha(i7);
                return;
            default:
                this.f31798b = i7;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f31797a) {
            case 0:
                return;
            default:
                this.f31799c = colorFilter;
                return;
        }
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
