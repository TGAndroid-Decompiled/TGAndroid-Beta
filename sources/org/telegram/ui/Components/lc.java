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
public final class lc extends View {
    public final Paint f28290a;
    public long f28291b;
    public int f28292c;
    public String d;
    public int f28293e;
    public StaticLayout f28294f;
    public StaticLayout h;
    public int f28295n;
    public float f28296r;
    public final TextPaint f28297s;
    public long v;
    public final RectF f28298w;

    public lc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28296r = 1.0f;
        this.f28298w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f28297s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f28290a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Hi, d6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f28291b > 0) {
            i10 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f28298w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f28292c;
        TextPaint textPaint = this.f28297s;
        if (i11 != i10) {
            this.f28292c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f28294f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f28296r = 0.0f;
                this.f28295n = this.f28293e;
            }
            this.f28293e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f28294f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f28296r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f28296r = f10;
            if (f10 > 1.0f) {
                this.f28296r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f28296r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f28295n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f28296r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f28294f != null) {
            float f12 = this.f28296r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f28293e / 2.0f), com.google.android.gms.internal.vision.e2.b(1.0f, this.f28296r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f28294f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f28294f.draw(canvas);
            if (this.f28296r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f28291b)) / 5000.0f) * (-360.0f), false, this.f28290a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f28291b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f28297s.setColor(i10);
        this.f28290a.setColor(i10);
    }
}
