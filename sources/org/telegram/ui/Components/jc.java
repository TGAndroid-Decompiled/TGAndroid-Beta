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
    public final Paint f27491a;
    public long f27492b;
    public int f27493c;
    public String d;
    public int e;
    public StaticLayout f27494f;
    public StaticLayout h;
    public int f27495n;
    public float f27496r;
    public final TextPaint f27497s;
    public long v;
    public final RectF f27498w;

    public jc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f27496r = 1.0f;
        this.f27498w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f27497s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f27491a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Hi, d6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f27492b > 0) {
            i10 = (int) Math.ceil(((float) j10) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f27498w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f27493c;
        TextPaint textPaint = this.f27497s;
        if (i11 != i10) {
            this.f27493c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f27494f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f27496r = 0.0f;
                this.f27495n = this.e;
            }
            this.e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f27494f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f27496r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f27496r = f10;
            if (f10 > 1.0f) {
                this.f27496r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f27496r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f27495n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f27496r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f27494f != null) {
            float f12 = this.f27496r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), com.google.android.gms.internal.play_billing.k3.D(1.0f, this.f27496r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f27494f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f27494f.draw(canvas);
            if (this.f27496r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f27492b)) / 5000.0f) * (-360.0f), false, this.f27491a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f27492b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f27497s.setColor(i10);
        this.f27491a.setColor(i10);
    }
}
