package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class y6 extends Drawable {
    public final int f25761a;
    public int f25762b;
    public Object f25763c;

    public y6(int i10) {
        this.f25761a = i10;
        switch (i10) {
            case 1:
                this.f25762b = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f25761a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f25763c);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f25761a) {
            case 1:
                return this.f25762b;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f25761a) {
            case 1:
                return (ColorFilter) this.f25763c;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f25761a) {
            case 0:
                return this.f25762b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f25761a) {
            case 0:
                return this.f25762b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f25761a) {
            case 0:
                return -2;
            default:
                return -1;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f25761a) {
            case 0:
                ((Paint) this.f25763c).setAlpha(i10);
                return;
            default:
                this.f25762b = i10;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f25761a) {
            case 0:
                return;
            default:
                this.f25763c = colorFilter;
                return;
        }
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
