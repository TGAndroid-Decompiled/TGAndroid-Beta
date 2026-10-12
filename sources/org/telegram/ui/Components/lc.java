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
    public final Paint f28152a;
    public long f28153b;
    public int f28154c;
    public String d;
    public int f28155e;
    public StaticLayout f28156f;
    public StaticLayout h;
    public int f28157n;
    public float f28158r;
    public final TextPaint f28159s;
    public long v;
    public final RectF f28160w;

    public lc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28158r = 1.0f;
        this.f28160w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f28159s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f28152a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Hi, c6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f28153b > 0) {
            i10 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f28160w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f28154c;
        TextPaint textPaint = this.f28159s;
        if (i11 != i10) {
            this.f28154c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f28156f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f28158r = 0.0f;
                this.f28157n = this.f28155e;
            }
            this.f28155e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f28156f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f28158r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f28158r = f10;
            if (f10 > 1.0f) {
                this.f28158r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f28158r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f28157n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f28158r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f28156f != null) {
            float f12 = this.f28158r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f28155e / 2.0f), com.google.android.gms.internal.vision.e2.b(1.0f, this.f28158r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f28156f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f28156f.draw(canvas);
            if (this.f28158r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f28153b)) / 5000.0f) * (-360.0f), false, this.f28152a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f28153b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f28159s.setColor(i10);
        this.f28152a.setColor(i10);
    }
}
