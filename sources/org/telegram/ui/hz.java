package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public class hz extends ReplacementSpan {
    public final TextPaint f48664a;
    public final Paint f48665b;
    public StaticLayout f48666c;
    public float d;
    public float f48667e;
    public int f48668f;
    public final int h;
    public boolean f48669n;
    public int f48670r;
    public org.telegram.ui.ActionBar.i6 f48671s;
    public CharSequence f48672w;

    public hz(int i7) {
        TextPaint textPaint = new TextPaint(1);
        this.f48664a = textPaint;
        Paint paint = new Paint(1);
        this.f48665b = paint;
        this.f48672w = "NEW";
        this.h = i7;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.g0.L(i7 < 0 ? 12.0f : i7));
    }

    public final void a() {
        if (this.f48666c == null) {
            StaticLayout staticLayout = new StaticLayout(this.f48672w, this.f48664a, org.telegram.messenger.g0.f24226q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f48666c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f48667e = this.f48666c.getHeight();
        }
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float f11;
        a();
        if (this.f48669n) {
            this.f48668f = org.telegram.ui.ActionBar.n6.w0(this.f48670r, this.f48671s);
        }
        int i15 = this.f48668f;
        if (i15 == 0) {
            i15 = paint.getColor();
        }
        Paint paint2 = this.f48665b;
        paint2.setColor(i15);
        if (org.telegram.messenger.g0.B(i15) > 0.721f) {
            i14 = -16777216;
        } else {
            i14 = -1;
        }
        TextPaint textPaint = this.f48664a;
        textPaint.setColor(i14);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float L = f10 + org.telegram.messenger.g0.L(2.0f);
        float L2 = (i12 - this.f48667e) + org.telegram.messenger.g0.L(1.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L, L2, this.d + L, this.f48667e + L2);
        float L3 = org.telegram.messenger.g0.L(4.4f);
        float L4 = org.telegram.messenger.g0.L(-4.0f);
        if (this.h == 8) {
            f11 = -3.66f;
        } else {
            f11 = -2.33f;
        }
        rectF.inset(L4, org.telegram.messenger.g0.L(f11));
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        canvas.save();
        canvas.translate(L, L2);
        this.f48666c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(10.0f) + this.d);
    }

    public hz() {
        TextPaint textPaint = new TextPaint(1);
        this.f48664a = textPaint;
        Paint paint = new Paint(1);
        this.f48665b = paint;
        this.f48672w = "NEW";
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.g0.L(10.0f));
    }
}
