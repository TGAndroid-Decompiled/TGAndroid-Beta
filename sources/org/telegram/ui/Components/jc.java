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
    public final Paint f27427a;
    public long f27428b;
    public int f27429c;
    public String d;
    public int f27430e;
    public StaticLayout f27431f;
    public StaticLayout h;
    public int f27432n;
    public float f27433r;
    public final TextPaint f27434s;
    public long v;
    public final RectF f27435w;

    public jc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f27433r = 1.0f;
        this.f27435w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f27434s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f27427a = paint;
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
        if (this.f27428b > 0) {
            i10 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f27435w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f27429c;
        TextPaint textPaint = this.f27434s;
        if (i11 != i10) {
            this.f27429c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f27431f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f27433r = 0.0f;
                this.f27432n = this.f27430e;
            }
            this.f27430e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f27431f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f27433r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f27433r = f10;
            if (f10 > 1.0f) {
                this.f27433r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f27433r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f27432n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f27433r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f27431f != null) {
            float f12 = this.f27433r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f27430e / 2.0f), com.google.android.gms.internal.vision.e2.b(1.0f, this.f27433r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f27431f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f27431f.draw(canvas);
            if (this.f27433r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f27428b)) / 5000.0f) * (-360.0f), false, this.f27427a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f27428b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f27434s.setColor(i10);
        this.f27427a.setColor(i10);
    }
}
