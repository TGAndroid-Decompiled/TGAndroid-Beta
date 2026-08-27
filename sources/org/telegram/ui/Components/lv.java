package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class lv extends Drawable {

    public final int f30471a;

    public RectF f30472b;

    public Paint f30473c;

    public lv(int i10, byte b10) {
        this.f30471a = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f30471a) {
            case 0:
                RectF rectF = this.f30472b;
                rectF.set(0.0f, 0.0f, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(8.0f), this.f30473c);
                break;
            case 1:
                RectF rectF2 = this.f30472b;
                rectF2.set(getBounds());
                float fHeight = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, fHeight, fHeight, this.f30473c);
                break;
            case 2:
                RectF rectF3 = this.f30472b;
                rectF3.set(getBounds());
                rectF3.inset(AndroidUtilities.dp(1.0f), (rectF3.height() - AndroidUtilities.dp(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f30473c);
                break;
            default:
                RectF rectF4 = this.f30472b;
                rectF4.set(getBounds());
                rectF4.inset(0.0f, (rectF4.height() - AndroidUtilities.dp(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f30473c);
                break;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f30471a) {
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
        switch (this.f30471a) {
            case 0:
                this.f30473c.setAlpha(i10);
                break;
            case 1:
                this.f30473c.setAlpha(i10);
                break;
            case 2:
                this.f30473c.setAlpha(i10);
                break;
            default:
                this.f30473c.setAlpha(i10);
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f30471a) {
            case 1:
                this.f30473c.setColorFilter(colorFilter);
                break;
        }
    }

    public lv() {
        this.f30471a = 1;
        this.f30472b = new RectF();
        this.f30473c = new Paint(1);
    }

    public lv(int i10) {
        this.f30471a = 0;
        Paint paint = new Paint();
        this.f30473c = paint;
        this.f30472b = new RectF();
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
