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
    public final Paint f42722a;
    public long f42723b;
    public int f42724c;
    public String d;
    public int f42725e;
    public StaticLayout f42726f;
    public StaticLayout h;
    public int f42727n;
    public float f42728r;
    public final TextPaint f42729s;
    public long f42730w;
    public final RectF f42731x;

    public zb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f42728r = 1.0f;
        this.f42731x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f42729s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f42722a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, h6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i7;
        String valueOf;
        super.onDraw(canvas);
        if (this.f42723b > 0) {
            i7 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i7 = 0;
        }
        RectF rectF = this.f42731x;
        rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        int i10 = this.f42724c;
        TextPaint textPaint = this.f42729s;
        if (i10 != i7) {
            this.f42724c = i7;
            this.d = String.valueOf(Math.max(0, i7));
            StaticLayout staticLayout = this.f42726f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f42728r = 0.0f;
                this.f42727n = this.f42725e;
            }
            this.f42725e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f42726f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f42728r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f42728r = f11;
            if (f11 > 1.0f) {
                this.f42728r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f42728r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f42727n / 2.0f), ((org.telegram.messenger.g0.L(10.0f) * this.f42728r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.g0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f42726f != null) {
            float f13 = this.f42728r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f42725e / 2.0f), com.google.android.gms.internal.vision.e2.t(1.0f, this.f42728r, org.telegram.messenger.g0.L(10.0f), rectF.centerY() - (this.f42726f.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(0.5f));
            this.f42726f.draw(canvas);
            if (this.f42728r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f42723b)) / 5000.0f) * (-360.0f), false, this.f42722a);
        if (this.f42730w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f42723b -= currentTimeMillis - this.f42730w;
            this.f42730w = currentTimeMillis;
        } else {
            this.f42730w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i7) {
        this.f42729s.setColor(i7);
        this.f42722a.setColor(i7);
    }
}
