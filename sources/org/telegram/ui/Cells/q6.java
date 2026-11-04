package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class q6 extends Drawable {
    public final int f30217a;
    public int f30218b;
    public Object f30219c;

    public q6(int i3) {
        this.f30217a = i3;
        switch (i3) {
            case 1:
                this.f30218b = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f30217a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f30219c);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f30217a) {
            case 1:
                return this.f30218b;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f30217a) {
            case 1:
                return (ColorFilter) this.f30219c;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f30217a) {
            case 0:
                return this.f30218b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f30217a) {
            case 0:
                return this.f30218b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f30217a) {
            case 0:
                return -2;
            default:
                return -1;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        switch (this.f30217a) {
            case 0:
                ((Paint) this.f30219c).setAlpha(i3);
                return;
            default:
                this.f30218b = i3;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f30217a) {
            case 0:
                return;
            default:
                this.f30219c = colorFilter;
                return;
        }
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
