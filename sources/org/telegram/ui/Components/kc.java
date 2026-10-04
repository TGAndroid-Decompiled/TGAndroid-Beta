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
public final class kc extends View {
    public final Paint f28068a;
    public long f28069b;
    public int f28070c;
    public String d;
    public int f28071e;
    public StaticLayout f28072f;
    public StaticLayout h;
    public int f28073n;
    public float f28074r;
    public final TextPaint f28075s;
    public long v;
    public final RectF f28076w;

    public kc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28074r = 1.0f;
        this.f28076w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f28075s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f28068a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Hi, d6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f28069b > 0) {
            i10 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f28076w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f28070c;
        TextPaint textPaint = this.f28075s;
        if (i11 != i10) {
            this.f28070c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f28072f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f28074r = 0.0f;
                this.f28073n = this.f28071e;
            }
            this.f28071e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f28072f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f28074r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f28074r = f10;
            if (f10 > 1.0f) {
                this.f28074r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f28074r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f28073n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f28074r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f28072f != null) {
            float f12 = this.f28074r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f28071e / 2.0f), com.google.android.gms.internal.vision.e2.b(1.0f, this.f28074r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f28072f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f28072f.draw(canvas);
            if (this.f28074r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f28069b)) / 5000.0f) * (-360.0f), false, this.f28068a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f28069b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f28075s.setColor(i10);
        this.f28068a.setColor(i10);
    }
}
