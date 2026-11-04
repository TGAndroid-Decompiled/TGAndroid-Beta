package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public class cz extends ReplacementSpan {
    public final TextPaint f44488a;
    public final Paint f44489b;
    public StaticLayout f44490c;
    public float d;
    public float f44491e;
    public int f44492f;
    public final int h;
    public boolean f44493n;
    public int f44494r;
    public org.telegram.ui.ActionBar.e6 f44495s;
    public CharSequence f44496w;

    public cz(int i3) {
        TextPaint textPaint = new TextPaint(1);
        this.f44488a = textPaint;
        Paint paint = new Paint(1);
        this.f44489b = paint;
        this.f44496w = "NEW";
        this.h = i3;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.g0.L(i3 < 0 ? 12.0f : i3));
    }

    public final void a() {
        if (this.f44490c == null) {
            StaticLayout staticLayout = new StaticLayout(this.f44496w, this.f44488a, org.telegram.messenger.g0.f22608q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f44490c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f44491e = this.f44490c.getHeight();
        }
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float f11;
        a();
        if (this.f44493n) {
            this.f44492f = org.telegram.ui.ActionBar.k6.w0(this.f44494r, this.f44495s);
        }
        int i15 = this.f44492f;
        if (i15 == 0) {
            i15 = paint.getColor();
        }
        Paint paint2 = this.f44489b;
        paint2.setColor(i15);
        if (org.telegram.messenger.g0.B(i15) > 0.721f) {
            i14 = -16777216;
        } else {
            i14 = -1;
        }
        TextPaint textPaint = this.f44488a;
        textPaint.setColor(i14);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float L = f10 + org.telegram.messenger.g0.L(2.0f);
        float L2 = (i12 - this.f44491e) + org.telegram.messenger.g0.L(1.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L, L2, this.d + L, this.f44491e + L2);
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
        this.f44490c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(10.0f) + this.d);
    }

    public cz() {
        TextPaint textPaint = new TextPaint(1);
        this.f44488a = textPaint;
        Paint paint = new Paint(1);
        this.f44489b = paint;
        this.f44496w = "NEW";
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.g0.L(10.0f));
    }
}
