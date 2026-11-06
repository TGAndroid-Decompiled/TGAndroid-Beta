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
    public final RectF f33985a = new RectF();
    public final Paint f33986b;
    public final TextPaint f33987c;
    public int d;
    public String f33988e;
    public final int f33989f;
    public int f33990g;
    public final int h;

    public gk0(int i7) {
        Paint paint = new Paint(1);
        this.f33986b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f33987c = textPaint;
        this.f33990g = 255;
        this.h = 255;
        this.f33989f = i7;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (i7 == 0) {
            this.f33988e = org.telegram.messenger.hd.M0(2131745863, null);
        } else {
            this.f33988e = org.telegram.messenger.hd.M0(2131750844, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f33988e));
    }

    public final void a() {
        String M0;
        if (this.f33989f == 0) {
            M0 = org.telegram.messenger.hd.M0(2131745863, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131750844, null);
        }
        if (!M0.equals(this.f33988e)) {
            this.f33988e = M0;
            this.d = (int) Math.ceil(this.f33987c.measureText(M0));
        }
    }

    public final void b(int i7) {
        this.f33987c.setColor(i7);
        this.f33986b.setColor(i7);
        this.f33990g = Color.alpha(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f33985a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), this.f33986b);
        canvas.drawText(this.f33988e, rectF.left + org.telegram.messenger.g0.L(5.0f), rectF.top + org.telegram.messenger.g0.L(12.0f), this.f33987c);
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
            int i10 = (int) ((i7 / 255.0f) * this.f33990g);
            this.f33986b.setAlpha(i10);
            this.f33987c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
