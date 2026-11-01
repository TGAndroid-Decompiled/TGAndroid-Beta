package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class lv extends Drawable {
    public final int f28290a;
    public RectF f28291b;
    public Paint f28292c;

    public lv(int i10, byte b10) {
        this.f28290a = i10;
        switch (i10) {
            case 2:
                return;
            default:
                this.f28291b = new RectF();
                this.f28292c = new Paint(1);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f28290a) {
            case 0:
                RectF rectF = this.f28291b;
                rectF.set(0.0f, 0.0f, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(8.0f), org.telegram.messenger.i0.N(8.0f), this.f28292c);
                return;
            case 1:
                RectF rectF2 = this.f28291b;
                rectF2.set(getBounds());
                float height = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, height, height, this.f28292c);
                return;
            default:
                RectF rectF3 = this.f28291b;
                rectF3.set(getBounds());
                rectF3.inset(0.0f, (rectF3.height() - org.telegram.messenger.i0.L(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.f28292c);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f28290a) {
            case 0:
                return -3;
            case 1:
                return -3;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28290a) {
            case 0:
                this.f28292c.setAlpha(i10);
                return;
            case 1:
                this.f28292c.setAlpha(i10);
                return;
            default:
                this.f28292c.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f28290a) {
            case 0:
                return;
            case 1:
                this.f28292c.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public lv(int i10) {
        this.f28290a = 0;
        Paint paint = new Paint();
        this.f28292c = paint;
        this.f28291b = new RectF();
        paint.setAlpha(45);
        paint.setColor(i10);
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
