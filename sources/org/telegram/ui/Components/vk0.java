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
    public final RectF f40859a = new RectF();
    public final Paint f40860b;
    public final TextPaint f40861c;
    public int d;
    public String f40862e;
    public final int f40863f;
    public int f40864g;
    public final int h;

    public vk0(int i7) {
        Paint paint = new Paint(1);
        this.f40860b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f40861c = textPaint;
        this.f40864g = 255;
        this.h = 255;
        this.f40863f = i7;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (i7 == 0) {
            this.f40862e = org.telegram.messenger.gd.N0(2131745666, null);
        } else {
            this.f40862e = org.telegram.messenger.gd.N0(2131750831, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f40862e));
    }

    public final void a() {
        String N0;
        if (this.f40863f == 0) {
            N0 = org.telegram.messenger.gd.N0(2131745666, null);
        } else {
            N0 = org.telegram.messenger.gd.N0(2131750831, null);
        }
        if (!N0.equals(this.f40862e)) {
            this.f40862e = N0;
            this.d = (int) Math.ceil(this.f40861c.measureText(N0));
        }
    }

    public final void b(int i7) {
        this.f40861c.setColor(i7);
        this.f40860b.setColor(i7);
        this.f40864g = Color.alpha(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f40859a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), this.f40860b);
        canvas.drawText(this.f40862e, rectF.left + org.telegram.messenger.g0.L(5.0f), rectF.top + org.telegram.messenger.g0.L(12.0f), this.f40861c);
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
            int i10 = (int) ((i7 / 255.0f) * this.f40864g);
            this.f40860b.setAlpha(i10);
            this.f40861c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
