package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class gk0 extends Drawable {
    public final RectF f33933a = new RectF();
    public final Paint f33934b;
    public final TextPaint f33935c;
    public int d;
    public String f33936e;
    public final int f33937f;
    public int f33938g;
    public final int h;

    public gk0(int i7) {
        Paint paint = new Paint(1);
        this.f33934b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f33935c = textPaint;
        this.f33938g = 255;
        this.h = 255;
        this.f33937f = i7;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (i7 == 0) {
            this.f33936e = org.telegram.messenger.hd.M0(2131745863, null);
        } else {
            this.f33936e = org.telegram.messenger.hd.M0(2131750844, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f33936e));
    }

    public final void a() {
        String M0;
        if (this.f33937f == 0) {
            M0 = org.telegram.messenger.hd.M0(2131745863, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131750844, null);
        }
        if (!M0.equals(this.f33936e)) {
            this.f33936e = M0;
            this.d = (int) Math.ceil(this.f33935c.measureText(M0));
        }
    }

    public final void b(int i7) {
        this.f33935c.setColor(i7);
        this.f33934b.setColor(i7);
        this.f33938g = Color.alpha(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f33933a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), this.f33934b);
        canvas.drawText(this.f33936e, rectF.left + org.telegram.messenger.g0.L(5.0f), rectF.top + org.telegram.messenger.g0.L(12.0f), this.f33935c);
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
    public final void setAlpha(int i7) {
        if (this.h != i7) {
            int i10 = (int) ((i7 / 255.0f) * this.f33938g);
            this.f33934b.setAlpha(i10);
            this.f33935c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
