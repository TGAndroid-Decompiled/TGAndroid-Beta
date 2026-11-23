package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class vk0 extends Drawable {
    public final RectF f40811a = new RectF();
    public final Paint f40812b;
    public final TextPaint f40813c;
    public int d;
    public String f40814e;
    public final int f40815f;
    public int f40816g;
    public final int h;

    public vk0(int i7) {
        Paint paint = new Paint(1);
        this.f40812b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f40813c = textPaint;
        this.f40816g = 255;
        this.h = 255;
        this.f40815f = i7;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (i7 == 0) {
            this.f40814e = org.telegram.messenger.hd.N0(2131745666, null);
        } else {
            this.f40814e = org.telegram.messenger.hd.N0(2131750831, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f40814e));
    }

    public final void a() {
        String N0;
        if (this.f40815f == 0) {
            N0 = org.telegram.messenger.hd.N0(2131745666, null);
        } else {
            N0 = org.telegram.messenger.hd.N0(2131750831, null);
        }
        if (!N0.equals(this.f40814e)) {
            this.f40814e = N0;
            this.d = (int) Math.ceil(this.f40813c.measureText(N0));
        }
    }

    public final void b(int i7) {
        this.f40813c.setColor(i7);
        this.f40812b.setColor(i7);
        this.f40816g = Color.alpha(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f40811a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), this.f40812b);
        canvas.drawText(this.f40814e, rectF.left + org.telegram.messenger.g0.L(5.0f), rectF.top + org.telegram.messenger.g0.L(12.0f), this.f40813c);
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
            int i10 = (int) ((i7 / 255.0f) * this.f40816g);
            this.f40812b.setAlpha(i10);
            this.f40813c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
