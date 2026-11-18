package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class tk0 extends Drawable {
    public final RectF f40033a = new RectF();
    public final Paint f40034b;
    public final TextPaint f40035c;
    public int d;
    public String f40036e;
    public final int f40037f;
    public int f40038g;
    public final int h;

    public tk0(int i7) {
        Paint paint = new Paint(1);
        this.f40034b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f40035c = textPaint;
        this.f40038g = 255;
        this.h = 255;
        this.f40037f = i7;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (i7 == 0) {
            this.f40036e = org.telegram.messenger.gd.M0(2131745667, null);
        } else {
            this.f40036e = org.telegram.messenger.gd.M0(2131750832, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f40036e));
    }

    public final void a() {
        String M0;
        if (this.f40037f == 0) {
            M0 = org.telegram.messenger.gd.M0(2131745667, null);
        } else {
            M0 = org.telegram.messenger.gd.M0(2131750832, null);
        }
        if (!M0.equals(this.f40036e)) {
            this.f40036e = M0;
            this.d = (int) Math.ceil(this.f40035c.measureText(M0));
        }
    }

    public final void b(int i7) {
        this.f40035c.setColor(i7);
        this.f40034b.setColor(i7);
        this.f40038g = Color.alpha(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f40033a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), this.f40034b);
        canvas.drawText(this.f40036e, rectF.left + org.telegram.messenger.g0.L(5.0f), rectF.top + org.telegram.messenger.g0.L(12.0f), this.f40035c);
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
            int i10 = (int) ((i7 / 255.0f) * this.f40038g);
            this.f40034b.setAlpha(i10);
            this.f40035c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
