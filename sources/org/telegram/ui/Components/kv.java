package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class kv extends Drawable {
    public final int f36895a;
    public RectF f36896b;
    public Paint f36897c;

    public kv(int i7, byte b10) {
        this.f36895a = i7;
        switch (i7) {
            case 2:
                return;
            default:
                this.f36896b = new RectF();
                this.f36897c = new Paint(1);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f36895a) {
            case 0:
                RectF rectF = this.f36896b;
                rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f), this.f36897c);
                return;
            case 1:
                RectF rectF2 = this.f36896b;
                rectF2.set(getBounds());
                float height = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, height, height, this.f36897c);
                return;
            default:
                RectF rectF3 = this.f36896b;
                rectF3.set(getBounds());
                rectF3.inset(0.0f, (rectF3.height() - org.telegram.messenger.g0.L(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f36897c);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f36895a) {
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
        switch (this.f36895a) {
            case 0:
                this.f36897c.setAlpha(i7);
                return;
            case 1:
                this.f36897c.setAlpha(i7);
                return;
            default:
                this.f36897c.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f36895a) {
            case 0:
                return;
            case 1:
                this.f36897c.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public kv(int i7) {
        this.f36895a = 0;
        Paint paint = new Paint();
        this.f36897c = paint;
        this.f36896b = new RectF();
        paint.setAlpha(45);
        paint.setColor(i7);
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
