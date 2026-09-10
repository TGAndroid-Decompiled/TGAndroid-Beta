package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class m0 extends Drawable {
    public final int f19509a;
    public Object f19510b;
    public int f19511c;

    public m0(int i10) {
        this.f19509a = i10;
        switch (i10) {
            case 2:
                this.f19511c = 255;
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f19509a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, (Paint) this.f19510b);
                return;
            case 1:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.f19510b);
                return;
            default:
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f19509a) {
            case 2:
                return this.f19511c;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        switch (this.f19509a) {
            case 2:
                return (ColorFilter) this.f19510b;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f19509a) {
            case 1:
                return this.f19511c;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f19509a) {
            case 1:
                return this.f19511c;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f19509a) {
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
        switch (this.f19509a) {
            case 0:
                ((Paint) this.f19510b).setAlpha(org.telegram.ui.ActionBar.j6.l1(i10 / 255.0f, this.f19511c));
                return;
            case 1:
                ((Paint) this.f19510b).setAlpha(i10);
                return;
            default:
                this.f19511c = i10;
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f19509a) {
            case 0:
                ((Paint) this.f19510b).setColorFilter(colorFilter);
                return;
            case 1:
                return;
            default:
                this.f19510b = colorFilter;
                return;
        }
    }

    public m0(Paint paint, int i10) {
        this.f19509a = 0;
        this.f19510b = paint;
        this.f19511c = i10;
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
