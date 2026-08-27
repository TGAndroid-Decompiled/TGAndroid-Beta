package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class m0 extends Drawable {

    public final int f24647a;

    public Object f24648b;

    public int f24649c;

    public m0(int i10) {
        this.f24647a = i10;
        switch (i10) {
            case 2:
                this.f24649c = 255;
                break;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f24647a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, (Paint) this.f24648b);
                break;
            case 1:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f24648b);
                break;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f24647a) {
            case 2:
                return this.f24649c;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f24647a) {
            case 2:
                return (ColorFilter) this.f24648b;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f24647a) {
            case 1:
                return this.f24649c;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f24647a) {
            case 1:
                return this.f24649c;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f24647a) {
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
        switch (this.f24647a) {
            case 0:
                ((Paint) this.f24648b).setAlpha(org.telegram.ui.ActionBar.g6.l1(i10 / 255.0f, this.f24649c));
                break;
            case 1:
                ((Paint) this.f24648b).setAlpha(i10);
                break;
            default:
                this.f24649c = i10;
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f24647a) {
            case 0:
                ((Paint) this.f24648b).setColorFilter(colorFilter);
                break;
            case 1:
                break;
            default:
                this.f24648b = colorFilter;
                break;
        }
    }

    public m0(Paint paint, int i10) {
        this.f24647a = 0;
        this.f24648b = paint;
        this.f24649c = i10;
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
