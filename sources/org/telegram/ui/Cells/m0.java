package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class m0 extends Drawable {
    public final int f22448a;
    public Object f22449b;
    public int f22450c;

    public m0(int i10) {
        this.f22448a = i10;
        switch (i10) {
            case 2:
                this.f22450c = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f22448a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, (Paint) this.f22449b);
                return;
            case 1:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f22449b);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f22448a) {
            case 2:
                return this.f22450c;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f22448a) {
            case 2:
                return (ColorFilter) this.f22449b;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f22448a) {
            case 1:
                return this.f22450c;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f22448a) {
            case 1:
                return this.f22450c;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f22448a) {
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
        switch (this.f22448a) {
            case 0:
                ((Paint) this.f22449b).setAlpha(org.telegram.ui.ActionBar.i6.l1(i10 / 255.0f, this.f22450c));
                return;
            case 1:
                ((Paint) this.f22449b).setAlpha(i10);
                return;
            default:
                this.f22450c = i10;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f22448a) {
            case 0:
                ((Paint) this.f22449b).setColorFilter(colorFilter);
                return;
            case 1:
                return;
            default:
                this.f22449b = colorFilter;
                return;
        }
    }

    public m0(Paint paint, int i10) {
        this.f22448a = 0;
        this.f22449b = paint;
        this.f22450c = i10;
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
