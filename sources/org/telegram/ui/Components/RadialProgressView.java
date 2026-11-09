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
public class RadialProgressView extends View implements org.telegram.ui.ActionBar.b6 {
    public float D;
    public float E;
    public int F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public final org.telegram.ui.ActionBar.g6 K;
    public int L;
    public int M;
    public long f31504a;
    public float f31505b;
    public float f31506c;
    public boolean d;
    public float f31507e;
    public final RectF f31508f;
    public boolean h;
    public float f31509n;
    public int f31510r;
    public final DecelerateInterpolator f31511s;
    public final AccelerateInterpolator f31512w;
    public final Paint f31513x;
    public int f31514y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.f31514y / 2.0f;
        RectF rectF = this.f31508f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.f31505b;
        float f14 = this.f31506c;
        this.f31509n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.f31513x);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f31504a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f31504a = currentTimeMillis;
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
        RectF rectF = this.f31508f;
        rectF.set((getMeasuredWidth() - this.f31514y) / 2, (getMeasuredHeight() - this.f31514y) / 2, measuredWidth + i7, measuredHeight + i7);
        float f10 = this.f31505b;
        float f11 = this.f31506c;
        this.f31509n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.f31513x);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f31504a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f31504a = currentTimeMillis;
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
            this.f31513x.setAlpha(i7);
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
        this.f31510r = i7;
        this.f31513x.setColor(i7);
    }

    public void setProgressColorKey(int i7) {
        this.L = i7;
        setProgressColor(org.telegram.ui.ActionBar.l6.w0(i7, this.K));
        this.M = this.f31510r;
    }

    public void setSize(int i7) {
        this.f31514y = i7;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f31513x.setStrokeWidth(org.telegram.messenger.g0.L(f10));
    }

    public void setUseSelfAlpha(boolean z9) {
        this.h = z9;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f31513x;
        if (paint != null) {
            try {
                if (this.f31510r == this.M) {
                    int w02 = org.telegram.ui.ActionBar.l6.w0(this.L, this.K);
                    this.M = w02;
                    if (w02 != this.f31510r) {
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

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f31508f = new RectF();
        this.J = true;
        int i7 = org.telegram.ui.ActionBar.l6.f27939h6;
        this.L = i7;
        this.K = g6Var;
        this.f31514y = org.telegram.messenger.g0.L(40.0f);
        this.f31510r = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        this.f31511s = new DecelerateInterpolator();
        this.f31512w = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f31513x = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(this.f31510r);
        this.M = this.f31510r;
    }
}
