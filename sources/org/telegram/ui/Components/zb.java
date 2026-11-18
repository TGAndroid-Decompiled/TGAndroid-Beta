package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public class zb extends View {
    public final Paint f42848a;
    public long f42849b;
    public int f42850c;
    public String d;
    public int f42851e;
    public StaticLayout f42852f;
    public StaticLayout h;
    public int f42853n;
    public float f42854r;
    public final TextPaint f42855s;
    public long f42856w;
    public final RectF f42857x;

    public zb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f42854r = 1.0f;
        this.f42857x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f42855s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f42848a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, i6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i7;
        String valueOf;
        super.onDraw(canvas);
        if (this.f42849b > 0) {
            i7 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i7 = 0;
        }
        RectF rectF = this.f42857x;
        rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        int i10 = this.f42850c;
        TextPaint textPaint = this.f42855s;
        if (i10 != i7) {
            this.f42850c = i7;
            this.d = String.valueOf(Math.max(0, i7));
            StaticLayout staticLayout = this.f42852f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f42854r = 0.0f;
                this.f42853n = this.f42851e;
            }
            this.f42851e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f42852f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f42854r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f42854r = f11;
            if (f11 > 1.0f) {
                this.f42854r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f42854r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f42853n / 2.0f), ((org.telegram.messenger.g0.L(10.0f) * this.f42854r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.g0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f42852f != null) {
            float f13 = this.f42854r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f42851e / 2.0f), com.google.android.gms.internal.vision.e2.t(1.0f, this.f42854r, org.telegram.messenger.g0.L(10.0f), rectF.centerY() - (this.f42852f.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(0.5f));
            this.f42852f.draw(canvas);
            if (this.f42854r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f42849b)) / 5000.0f) * (-360.0f), false, this.f42848a);
        if (this.f42856w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f42849b -= currentTimeMillis - this.f42856w;
            this.f42856w = currentTimeMillis;
        } else {
            this.f42856w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i7) {
        this.f42855s.setColor(i7);
        this.f42848a.setColor(i7);
    }
}
