package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class kk0 extends Drawable {
    public final RectF f35427a = new RectF();
    public final Paint f35428b;
    public final TextPaint f35429c;
    public int d;
    public String f35430e;
    public final int f35431f;
    public int f35432g;
    public final int h;

    public kk0(int i3) {
        Paint paint = new Paint(1);
        this.f35428b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f35429c = textPaint;
        this.f35432g = 255;
        this.h = 255;
        this.f35431f = i3;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (i3 == 0) {
            this.f35430e = org.telegram.messenger.bd.M0(2131745872, null);
        } else {
            this.f35430e = org.telegram.messenger.bd.M0(2131750844, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f35430e));
    }

    public final void a() {
        String M0;
        if (this.f35431f == 0) {
            M0 = org.telegram.messenger.bd.M0(2131745872, null);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131750844, null);
        }
        if (!M0.equals(this.f35430e)) {
            this.f35430e = M0;
            this.d = (int) Math.ceil(this.f35429c.measureText(M0));
        }
    }

    public final void b(int i3) {
        this.f35429c.setColor(i3);
        this.f35428b.setColor(i3);
        this.f35432g = Color.alpha(i3);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f35427a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), this.f35428b);
        canvas.drawText(this.f35430e, rectF.left + org.telegram.messenger.g0.L(5.0f), rectF.top + org.telegram.messenger.g0.L(12.0f), this.f35429c);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(10.0f) + this.d;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        if (this.h != i3) {
            int i10 = (int) ((i3 / 255.0f) * this.f35432g);
            this.f35428b.setAlpha(i10);
            this.f35429c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
