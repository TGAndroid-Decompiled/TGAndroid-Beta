package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class m0 extends Drawable {
    public final int f21342a;
    public Object f21343b;
    public int f21344c;

    public m0(int i10) {
        this.f21342a = i10;
        switch (i10) {
            case 2:
                this.f21344c = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f21342a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, (Paint) this.f21343b);
                return;
            case 1:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f21343b);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f21342a) {
            case 2:
                return this.f21344c;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f21342a) {
            case 2:
                return (ColorFilter) this.f21343b;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f21342a) {
            case 1:
                return this.f21344c;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f21342a) {
            case 1:
                return this.f21344c;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f21342a) {
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
        switch (this.f21342a) {
            case 0:
                ((Paint) this.f21343b).setAlpha(org.telegram.ui.ActionBar.j6.l1(i10 / 255.0f, this.f21344c));
                return;
            case 1:
                ((Paint) this.f21343b).setAlpha(i10);
                return;
            default:
                this.f21344c = i10;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f21342a) {
            case 0:
                ((Paint) this.f21343b).setColorFilter(colorFilter);
                return;
            case 1:
                return;
            default:
                this.f21343b = colorFilter;
                return;
        }
    }

    public m0(Paint paint, int i10) {
        this.f21342a = 0;
        this.f21343b = paint;
        this.f21344c = i10;
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
