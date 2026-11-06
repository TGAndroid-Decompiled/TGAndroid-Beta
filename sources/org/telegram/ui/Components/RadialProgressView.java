package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.HashSet;
public class RadialProgressView extends View implements org.telegram.ui.ActionBar.a6 {
    public float D;
    public float E;
    public int F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public final org.telegram.ui.ActionBar.f6 K;
    public int L;
    public int M;
    public long f31495a;
    public float f31496b;
    public float f31497c;
    public boolean d;
    public float f31498e;
    public final RectF f31499f;
    public boolean h;
    public float f31500n;
    public int f31501r;
    public final DecelerateInterpolator f31502s;
    public final AccelerateInterpolator f31503w;
    public final Paint f31504x;
    public int f31505y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.f31505y / 2.0f;
        RectF rectF = this.f31499f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.f31496b;
        float f14 = this.f31497c;
        this.f31500n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.f31504x);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f31495a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f31495a = currentTimeMillis;
        b(j3);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.L));
    }

    public final void b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RadialProgressView.b(long):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int i7;
        int measuredHeight;
        RectF rectF = this.f31499f;
        rectF.set((getMeasuredWidth() - this.f31505y) / 2, (getMeasuredHeight() - this.f31505y) / 2, measuredWidth + i7, measuredHeight + i7);
        float f10 = this.f31496b;
        float f11 = this.f31497c;
        this.f31500n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.f31504x);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f31495a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f31495a = currentTimeMillis;
        b(j3);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (this.h) {
            Drawable background = getBackground();
            int i7 = (int) (f10 * 255.0f);
            if (background != null) {
                background.setAlpha(i7);
            }
            this.f31504x.setAlpha(i7);
        }
    }

    public void setNoProgress(boolean z9) {
        this.J = z9;
    }

    public void setProgress(float f10) {
        this.D = f10;
        if (this.G > f10) {
            this.G = f10;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i7) {
        this.f31501r = i7;
        this.f31504x.setColor(i7);
    }

    public void setProgressColorKey(int i7) {
        this.L = i7;
        setProgressColor(org.telegram.ui.ActionBar.k6.w0(i7, this.K));
        this.M = this.f31501r;
    }

    public void setSize(int i7) {
        this.f31505y = i7;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f31504x.setStrokeWidth(org.telegram.messenger.g0.L(f10));
    }

    public void setUseSelfAlpha(boolean z9) {
        this.h = z9;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f31504x;
        if (paint != null) {
            try {
                if (this.f31501r == this.M) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(this.L, this.K);
                    this.M = w02;
                    if (w02 != this.f31501r) {
                        int alpha = paint.getAlpha();
                        setProgressColor(w02);
                        this.M = w02;
                        if (this.h) {
                            paint.setAlpha(alpha);
                        }
                        invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f31499f = new RectF();
        this.J = true;
        int i7 = org.telegram.ui.ActionBar.k6.f27923h6;
        this.L = i7;
        this.K = f6Var;
        this.f31505y = org.telegram.messenger.g0.L(40.0f);
        this.f31501r = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        this.f31502s = new DecelerateInterpolator();
        this.f31503w = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f31504x = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(this.f31501r);
        this.M = this.f31501r;
    }
}
