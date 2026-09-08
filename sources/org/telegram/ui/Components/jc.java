package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jc extends View {
    public final Paint f27454a;
    public long f27455b;
    public int f27456c;
    public String d;
    public int f27457e;
    public StaticLayout f27458f;
    public StaticLayout h;
    public int f27459n;
    public float f27460r;
    public final TextPaint f27461s;
    public long v;
    public final RectF f27462w;

    public jc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f27460r = 1.0f;
        this.f27462w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f27461s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f27454a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f27455b > 0) {
            i10 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f27462w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f27456c;
        TextPaint textPaint = this.f27461s;
        if (i11 != i10) {
            this.f27456c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f27458f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f27460r = 0.0f;
                this.f27459n = this.f27457e;
            }
            this.f27457e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f27458f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f27460r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f27460r = f10;
            if (f10 > 1.0f) {
                this.f27460r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f27460r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f27459n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f27460r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f27458f != null) {
            float f12 = this.f27460r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f27457e / 2.0f), com.google.android.gms.internal.vision.e2.b(1.0f, this.f27460r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f27458f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f27458f.draw(canvas);
            if (this.f27460r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f27455b)) / 5000.0f) * (-360.0f), false, this.f27454a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f27455b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f27461s.setColor(i10);
        this.f27454a.setColor(i10);
    }
}
