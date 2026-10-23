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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public class RadialProgressView extends View implements org.telegram.ui.ActionBar.b6 {
    public float E;
    public int F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public final org.telegram.ui.ActionBar.g6 K;
    public int L;
    public int M;
    public long f24472a;
    public float f24473b;
    public float f24474c;
    public boolean d;
    public float e;
    public final RectF f24475f;
    public boolean h;
    public float f24476n;
    public int f24477r;
    public final DecelerateInterpolator f24478s;
    public final AccelerateInterpolator v;
    public final Paint f24479w;
    public int f24480x;
    public float f24481y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f24480x / 2.0f;
        RectF rectF = this.f24475f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f24473b;
        float f13 = this.f24474c;
        this.f24476n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f24479w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24472a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24472a = currentTimeMillis;
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
        RectF rectF = this.f24475f;
        rectF.set((getMeasuredWidth() - this.f24480x) / 2, (getMeasuredHeight() - this.f24480x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f24473b;
        float f10 = this.f24474c;
        this.f24476n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f24479w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24472a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24472a = currentTimeMillis;
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
            this.f24479w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f24481y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f24477r = i10;
        this.f24479w.setColor(i10);
    }

    public void setProgressColorKey(int i10) {
        this.L = i10;
        setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, this.K));
        this.M = this.f24477r;
    }

    public void setSize(int i10) {
        this.f24480x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f24479w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f24479w;
        if (paint != null) {
            try {
                if (this.f24477r == this.M) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(this.L, this.K);
                    this.M = w02;
                    if (w02 != this.f24477r) {
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
                FileLog.e(e);
            }
        }
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24475f = new RectF();
        this.J = true;
        int i10 = org.telegram.ui.ActionBar.k6.f21255h6;
        this.L = i10;
        this.K = g6Var;
        this.f24480x = AndroidUtilities.dp(40.0f);
        this.f24477r = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        this.f24478s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f24479w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f24477r);
        this.M = this.f24477r;
    }
}
