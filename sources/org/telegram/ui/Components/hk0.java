package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class hk0 extends Drawable {
    public final RectF f34323a = new RectF();
    public final Paint f34324b;
    public final TextPaint f34325c;
    public int d;
    public String f34326e;
    public final int f34327f;
    public int f34328g;
    public final int h;

    public hk0(int i7) {
        Paint paint = new Paint(1);
        this.f34324b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f34325c = textPaint;
        this.f34328g = 255;
        this.h = 255;
        this.f34327f = i7;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (i7 == 0) {
            this.f34326e = org.telegram.messenger.id.M0(2131745862, null);
        } else {
            this.f34326e = org.telegram.messenger.id.M0(2131750843, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f34326e));
    }

    public final void a() {
        String M0;
        if (this.f34327f == 0) {
            M0 = org.telegram.messenger.id.M0(2131745862, null);
        } else {
            M0 = org.telegram.messenger.id.M0(2131750843, null);
        }
        if (!M0.equals(this.f34326e)) {
            this.f34326e = M0;
            this.d = (int) Math.ceil(this.f34325c.measureText(M0));
        }
    }

    public final void b(int i7) {
        this.f34325c.setColor(i7);
        this.f34324b.setColor(i7);
        this.f34328g = Color.alpha(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f34323a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), this.f34324b);
        canvas.drawText(this.f34326e, rectF.left + org.telegram.messenger.g0.L(5.0f), rectF.top + org.telegram.messenger.g0.L(12.0f), this.f34325c);
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
            int i10 = (int) ((i7 / 255.0f) * this.f34328g);
            this.f34324b.setAlpha(i10);
            this.f34325c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
