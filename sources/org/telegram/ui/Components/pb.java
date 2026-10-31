package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public class pb extends View {
    public final Paint f29330a;
    public long f29331b;
    public int f29332c;
    public String d;
    public int e;
    public StaticLayout f29333f;
    public StaticLayout h;
    public int f29334n;
    public float f29335r;
    public final TextPaint f29336s;
    public long f29337w;
    public final RectF f29338x;

    public pb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f29335r = 1.0f;
        this.f29338x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f29336s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.f29330a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, p6Var));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        int i10;
        String valueOf;
        super.onDraw(canvas);
        if (this.f29331b > 0) {
            i10 = (int) Math.ceil(((float) j10) / 1000.0f);
        } else {
            i10 = 0;
        }
        RectF rectF = this.f29338x;
        rectF.set(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(1.0f));
        int i11 = this.f29332c;
        TextPaint textPaint = this.f29336s;
        if (i11 != i10) {
            this.f29332c = i10;
            this.d = String.valueOf(Math.max(0, i10));
            StaticLayout staticLayout = this.f29333f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.f29335r = 0.0f;
                this.f29334n = this.e;
            }
            this.e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f29333f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.f29335r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.f29335r = f10;
            if (f10 > 1.0f) {
                this.f29335r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.f29335r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.f29334n / 2.0f), ((org.telegram.messenger.i0.L(10.0f) * this.f29335r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.i0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f29333f != null) {
            float f12 = this.f29335r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), sc.e.z(1.0f, this.f29335r, org.telegram.messenger.i0.L(10.0f), rectF.centerY() - (this.f29333f.getHeight() / 2.0f)) - org.telegram.messenger.i0.L(0.5f));
            this.f29333f.draw(canvas);
            if (this.f29335r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.f29331b)) / 5000.0f) * (-360.0f), false, this.f29330a);
        if (this.f29337w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f29331b -= currentTimeMillis - this.f29337w;
            this.f29337w = currentTimeMillis;
        } else {
            this.f29337w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.f29336s.setColor(i10);
        this.f29330a.setColor(i10);
    }
}
