package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class m0 extends Drawable {
    public final int f21197a;
    public Object f21198b;
    public int f21199c;

    public m0(int i10) {
        this.f21197a = i10;
        switch (i10) {
            case 2:
                this.f21199c = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f21197a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, (Paint) this.f21198b);
                return;
            case 1:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f21198b);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f21197a) {
            case 2:
                return this.f21199c;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f21197a) {
            case 2:
                return (ColorFilter) this.f21198b;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f21197a) {
            case 1:
                return this.f21199c;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f21197a) {
            case 1:
                return this.f21199c;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f21197a) {
            case 0:
                return -2;
            case 1:
                return -2;
            default:
                return -1;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f21197a) {
            case 0:
                ((Paint) this.f21198b).setAlpha(org.telegram.ui.ActionBar.g6.m1(i10 / 255.0f, this.f21199c));
                return;
            case 1:
                ((Paint) this.f21198b).setAlpha(i10);
                return;
            default:
                this.f21199c = i10;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f21197a) {
            case 0:
                ((Paint) this.f21198b).setColorFilter(colorFilter);
                return;
            case 1:
                return;
            default:
                this.f21198b = colorFilter;
                return;
        }
    }

    public m0(Paint paint, int i10) {
        this.f21197a = 0;
        this.f21198b = paint;
        this.f21199c = i10;
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
