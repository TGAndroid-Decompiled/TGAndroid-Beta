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
    public final Paint f39023a;
    public long f39024b;
    public int f39025c;
    public String d;
    public int f39026e;
    public StaticLayout f39027f;
    public StaticLayout h;
    public int f39028n;
    public float f39029r;
    public final TextPaint f39030s;
    public long f39031w;
    public final RectF f39032x;

    public vb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f39029r = 1.0f;
        this.f39032x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f39030s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f39023a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.vj, g6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i7;
        String valueOf;
        super.onDraw(canvas);
        if (this.f39024b > 0) {
            i7 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i7 = 0;
        }
        RectF rectF = this.f39032x;
        rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        int i10 = this.f39025c;
        TextPaint textPaint = this.f39030s;
        if (i10 != i7) {
            this.f39025c = i7;
            this.d = String.valueOf(Math.max(0, i7));
            StaticLayout staticLayout = this.f39027f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f39029r = 0.0f;
                this.f39028n = this.f39026e;
            }
            this.f39026e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f39027f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f39029r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f39029r = f11;
            if (f11 > 1.0f) {
                this.f39029r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f39029r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f39028n / 2.0f), ((org.telegram.messenger.g0.L(10.0f) * this.f39029r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.g0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f39027f != null) {
            float f13 = this.f39029r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f39026e / 2.0f), com.google.android.recaptcha.internal.a.v(1.0f, this.f39029r, org.telegram.messenger.g0.L(10.0f), rectF.centerY() - (this.f39027f.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(0.5f));
            this.f39027f.draw(canvas);
            if (this.f39029r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f39024b)) / 5000.0f) * (-360.0f), false, this.f39023a);
        if (this.f39031w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f39024b -= currentTimeMillis - this.f39031w;
            this.f39031w = currentTimeMillis;
        } else {
            this.f39031w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i7) {
        this.f39030s.setColor(i7);
        this.f39023a.setColor(i7);
    }
}
