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
    public final Paint f28062a;
    public long f28063b;
    public int f28064c;
    public String d;
    public int f28065e;
    public StaticLayout f28066f;
    public StaticLayout h;
    public int f28067n;
    public float f28068r;
    public final TextPaint f28069s;
    public long v;
    public final RectF f28070w;

    public kc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28068r = 1.0f;
        this.f28070w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f28069s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f28062a = paint;
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
        if (this.f28063b > 0) {
            i10 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f28070w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f28064c;
        TextPaint textPaint = this.f28069s;
        if (i11 != i10) {
            this.f28064c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f28066f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f28068r = 0.0f;
                this.f28067n = this.f28065e;
            }
            this.f28065e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f28066f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f28068r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f28068r = f10;
            if (f10 > 1.0f) {
                this.f28068r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f28068r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f28067n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f28068r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f28066f != null) {
            float f12 = this.f28068r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f28065e / 2.0f), com.google.android.gms.internal.vision.e2.b(1.0f, this.f28068r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f28066f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f28066f.draw(canvas);
            if (this.f28068r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f28063b)) / 5000.0f) * (-360.0f), false, this.f28062a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f28063b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f28069s.setColor(i10);
        this.f28062a.setColor(i10);
    }
}
