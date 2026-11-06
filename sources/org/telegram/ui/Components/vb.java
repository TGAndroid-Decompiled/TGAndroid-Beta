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
    public final Paint f38909a;
    public long f38910b;
    public int f38911c;
    public String d;
    public int f38912e;
    public StaticLayout f38913f;
    public StaticLayout h;
    public int f38914n;
    public float f38915r;
    public final TextPaint f38916s;
    public long f38917w;
    public final RectF f38918x;

    public vb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38915r = 1.0f;
        this.f38918x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f38916s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f38909a = paint;
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
        if (this.f38910b > 0) {
            i7 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i7 = 0;
        }
        RectF rectF = this.f38918x;
        rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        int i10 = this.f38911c;
        TextPaint textPaint = this.f38916s;
        if (i10 != i7) {
            this.f38911c = i7;
            this.d = String.valueOf(Math.max(0, i7));
            StaticLayout staticLayout = this.f38913f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f38915r = 0.0f;
                this.f38914n = this.f38912e;
            }
            this.f38912e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f38913f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f38915r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f38915r = f11;
            if (f11 > 1.0f) {
                this.f38915r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f38915r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f38914n / 2.0f), ((org.telegram.messenger.g0.L(10.0f) * this.f38915r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.g0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f38913f != null) {
            float f13 = this.f38915r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f38912e / 2.0f), com.google.android.recaptcha.internal.a.v(1.0f, this.f38915r, org.telegram.messenger.g0.L(10.0f), rectF.centerY() - (this.f38913f.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(0.5f));
            this.f38913f.draw(canvas);
            if (this.f38915r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f38910b)) / 5000.0f) * (-360.0f), false, this.f38909a);
        if (this.f38917w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f38910b -= currentTimeMillis - this.f38917w;
            this.f38917w = currentTimeMillis;
        } else {
            this.f38917w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i7) {
        this.f38916s.setColor(i7);
        this.f38909a.setColor(i7);
    }
}
