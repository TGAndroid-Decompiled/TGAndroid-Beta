package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class mv extends Drawable {
    public final int f37601a;
    public RectF f37602b;
    public Paint f37603c;

    public mv(int i7, byte b10) {
        this.f37601a = i7;
        switch (i7) {
            case 2:
                return;
            default:
                this.f37602b = new RectF();
                this.f37603c = new Paint(1);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f37601a) {
            case 0:
                RectF rectF = this.f37602b;
                rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f), this.f37603c);
                return;
            case 1:
                RectF rectF2 = this.f37602b;
                rectF2.set(getBounds());
                float height = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, height, height, this.f37603c);
                return;
            default:
                RectF rectF3 = this.f37602b;
                rectF3.set(getBounds());
                rectF3.inset(0.0f, (rectF3.height() - org.telegram.messenger.g0.L(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f37603c);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f37601a) {
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
        switch (this.f37601a) {
            case 0:
                this.f37603c.setAlpha(i7);
                return;
            case 1:
                this.f37603c.setAlpha(i7);
                return;
            default:
                this.f37603c.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f37601a) {
            case 0:
                return;
            case 1:
                this.f37603c.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public mv(int i7) {
        this.f37601a = 0;
        Paint paint = new Paint();
        this.f37603c = paint;
        this.f37602b = new RectF();
        paint.setAlpha(45);
        paint.setColor(i7);
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
