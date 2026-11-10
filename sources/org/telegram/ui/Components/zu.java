package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class zu extends Drawable {
    public final int f41119a;
    public RectF f41120b;
    public Paint f41121c;

    public zu(int i7, byte b10) {
        this.f41119a = i7;
        switch (i7) {
            case 2:
                return;
            default:
                this.f41120b = new RectF();
                this.f41121c = new Paint(1);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f41119a) {
            case 0:
                RectF rectF = this.f41120b;
                rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f), this.f41121c);
                return;
            case 1:
                RectF rectF2 = this.f41120b;
                rectF2.set(getBounds());
                float height = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, height, height, this.f41121c);
                return;
            default:
                RectF rectF3 = this.f41120b;
                rectF3.set(getBounds());
                rectF3.inset(0.0f, (rectF3.height() - org.telegram.messenger.g0.L(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f41121c);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f41119a) {
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
        switch (this.f41119a) {
            case 0:
                this.f41121c.setAlpha(i7);
                return;
            case 1:
                this.f41121c.setAlpha(i7);
                return;
            default:
                this.f41121c.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f41119a) {
            case 0:
                return;
            case 1:
                this.f41121c.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public zu(int i7) {
        this.f41119a = 0;
        Paint paint = new Paint();
        this.f41121c = paint;
        this.f41120b = new RectF();
        paint.setAlpha(45);
        paint.setColor(i7);
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
