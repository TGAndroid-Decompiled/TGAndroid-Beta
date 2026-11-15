package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public class qb extends View {
    public final Paint f38605a;
    public long f38606b;
    public int f38607c;
    public String d;
    public int f38608e;
    public StaticLayout f38609f;
    public StaticLayout h;
    public int f38610n;
    public float f38611r;
    public final TextPaint f38612s;
    public long f38613w;
    public final RectF f38614x;

    public qb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f38611r = 1.0f;
        this.f38614x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f38612s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f38605a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, e6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i7;
        String valueOf;
        super.onDraw(canvas);
        if (this.f38606b > 0) {
            i7 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i7 = 0;
        }
        RectF rectF = this.f38614x;
        rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        int i10 = this.f38607c;
        TextPaint textPaint = this.f38612s;
        if (i10 != i7) {
            this.f38607c = i7;
            this.d = String.valueOf(Math.max(0, i7));
            StaticLayout staticLayout = this.f38609f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f38611r = 0.0f;
                this.f38610n = this.f38608e;
            }
            this.f38608e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f38609f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f38611r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f38611r = f11;
            if (f11 > 1.0f) {
                this.f38611r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f38611r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f38610n / 2.0f), ((org.telegram.messenger.g0.L(10.0f) * this.f38611r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.g0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f38609f != null) {
            float f13 = this.f38611r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f38608e / 2.0f), com.google.android.gms.internal.vision.e2.t(1.0f, this.f38611r, org.telegram.messenger.g0.L(10.0f), rectF.centerY() - (this.f38609f.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(0.5f));
            this.f38609f.draw(canvas);
            if (this.f38611r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f38606b)) / 5000.0f) * (-360.0f), false, this.f38605a);
        if (this.f38613w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f38606b -= currentTimeMillis - this.f38613w;
            this.f38613w = currentTimeMillis;
        } else {
            this.f38613w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i7) {
        this.f38612s.setColor(i7);
        this.f38605a.setColor(i7);
    }
}
