package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public class RadialProgressView extends View {
    public float E;
    public int F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public long f23267a;
    public float f23268b;
    public float f23269c;
    public boolean d;
    public float e;
    public final RectF f23270f;
    public boolean h;
    public float f23271n;
    public int f23272r;
    public final DecelerateInterpolator f23273s;
    public final AccelerateInterpolator v;
    public final Paint f23274w;
    public int f23275x;
    public float f23276y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f23275x / 2.0f;
        RectF rectF = this.f23270f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f23268b;
        float f13 = this.f23269c;
        this.f23271n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f23274w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f23267a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f23267a = currentTimeMillis;
        b(j10);
    }

    public final void b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RadialProgressView.b(long):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int i10;
        int measuredHeight;
        RectF rectF = this.f23270f;
        rectF.set((getMeasuredWidth() - this.f23275x) / 2, (getMeasuredHeight() - this.f23275x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f23268b;
        float f10 = this.f23269c;
        this.f23271n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f23274w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f23267a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f23267a = currentTimeMillis;
        b(j10);
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (this.h) {
            Drawable background = getBackground();
            int i10 = (int) (f7 * 255.0f);
            if (background != null) {
                background.setAlpha(i10);
            }
            this.f23274w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f23276y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f23272r = i10;
        this.f23274w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f23275x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f23274w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f23270f = new RectF();
        this.J = true;
        this.f23275x = AndroidUtilities.dp(40.0f);
        this.f23272r = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19973h6, c6Var);
        this.f23273s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f23274w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f23272r);
    }
}
