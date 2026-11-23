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
    public final RectF f40726a = new RectF();
    public final Paint f40727b;
    public final TextPaint f40728c;
    public int d;
    public String f40729e;
    public final int f40730f;
    public int f40731g;
    public final int h;

    public vk0(int i7) {
        Paint paint = new Paint(1);
        this.f40727b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f40728c = textPaint;
        this.f40731g = 255;
        this.h = 255;
        this.f40730f = i7;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (i7 == 0) {
            this.f40729e = org.telegram.messenger.gd.N0(2131745666, null);
        } else {
            this.f40729e = org.telegram.messenger.gd.N0(2131750831, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f40729e));
    }

    public final void a() {
        String N0;
        if (this.f40730f == 0) {
            N0 = org.telegram.messenger.gd.N0(2131745666, null);
        } else {
            N0 = org.telegram.messenger.gd.N0(2131750831, null);
        }
        if (!N0.equals(this.f40729e)) {
            this.f40729e = N0;
            this.d = (int) Math.ceil(this.f40728c.measureText(N0));
        }
    }

    public final void b(int i7) {
        this.f40728c.setColor(i7);
        this.f40727b.setColor(i7);
        this.f40731g = Color.alpha(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f40726a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), this.f40727b);
        canvas.drawText(this.f40729e, rectF.left + org.telegram.messenger.g0.L(5.0f), rectF.top + org.telegram.messenger.g0.L(12.0f), this.f40728c);
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
            int i10 = (int) ((i7 / 255.0f) * this.f40731g);
            this.f40727b.setAlpha(i10);
            this.f40728c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
