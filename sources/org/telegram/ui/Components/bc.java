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
public final class bc extends View {
    public final Paint f23627a;
    public long f23628b;
    public int f23629c;
    public String d;
    public int e;
    public StaticLayout f23630f;
    public StaticLayout h;
    public int f23631n;
    public float f23632r;
    public final TextPaint f23633s;
    public long v;
    public final RectF f23634w;

    public bc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23632r = 1.0f;
        this.f23634w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f23633s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f23627a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f23628b > 0) {
            i10 = (int) Math.ceil(((float) j10) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f23634w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f23629c;
        TextPaint textPaint = this.f23633s;
        if (i11 != i10) {
            this.f23629c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f23630f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f23632r = 0.0f;
                this.f23631n = this.e;
            }
            this.e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f23630f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f23632r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f23632r = f11;
            if (f11 > 1.0f) {
                this.f23632r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f23632r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f23631n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f23632r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f23630f != null) {
            float f13 = this.f23632r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), org.telegram.ui.yh.c(1.0f, this.f23632r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f23630f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f23630f.draw(canvas);
            if (this.f23632r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f23628b)) / 5000.0f) * (-360.0f), false, this.f23627a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f23628b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f23633s.setColor(i10);
        this.f23627a.setColor(i10);
    }
}
