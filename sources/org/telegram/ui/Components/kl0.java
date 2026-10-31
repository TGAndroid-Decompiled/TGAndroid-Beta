package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class kl0 extends Drawable {
    public final RectF f27818a = new RectF();
    public final Paint f27819b;
    public final TextPaint f27820c;
    public int d;
    public String e;
    public final int f27821f;
    public int f27822g;
    public final int h;

    public kl0(int i10) {
        Paint paint = new Paint(1);
        this.f27819b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f27820c = textPaint;
        this.f27822g = 255;
        this.h = 255;
        this.f27821f = i10;
        textPaint.setTextSize(org.telegram.messenger.i0.L(11));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        if (i10 == 0) {
            this.e = org.telegram.messenger.cd.L0(2131745879, null);
        } else {
            this.e = org.telegram.messenger.cd.L0(2131750844, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.e));
    }

    public final void a() {
        String L0;
        if (this.f27821f == 0) {
            L0 = org.telegram.messenger.cd.L0(2131745879, null);
        } else {
            L0 = org.telegram.messenger.cd.L0(2131750844, null);
        }
        if (!L0.equals(this.e)) {
            this.e = L0;
            this.d = (int) Math.ceil(this.f27820c.measureText(L0));
        }
    }

    public final void b(int i10) {
        this.f27820c.setColor(i10);
        this.f27819b.setColor(i10);
        this.f27822g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f27818a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), this.f27819b);
        canvas.drawText(this.e, rectF.left + org.telegram.messenger.i0.L(5.0f), rectF.top + org.telegram.messenger.i0.L(12.0f), this.f27820c);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(16.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(10.0f) + this.d;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.h != i10) {
            int i11 = (int) ((i10 / 255.0f) * this.f27822g);
            this.f27819b.setAlpha(i11);
            this.f27820c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
