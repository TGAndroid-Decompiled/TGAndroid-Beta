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
public class jc extends View {
    public final Paint f29600a;
    public long f29601b;
    public int f29602c;
    public String d;
    public int e;
    public StaticLayout f29603f;
    public StaticLayout h;
    public int f29604n;
    public float f29605r;
    public final TextPaint f29606s;
    public long v;
    public final RectF f29607w;

    public jc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f29605r = 1.0f;
        this.f29607w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f29606s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f29600a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Hi, u6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f29601b > 0) {
            i10 = (int) Math.ceil(((float) j10) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f29607w;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        int i11 = this.f29602c;
        TextPaint textPaint = this.f29606s;
        if (i11 != i10) {
            this.f29602c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f29603f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f29605r = 0.0f;
                this.f29604n = this.e;
            }
            this.e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f29603f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f29605r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f29605r = f10;
            if (f10 > 1.0f) {
                this.f29605r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f29605r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f29604n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.f29605r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f29603f != null) {
            float f12 = this.f29605r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), ic.a.d(1.0f, this.f29605r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f29603f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f29603f.draw(canvas);
            if (this.f29605r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f29601b)) / 5000.0f) * (-360.0f), false, this.f29600a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f29601b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f29606s.setColor(i10);
        this.f29600a.setColor(i10);
    }
}
