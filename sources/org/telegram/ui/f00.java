package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public class f00 extends ReplacementSpan {
    public final TextPaint f36944a;
    public final Paint f36945b;
    public StaticLayout f36946c;
    public float d;
    public float e;
    public int f36947f;
    public final int h;
    public boolean f36948n;
    public int f36949r;
    public org.telegram.ui.ActionBar.p6 f36950s;
    public CharSequence f36951w;

    public f00(int i10) {
        TextPaint textPaint = new TextPaint(1);
        this.f36944a = textPaint;
        Paint paint = new Paint(1);
        this.f36945b = paint;
        this.f36951w = "NEW";
        this.h = i10;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.i0.L(i10 < 0 ? 12.0f : i10));
    }

    public final void a() {
        if (this.f36946c == null) {
            StaticLayout staticLayout = new StaticLayout(this.f36951w, this.f36944a, org.telegram.messenger.i0.f16172q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f36946c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.f36946c.getHeight();
        }
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        float f10;
        a();
        if (this.f36948n) {
            this.f36947f = org.telegram.ui.ActionBar.t6.w0(this.f36949r, this.f36950s);
        }
        int i16 = this.f36947f;
        if (i16 == 0) {
            i16 = paint.getColor();
        }
        Paint paint2 = this.f36945b;
        paint2.setColor(i16);
        if (org.telegram.messenger.i0.B(i16) > 0.721f) {
            i15 = -16777216;
        } else {
            i15 = -1;
        }
        TextPaint textPaint = this.f36944a;
        textPaint.setColor(i15);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float L = f7 + org.telegram.messenger.i0.L(2.0f);
        float L2 = (i13 - this.e) + org.telegram.messenger.i0.L(1.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(L, L2, this.d + L, this.e + L2);
        float L3 = org.telegram.messenger.i0.L(4.4f);
        float L4 = org.telegram.messenger.i0.L(-4.0f);
        if (this.h == 8) {
            f10 = -3.66f;
        } else {
            f10 = -2.33f;
        }
        rectF.inset(L4, org.telegram.messenger.i0.L(f10));
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        canvas.save();
        canvas.translate(L, L2);
        this.f36946c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.i0.L(10.0f) + this.d);
    }

    public f00() {
        TextPaint textPaint = new TextPaint(1);
        this.f36944a = textPaint;
        Paint paint = new Paint(1);
        this.f36945b = paint;
        this.f36951w = "NEW";
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(org.telegram.messenger.i0.L(10.0f));
    }
}
