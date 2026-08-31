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
    public final Paint f25558a;
    public long f25559b;
    public int f25560c;
    public String d;
    public int f25561e;
    public StaticLayout f25562f;
    public StaticLayout h;
    public int f25563n;
    public float f25564r;
    public final TextPaint f25565s;
    public long v;
    public final RectF f25566w;

    public bc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f25564r = 1.0f;
        this.f25566w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f25565s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f25558a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Hi, g6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f25559b > 0) {
            i10 = (int) Math.ceil(((float) j10) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f25566w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f25560c;
        TextPaint textPaint = this.f25565s;
        if (i11 != i10) {
            this.f25560c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f25562f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f25564r = 0.0f;
                this.f25563n = this.f25561e;
            }
            this.f25561e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f25562f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f25564r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f25564r = f11;
            if (f11 > 1.0f) {
                this.f25564r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f25564r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f25563n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f25564r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f25562f != null) {
            float f13 = this.f25564r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f25561e / 2.0f), org.telegram.ui.yh.c(1.0f, this.f25564r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f25562f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f25562f.draw(canvas);
            if (this.f25564r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f25559b)) / 5000.0f) * (-360.0f), false, this.f25558a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f25559b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f25565s.setColor(i10);
        this.f25558a.setColor(i10);
    }
}
