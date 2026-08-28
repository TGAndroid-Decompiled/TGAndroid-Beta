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
public final class zb extends View {
    public final Paint f35267a;
    public long f35268b;
    public int f35269c;
    public String d;
    public int f35270e;
    public StaticLayout f35271f;
    public StaticLayout h;
    public int f35272n;
    public float f35273r;
    public final TextPaint f35274s;
    public long v;
    public final RectF f35275w;

    public zb(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f35273r = 1.0f;
        this.f35275w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f35274s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f35267a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Hi, b6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        int i9;
        String valueOf;
        super.onDraw(canvas);
        if (this.f35268b > 0) {
            i9 = (int) Math.ceil(((float) j10) / 1000.0f);
        } else {
            i9 = 0;
        }
        RectF rectF = this.f35275w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i10 = this.f35269c;
        TextPaint textPaint = this.f35274s;
        if (i10 != i9) {
            this.f35269c = i9;
            this.d = String.valueOf(Math.max(0, i9));
            StaticLayout staticLayout = this.f35271f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f35273r = 0.0f;
                this.f35272n = this.f35270e;
            }
            this.f35270e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f35271f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f35273r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f35273r = f11;
            if (f11 > 1.0f) {
                this.f35273r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f35273r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f35272n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f35273r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f35271f != null) {
            float f13 = this.f35273r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f35270e / 2.0f), j3.r0.C(1.0f, this.f35273r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f35271f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f35271f.draw(canvas);
            if (this.f35273r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f35268b)) / 5000.0f) * (-360.0f), false, this.f35267a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f35268b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i9) {
        this.f35274s.setColor(i9);
        this.f35267a.setColor(i9);
    }
}
