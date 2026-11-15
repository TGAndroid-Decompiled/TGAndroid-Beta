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
public class RadialProgressView extends View implements org.telegram.ui.ActionBar.z5 {
    public float E;
    public float F;
    public int G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public final org.telegram.ui.ActionBar.e6 L;
    public int M;
    public int N;
    public long f32678a;
    public float f32679b;
    public float f32680c;
    public boolean d;
    public float f32681e;
    public final RectF f32682f;
    public boolean h;
    public float f32683n;
    public int f32684r;
    public final DecelerateInterpolator f32685s;
    public final AccelerateInterpolator f32686w;
    public final Paint f32687x;
    public int f32688y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.f32688y / 2.0f;
        RectF rectF = this.f32682f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.f32679b;
        float f14 = this.f32680c;
        this.f32683n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.f32687x);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f32678a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f32678a = currentTimeMillis;
        b(j3);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.M));
    }

    public final void b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RadialProgressView.b(long):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int i7;
        int measuredHeight;
        RectF rectF = this.f32682f;
        rectF.set((getMeasuredWidth() - this.f32688y) / 2, (getMeasuredHeight() - this.f32688y) / 2, measuredWidth + i7, measuredHeight + i7);
        float f10 = this.f32679b;
        float f11 = this.f32680c;
        this.f32683n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.f32687x);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f32678a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f32678a = currentTimeMillis;
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
            this.f32687x.setAlpha(i7);
        }
    }

    public void setNoProgress(boolean z10) {
        this.K = z10;
    }

    public void setProgress(float f10) {
        this.E = f10;
        if (this.H > f10) {
            this.H = f10;
        }
        this.F = this.H;
        this.G = 0;
    }

    public void setProgressColor(int i7) {
        this.f32684r = i7;
        this.f32687x.setColor(i7);
    }

    public void setProgressColorKey(int i7) {
        this.M = i7;
        setProgressColor(org.telegram.ui.ActionBar.j6.w0(i7, this.L));
        this.N = this.f32684r;
    }

    public void setSize(int i7) {
        this.f32688y = i7;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f32687x.setStrokeWidth(org.telegram.messenger.g0.L(f10));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f32687x;
        if (paint != null) {
            try {
                if (this.f32684r == this.N) {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(this.M, this.L);
                    this.N = w02;
                    if (w02 != this.f32684r) {
                        int alpha = paint.getAlpha();
                        setProgressColor(w02);
                        this.N = w02;
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

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32682f = new RectF();
        this.K = true;
        int i7 = org.telegram.ui.ActionBar.j6.f28923h6;
        this.M = i7;
        this.L = e6Var;
        this.f32688y = org.telegram.messenger.g0.L(40.0f);
        this.f32684r = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        this.f32685s = new DecelerateInterpolator();
        this.f32686w = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f32687x = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(this.f32684r);
        this.N = this.f32684r;
    }
}
