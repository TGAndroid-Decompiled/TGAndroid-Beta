package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class r6 extends Drawable {
    public final int f30197a;
    public int f30198b;
    public Object f30199c;

    public r6(int i7) {
        this.f30197a = i7;
        switch (i7) {
            case 1:
                this.f30198b = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f30197a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f30199c);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f30197a) {
            case 1:
                return this.f30198b;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f30197a) {
            case 1:
                return (ColorFilter) this.f30199c;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f30197a) {
            case 0:
                return this.f30198b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f30197a) {
            case 0:
                return this.f30198b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f30197a) {
            case 0:
                return -2;
            default:
                return -1;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f30197a) {
            case 0:
                ((Paint) this.f30199c).setAlpha(i7);
                return;
            default:
                this.f30198b = i7;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f30197a) {
            case 0:
                return;
            default:
                this.f30199c = colorFilter;
                return;
        }
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
