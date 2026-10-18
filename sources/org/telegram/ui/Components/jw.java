package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class jw extends Drawable {
    public final int f27613a;
    public RectF f27614b;
    public Paint f27615c;

    public jw(int i10, byte b10) {
        this.f27613a = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f27613a) {
            case 0:
                RectF rectF = this.f27614b;
                rectF.set(0.0f, 0.0f, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(8.0f), this.f27615c);
                return;
            case 1:
                RectF rectF2 = this.f27614b;
                rectF2.set(getBounds());
                float height = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, height, height, this.f27615c);
                return;
            case 2:
                RectF rectF3 = this.f27614b;
                rectF3.set(getBounds());
                rectF3.inset(AndroidUtilities.dp(1.0f), (rectF3.height() - AndroidUtilities.dp(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f27615c);
                return;
            default:
                RectF rectF4 = this.f27614b;
                rectF4.set(getBounds());
                rectF4.inset(0.0f, (rectF4.height() - AndroidUtilities.dp(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f27615c);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f27613a) {
            case 0:
                return -3;
            case 1:
                return -3;
            case 2:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f27613a) {
            case 0:
                this.f27615c.setAlpha(i10);
                return;
            case 1:
                this.f27615c.setAlpha(i10);
                return;
            case 2:
                this.f27615c.setAlpha(i10);
                return;
            default:
                this.f27615c.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f27613a) {
            case 0:
                return;
            case 1:
                this.f27615c.setColorFilter(colorFilter);
                return;
            case 2:
            default:
                return;
        }
    }

    public jw() {
        this.f27613a = 1;
        this.f27614b = new RectF();
        this.f27615c = new Paint(1);
    }

    public jw(int i10) {
        this.f27613a = 0;
        Paint paint = new Paint();
        this.f27615c = paint;
        this.f27614b = new RectF();
        paint.setAlpha(45);
        paint.setColor(i10);
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
