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
public final class ic extends View {
    public final Paint f25077a;
    public long f25078b;
    public int f25079c;
    public String d;
    public int e;
    public StaticLayout f25080f;
    public StaticLayout h;
    public int f25081n;
    public float f25082r;
    public final TextPaint f25083s;
    public long v;
    public final RectF f25084w;

    public ic(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f25082r = 1.0f;
        this.f25084w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f25083s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f25077a = paint;
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
        if (this.f25078b > 0) {
            i10 = (int) Math.ceil(((float) j3) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f25084w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f25079c;
        TextPaint textPaint = this.f25083s;
        if (i11 != i10) {
            this.f25079c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f25080f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f25082r = 0.0f;
                this.f25081n = this.e;
            }
            this.e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f25080f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f25082r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f25082r = f10;
            if (f10 > 1.0f) {
                this.f25082r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f25082r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f25081n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f25082r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f25080f != null) {
            float f12 = this.f25082r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), com.google.android.gms.internal.vision.e2.b(1.0f, this.f25082r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f25080f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f25080f.draw(canvas);
            if (this.f25082r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f25078b)) / 5000.0f) * (-360.0f), false, this.f25077a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f25078b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f25083s.setColor(i10);
        this.f25077a.setColor(i10);
    }
}
