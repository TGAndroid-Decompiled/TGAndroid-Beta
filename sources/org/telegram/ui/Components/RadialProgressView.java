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
public class RadialProgressView extends View implements org.telegram.ui.ActionBar.k6 {
    public float D;
    public float E;
    public int F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public final org.telegram.ui.ActionBar.p6 K;
    public int L;
    public int M;
    public long f24145a;
    public float f24146b;
    public float f24147c;
    public boolean d;
    public float e;
    public final RectF f24148f;
    public boolean h;
    public float f24149n;
    public int f24150r;
    public final DecelerateInterpolator f24151s;
    public final AccelerateInterpolator f24152w;
    public final Paint f24153x;
    public int f24154y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f24154y / 2.0f;
        RectF rectF = this.f24148f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f24146b;
        float f13 = this.f24147c;
        this.f24149n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f24153x);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24145a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24145a = currentTimeMillis;
        b(j10);
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
        int i10;
        int measuredHeight;
        RectF rectF = this.f24148f;
        rectF.set((getMeasuredWidth() - this.f24154y) / 2, (getMeasuredHeight() - this.f24154y) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f24146b;
        float f10 = this.f24147c;
        this.f24149n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f24153x);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24145a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24145a = currentTimeMillis;
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
            this.f24153x.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.D = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f24150r = i10;
        this.f24153x.setColor(i10);
    }

    public void setProgressColorKey(int i10) {
        this.L = i10;
        setProgressColor(org.telegram.ui.ActionBar.t6.w0(i10, this.K));
        this.M = this.f24150r;
    }

    public void setSize(int i10) {
        this.f24154y = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f24153x.setStrokeWidth(org.telegram.messenger.i0.L(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f24153x;
        if (paint != null) {
            try {
                if (this.f24150r == this.M) {
                    int w02 = org.telegram.ui.ActionBar.t6.w0(this.L, this.K);
                    this.M = w02;
                    if (w02 != this.f24150r) {
                        int alpha = paint.getAlpha();
                        setProgressColor(w02);
                        this.M = w02;
                        if (this.h) {
                            paint.setAlpha(alpha);
                        }
                        invalidate();
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f24148f = new RectF();
        this.J = true;
        int i10 = org.telegram.ui.ActionBar.t6.f21002h6;
        this.L = i10;
        this.K = p6Var;
        this.f24154y = org.telegram.messenger.i0.L(40.0f);
        this.f24150r = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.f24151s = new DecelerateInterpolator();
        this.f24152w = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f24153x = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint.setColor(this.f24150r);
        this.M = this.f24150r;
    }
}
