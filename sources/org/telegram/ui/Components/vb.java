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
    public final Paint f38912a;
    public long f38913b;
    public int f38914c;
    public String d;
    public int f38915e;
    public StaticLayout f38916f;
    public StaticLayout h;
    public int f38917n;
    public float f38918r;
    public final TextPaint f38919s;
    public long f38920w;
    public final RectF f38921x;

    public vb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38918r = 1.0f;
        this.f38921x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f38919s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f38912a = paint;
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
        if (this.f38913b > 0) {
            i7 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i7 = 0;
        }
        RectF rectF = this.f38921x;
        rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        int i10 = this.f38914c;
        TextPaint textPaint = this.f38919s;
        if (i10 != i7) {
            this.f38914c = i7;
            this.d = String.valueOf(Math.max(0, i7));
            StaticLayout staticLayout = this.f38916f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f38918r = 0.0f;
                this.f38917n = this.f38915e;
            }
            this.f38915e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f38916f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f38918r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f38918r = f11;
            if (f11 > 1.0f) {
                this.f38918r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f38918r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f38917n / 2.0f), ((org.telegram.messenger.g0.L(10.0f) * this.f38918r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.g0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f38916f != null) {
            float f13 = this.f38918r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f38915e / 2.0f), com.google.android.recaptcha.internal.a.v(1.0f, this.f38918r, org.telegram.messenger.g0.L(10.0f), rectF.centerY() - (this.f38916f.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(0.5f));
            this.f38916f.draw(canvas);
            if (this.f38918r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f38913b)) / 5000.0f) * (-360.0f), false, this.f38912a);
        if (this.f38920w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f38913b -= currentTimeMillis - this.f38920w;
            this.f38920w = currentTimeMillis;
        } else {
            this.f38920w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i7) {
        this.f38919s.setColor(i7);
        this.f38912a.setColor(i7);
    }
}
