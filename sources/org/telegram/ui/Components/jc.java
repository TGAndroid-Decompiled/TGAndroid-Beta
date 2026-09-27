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
    public final Paint f25443a;
    public long f25444b;
    public int f25445c;
    public String d;
    public int e;
    public StaticLayout f25446f;
    public StaticLayout h;
    public int f25447n;
    public float f25448r;
    public final TextPaint f25449s;
    public long v;
    public final RectF f25450w;

    public jc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f25448r = 1.0f;
        this.f25450w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f25449s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f25443a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Hi, e6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f25444b > 0) {
            i10 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f25450w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f25445c;
        TextPaint textPaint = this.f25449s;
        if (i11 != i10) {
            this.f25445c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f25446f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f25448r = 0.0f;
                this.f25447n = this.e;
            }
            this.e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f25446f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f25448r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f25448r = f10;
            if (f10 > 1.0f) {
                this.f25448r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f25448r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f25447n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f25448r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f25446f != null) {
            float f12 = this.f25448r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), com.google.android.gms.internal.vision.e2.b(1.0f, this.f25448r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f25446f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f25446f.draw(canvas);
            if (this.f25448r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f25444b)) / 5000.0f) * (-360.0f), false, this.f25443a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f25444b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f25449s.setColor(i10);
        this.f25443a.setColor(i10);
    }
}
