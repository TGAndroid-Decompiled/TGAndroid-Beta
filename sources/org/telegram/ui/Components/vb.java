package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public class vb extends View {
    public final Paint f38930a;
    public long f38931b;
    public int f38932c;
    public String d;
    public int f38933e;
    public StaticLayout f38934f;
    public StaticLayout h;
    public int f38935n;
    public float f38936r;
    public final TextPaint f38937s;
    public long f38938w;
    public final RectF f38939x;

    public vb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38936r = 1.0f;
        this.f38939x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f38937s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f38930a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, f6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i7;
        String valueOf;
        super.onDraw(canvas);
        if (this.f38931b > 0) {
            i7 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i7 = 0;
        }
        RectF rectF = this.f38939x;
        rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        int i10 = this.f38932c;
        TextPaint textPaint = this.f38937s;
        if (i10 != i7) {
            this.f38932c = i7;
            this.d = String.valueOf(Math.max(0, i7));
            StaticLayout staticLayout = this.f38934f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f38936r = 0.0f;
                this.f38935n = this.f38933e;
            }
            this.f38933e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f38934f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f38936r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f38936r = f11;
            if (f11 > 1.0f) {
                this.f38936r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f38936r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f38935n / 2.0f), ((org.telegram.messenger.g0.L(10.0f) * this.f38936r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.g0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f38934f != null) {
            float f13 = this.f38936r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f38933e / 2.0f), com.google.android.recaptcha.internal.a.v(1.0f, this.f38936r, org.telegram.messenger.g0.L(10.0f), rectF.centerY() - (this.f38934f.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(0.5f));
            this.f38934f.draw(canvas);
            if (this.f38936r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f38931b)) / 5000.0f) * (-360.0f), false, this.f38930a);
        if (this.f38938w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f38931b -= currentTimeMillis - this.f38938w;
            this.f38938w = currentTimeMillis;
        } else {
            this.f38938w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i7) {
        this.f38937s.setColor(i7);
        this.f38930a.setColor(i7);
    }
}
