package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class u6 extends Drawable {
    public final int f23736a;
    public int f23737b;
    public Object f23738c;

    public u6(int i10) {
        this.f23736a = i10;
        switch (i10) {
            case 1:
                this.f23737b = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f23736a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f23738c);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f23736a) {
            case 1:
                return this.f23737b;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f23736a) {
            case 1:
                return (ColorFilter) this.f23738c;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f23736a) {
            case 0:
                return this.f23737b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f23736a) {
            case 0:
                return this.f23737b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f23736a) {
            case 0:
                return -2;
            default:
                return -1;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f23736a) {
            case 0:
                ((Paint) this.f23738c).setAlpha(i10);
                return;
            default:
                this.f23737b = i10;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f23736a) {
            case 0:
                return;
            default:
                this.f23738c = colorFilter;
                return;
        }
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
