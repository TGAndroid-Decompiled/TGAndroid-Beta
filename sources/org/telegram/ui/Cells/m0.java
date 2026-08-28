package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class m0 extends Drawable {
    public final int f24683a;
    public Object f24684b;
    public int f24685c;

    public m0(int i9) {
        this.f24683a = i9;
        switch (i9) {
            case 2:
                this.f24685c = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f24683a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, (Paint) this.f24684b);
                return;
            case 1:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f24684b);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f24683a) {
            case 2:
                return this.f24685c;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f24683a) {
            case 2:
                return (ColorFilter) this.f24684b;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f24683a) {
            case 1:
                return this.f24685c;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f24683a) {
            case 1:
                return this.f24685c;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f24683a) {
            case 0:
                return -2;
            case 1:
                return -2;
            default:
                return -1;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        switch (this.f24683a) {
            case 0:
                ((Paint) this.f24684b).setAlpha(org.telegram.ui.ActionBar.f6.l1(i9 / 255.0f, this.f24685c));
                return;
            case 1:
                ((Paint) this.f24684b).setAlpha(i9);
                return;
            default:
                this.f24685c = i9;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f24683a) {
            case 0:
                ((Paint) this.f24684b).setColorFilter(colorFilter);
                return;
            case 1:
                return;
            default:
                this.f24684b = colorFilter;
                return;
        }
    }

    public m0(Paint paint, int i9) {
        this.f24683a = 0;
        this.f24684b = paint;
        this.f24685c = i9;
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
