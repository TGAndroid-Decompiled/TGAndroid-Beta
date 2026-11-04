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
    public long f31571a;
    public float f31572b;
    public float f31573c;
    public boolean d;
    public float f31574e;
    public final RectF f31575f;
    public boolean h;
    public float f31576n;
    public int f31577r;
    public final DecelerateInterpolator f31578s;
    public final AccelerateInterpolator f31579w;
    public final Paint f31580x;
    public int f31581y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.f31581y / 2.0f;
        RectF rectF = this.f31575f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.f31572b;
        float f14 = this.f31573c;
        this.f31576n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.f31580x);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f31571a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f31571a = currentTimeMillis;
        b(j10);
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
        int i3;
        int measuredHeight;
        RectF rectF = this.f31575f;
        rectF.set((getMeasuredWidth() - this.f31581y) / 2, (getMeasuredHeight() - this.f31581y) / 2, measuredWidth + i3, measuredHeight + i3);
        float f10 = this.f31572b;
        float f11 = this.f31573c;
        this.f31576n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.f31580x);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f31571a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f31571a = currentTimeMillis;
        b(j10);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (this.h) {
            Drawable background = getBackground();
            int i3 = (int) (f10 * 255.0f);
            if (background != null) {
                background.setAlpha(i3);
            }
            this.f31580x.setAlpha(i3);
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

    public void setProgressColor(int i3) {
        this.f31577r = i3;
        this.f31580x.setColor(i3);
    }

    public void setProgressColorKey(int i3) {
        this.M = i3;
        setProgressColor(org.telegram.ui.ActionBar.k6.w0(i3, this.L));
        this.N = this.f31577r;
    }

    public void setSize(int i3) {
        this.f31581y = i3;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f31580x.setStrokeWidth(org.telegram.messenger.g0.L(f10));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f31580x;
        if (paint != null) {
            try {
                if (this.f31577r == this.N) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(this.M, this.L);
                    this.N = w02;
                    if (w02 != this.f31577r) {
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
        this.f31575f = new RectF();
        this.K = true;
        int i3 = org.telegram.ui.ActionBar.k6.f27955h6;
        this.M = i3;
        this.L = e6Var;
        this.f31581y = org.telegram.messenger.g0.L(40.0f);
        this.f31577r = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        this.f31578s = new DecelerateInterpolator();
        this.f31579w = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f31580x = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(this.f31577r);
        this.N = this.f31577r;
    }
}
