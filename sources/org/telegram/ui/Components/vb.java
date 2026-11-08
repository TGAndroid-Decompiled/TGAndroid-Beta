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
    public final Paint f38965a;
    public long f38966b;
    public int f38967c;
    public String d;
    public int f38968e;
    public StaticLayout f38969f;
    public StaticLayout h;
    public int f38970n;
    public float f38971r;
    public final TextPaint f38972s;
    public long f38973w;
    public final RectF f38974x;

    public vb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38971r = 1.0f;
        this.f38974x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f38972s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f38965a = paint;
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
        if (this.f38966b > 0) {
            i7 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i7 = 0;
        }
        RectF rectF = this.f38974x;
        rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        int i10 = this.f38967c;
        TextPaint textPaint = this.f38972s;
        if (i10 != i7) {
            this.f38967c = i7;
            this.d = String.valueOf(Math.max(0, i7));
            StaticLayout staticLayout = this.f38969f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f38971r = 0.0f;
                this.f38970n = this.f38968e;
            }
            this.f38968e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f38969f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f38971r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f38971r = f11;
            if (f11 > 1.0f) {
                this.f38971r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f38971r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f38970n / 2.0f), ((org.telegram.messenger.g0.L(10.0f) * this.f38971r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.g0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f38969f != null) {
            float f13 = this.f38971r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f38968e / 2.0f), com.google.android.recaptcha.internal.a.v(1.0f, this.f38971r, org.telegram.messenger.g0.L(10.0f), rectF.centerY() - (this.f38969f.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(0.5f));
            this.f38969f.draw(canvas);
            if (this.f38971r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f38966b)) / 5000.0f) * (-360.0f), false, this.f38965a);
        if (this.f38973w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f38966b -= currentTimeMillis - this.f38973w;
            this.f38973w = currentTimeMillis;
        } else {
            this.f38973w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i7) {
        this.f38972s.setColor(i7);
        this.f38965a.setColor(i7);
    }
}
