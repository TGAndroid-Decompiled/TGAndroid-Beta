package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public class gz extends ReplacementSpan {
    public final TextPaint f46096a;
    public final Paint f46097b;
    public StaticLayout f46098c;
    public float d;
    public float f46099e;
    public int f46100f;
    public final int h;
    public boolean f46101n;
    public int f46102r;
    public org.telegram.ui.ActionBar.g6 f46103s;
    public CharSequence f46104w;

    public gz(int i7) {
        TextPaint textPaint = new TextPaint(1);
        this.f46096a = textPaint;
        Paint paint = new Paint(1);
        this.f46097b = paint;
        this.f46104w = "NEW";
        this.h = i7;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.g0.L(i7 < 0 ? 12.0f : i7));
    }

    public final void a() {
        if (this.f46098c == null) {
            StaticLayout staticLayout = new StaticLayout(this.f46104w, this.f46096a, org.telegram.messenger.g0.f22563q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f46098c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f46099e = this.f46098c.getHeight();
        }
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float f11;
        a();
        if (this.f46101n) {
            this.f46100f = org.telegram.ui.ActionBar.l6.w0(this.f46102r, this.f46103s);
        }
        int i15 = this.f46100f;
        if (i15 == 0) {
            i15 = paint.getColor();
        }
        Paint paint2 = this.f46097b;
        paint2.setColor(i15);
        if (org.telegram.messenger.g0.B(i15) > 0.721f) {
            i14 = -16777216;
        } else {
            i14 = -1;
        }
        TextPaint textPaint = this.f46096a;
        textPaint.setColor(i14);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float L = f10 + org.telegram.messenger.g0.L(2.0f);
        float L2 = (i12 - this.f46099e) + org.telegram.messenger.g0.L(1.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L, L2, this.d + L, this.f46099e + L2);
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
        this.f46098c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(10.0f) + this.d);
    }

    public gz() {
        TextPaint textPaint = new TextPaint(1);
        this.f46096a = textPaint;
        Paint paint = new Paint(1);
        this.f46097b = paint;
        this.f46104w = "NEW";
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.g0.L(10.0f));
    }
}
