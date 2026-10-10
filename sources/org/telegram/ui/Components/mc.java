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
public final class mc extends View {
    public final Paint f28758a;
    public long f28759b;
    public int f28760c;
    public String d;
    public int f28761e;
    public StaticLayout f28762f;
    public StaticLayout h;
    public int f28763n;
    public float f28764r;
    public final TextPaint f28765s;
    public long v;
    public final RectF f28766w;

    public mc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f28764r = 1.0f;
        this.f28766w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f28765s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f28758a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Hi, e6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f28759b > 0) {
            i10 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f28766w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f28760c;
        TextPaint textPaint = this.f28765s;
        if (i11 != i10) {
            this.f28760c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f28762f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f28764r = 0.0f;
                this.f28763n = this.f28761e;
            }
            this.f28761e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f28762f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f28764r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f28764r = f10;
            if (f10 > 1.0f) {
                this.f28764r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f28764r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f28763n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f28764r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f28762f != null) {
            float f12 = this.f28764r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f28761e / 2.0f), com.google.android.gms.internal.vision.e2.b(1.0f, this.f28764r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f28762f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f28762f.draw(canvas);
            if (this.f28764r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f28759b)) / 5000.0f) * (-360.0f), false, this.f28758a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f28759b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f28765s.setColor(i10);
        this.f28758a.setColor(i10);
    }
}
