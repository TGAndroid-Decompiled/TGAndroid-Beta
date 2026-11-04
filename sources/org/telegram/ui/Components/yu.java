package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class yu extends Drawable {
    public final int f40834a;
    public RectF f40835b;
    public Paint f40836c;

    public yu(int i3, byte b10) {
        this.f40834a = i3;
        switch (i3) {
            case 2:
                return;
            default:
                this.f40835b = new RectF();
                this.f40836c = new Paint(1);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f40834a) {
            case 0:
                RectF rectF = this.f40835b;
                rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f), this.f40836c);
                return;
            case 1:
                RectF rectF2 = this.f40835b;
                rectF2.set(getBounds());
                float height = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, height, height, this.f40836c);
                return;
            default:
                RectF rectF3 = this.f40835b;
                rectF3.set(getBounds());
                rectF3.inset(0.0f, (rectF3.height() - org.telegram.messenger.g0.L(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f40836c);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f40834a) {
            case 0:
                return -3;
            case 1:
                return -3;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        switch (this.f40834a) {
            case 0:
                this.f40836c.setAlpha(i3);
                return;
            case 1:
                this.f40836c.setAlpha(i3);
                return;
            default:
                this.f40836c.setAlpha(i3);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f40834a) {
            case 0:
                return;
            case 1:
                this.f40836c.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public yu(int i3) {
        this.f40834a = 0;
        Paint paint = new Paint();
        this.f40836c = paint;
        this.f40835b = new RectF();
        paint.setAlpha(45);
        paint.setColor(i3);
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
