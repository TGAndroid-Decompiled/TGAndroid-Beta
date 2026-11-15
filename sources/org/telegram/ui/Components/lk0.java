package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class lk0 extends Drawable {
    public final RectF f36832a = new RectF();
    public final Paint f36833b;
    public final TextPaint f36834c;
    public int d;
    public String f36835e;
    public final int f36836f;
    public int f36837g;
    public final int h;

    public lk0(int i7) {
        Paint paint = new Paint(1);
        this.f36833b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f36834c = textPaint;
        this.f36837g = 255;
        this.h = 255;
        this.f36836f = i7;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (i7 == 0) {
            this.f36835e = org.telegram.messenger.hd.M0(2131745862, null);
        } else {
            this.f36835e = org.telegram.messenger.hd.M0(2131750843, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f36835e));
    }

    public final void a() {
        String M0;
        if (this.f36836f == 0) {
            M0 = org.telegram.messenger.hd.M0(2131745862, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131750843, null);
        }
        if (!M0.equals(this.f36835e)) {
            this.f36835e = M0;
            this.d = (int) Math.ceil(this.f36834c.measureText(M0));
        }
    }

    public final void b(int i7) {
        this.f36834c.setColor(i7);
        this.f36833b.setColor(i7);
        this.f36837g = Color.alpha(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f36832a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), this.f36833b);
        canvas.drawText(this.f36835e, rectF.left + org.telegram.messenger.g0.L(5.0f), rectF.top + org.telegram.messenger.g0.L(12.0f), this.f36834c);
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
            int i10 = (int) ((i7 / 255.0f) * this.f36837g);
            this.f36833b.setAlpha(i10);
            this.f36834c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
