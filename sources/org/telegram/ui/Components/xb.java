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

public final class xb extends View {

    public final Paint f34570a;

    public long f34571b;

    public int f34572c;
    public String d;

    public int f34573e;

    public StaticLayout f34574f;
    public StaticLayout h;

    public int f34575n;

    public float f34576r;

    public final TextPaint f34577s;
    public long v;

    public final RectF f34578w;

    public xb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f34576r = 1.0f;
        this.f34578w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f34577s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f34570a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, c6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        long j10 = this.f34571b;
        int iCeil = j10 > 0 ? (int) Math.ceil(j10 / 1000.0f) : 0;
        float fDp = AndroidUtilities.dp(1.0f);
        float fDp2 = AndroidUtilities.dp(1.0f);
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(1.0f);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(1.0f);
        RectF rectF = this.f34578w;
        rectF.set(fDp, fDp2, measuredWidth, measuredHeight);
        int i10 = this.f34572c;
        TextPaint textPaint = this.f34577s;
        if (i10 != iCeil) {
            this.f34572c = iCeil;
            String strValueOf = String.valueOf(Math.max(0, iCeil));
            this.d = strValueOf;
            StaticLayout staticLayout = this.f34574f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f34576r = 0.0f;
                this.f34575n = this.f34573e;
            }
            this.f34573e = (int) Math.ceil(textPaint.measureText(strValueOf));
            this.f34574f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f10 = this.f34576r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.f34576r = f11;
            if (f11 > 1.0f) {
                this.f34576r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.f34576r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f34575n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f34576r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f34574f != null) {
            float f13 = this.f34576r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.f34573e / 2.0f), org.telegram.ui.Cells.pa.b(1.0f, this.f34576r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f34574f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f34574f.draw(canvas);
            if (this.f34576r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (Math.max(0L, this.f34571b) / 5000.0f) * (-360.0f), false, this.f34570a);
        if (this.v != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f34571b -= jCurrentTimeMillis - this.v;
            this.v = jCurrentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f34577s.setColor(i10);
        this.f34570a.setColor(i10);
    }
}
