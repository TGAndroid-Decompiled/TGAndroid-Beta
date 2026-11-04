package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public class tb extends View {
    public final Paint f38375a;
    public long f38376b;
    public int f38377c;
    public String d;
    public int f38378e;
    public StaticLayout f38379f;
    public StaticLayout h;
    public int f38380n;
    public float f38381r;
    public final TextPaint f38382s;
    public long f38383w;
    public final RectF f38384x;

    public tb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f38381r = 1.0f;
        this.f38384x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f38382s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f38375a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, e6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        int i3;
        String valueOf;
        super.onDraw(canvas);
        if (this.f38376b > 0) {
            i3 = (int) Math.ceil(((float) j10) / 1000.0f);
        } else {
            i3 = 0;
        }
        RectF rectF = this.f38384x;
        rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        int i10 = this.f38377c;
        TextPaint textPaint = this.f38382s;
        if (i10 != i3) {
            this.f38377c = i3;
            this.d = String.valueOf(Math.max(0, i3));
            StaticLayout staticLayout = this.f38379f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f38381r = 0.0f;
                this.f38380n = this.f38378e;
            }
            this.f38378e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f38379f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f38381r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f38381r = f11;
            if (f11 > 1.0f) {
                this.f38381r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f38381r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f38380n / 2.0f), ((org.telegram.messenger.g0.L(10.0f) * this.f38381r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.g0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f38379f != null) {
            float f13 = this.f38381r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f38378e / 2.0f), a1.g.D(1.0f, this.f38381r, org.telegram.messenger.g0.L(10.0f), rectF.centerY() - (this.f38379f.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(0.5f));
            this.f38379f.draw(canvas);
            if (this.f38381r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f38376b)) / 5000.0f) * (-360.0f), false, this.f38375a);
        if (this.f38383w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f38376b -= currentTimeMillis - this.f38383w;
            this.f38383w = currentTimeMillis;
        } else {
            this.f38383w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i3) {
        this.f38382s.setColor(i3);
        this.f38375a.setColor(i3);
    }
}
