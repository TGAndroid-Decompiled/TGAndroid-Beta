package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class fv extends Drawable {
    public final int f34702a;
    public RectF f34703b;
    public Paint f34704c;

    public fv(int i7, byte b10) {
        this.f34702a = i7;
        switch (i7) {
            case 2:
                return;
            default:
                this.f34703b = new RectF();
                this.f34704c = new Paint(1);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f34702a) {
            case 0:
                RectF rectF = this.f34703b;
                rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f), this.f34704c);
                return;
            case 1:
                RectF rectF2 = this.f34703b;
                rectF2.set(getBounds());
                float height = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, height, height, this.f34704c);
                return;
            default:
                RectF rectF3 = this.f34703b;
                rectF3.set(getBounds());
                rectF3.inset(0.0f, (rectF3.height() - org.telegram.messenger.g0.L(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f34704c);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f34702a) {
            case 0:
                return -3;
            case 1:
                return -3;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f34702a) {
            case 0:
                this.f34704c.setAlpha(i7);
                return;
            case 1:
                this.f34704c.setAlpha(i7);
                return;
            default:
                this.f34704c.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f34702a) {
            case 0:
                return;
            case 1:
                this.f34704c.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public fv(int i7) {
        this.f34702a = 0;
        Paint paint = new Paint();
        this.f34704c = paint;
        this.f34703b = new RectF();
        paint.setAlpha(45);
        paint.setColor(i7);
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
