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
public class RadialProgressView extends View implements org.telegram.ui.ActionBar.p6 {
    public float E;
    public int F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public final org.telegram.ui.ActionBar.u6 K;
    public int L;
    public int M;
    public long f26263a;
    public float f26264b;
    public float f26265c;
    public boolean d;
    public float e;
    public final RectF f26266f;
    public boolean h;
    public float f26267n;
    public int f26268r;
    public final DecelerateInterpolator f26269s;
    public final AccelerateInterpolator v;
    public final Paint f26270w;
    public int f26271x;
    public float f26272y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f26271x / 2.0f;
        RectF rectF = this.f26266f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f26264b;
        float f13 = this.f26265c;
        this.f26267n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f26270w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26263a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f26263a = currentTimeMillis;
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
        RectF rectF = this.f26266f;
        rectF.set((getMeasuredWidth() - this.f26271x) / 2, (getMeasuredHeight() - this.f26271x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f26264b;
        float f10 = this.f26265c;
        this.f26267n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f26270w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26263a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f26263a = currentTimeMillis;
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
            this.f26270w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f26272y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f26268r = i10;
        this.f26270w.setColor(i10);
    }

    public void setProgressColorKey(int i10) {
        this.L = i10;
        setProgressColor(org.telegram.ui.ActionBar.y6.w0(i10, this.K));
        this.M = this.f26268r;
    }

    public void setSize(int i10) {
        this.f26271x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f26270w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f26270w;
        if (paint != null) {
            try {
                if (this.f26268r == this.M) {
                    int w02 = org.telegram.ui.ActionBar.y6.w0(this.L, this.K);
                    this.M = w02;
                    if (w02 != this.f26268r) {
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

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f26266f = new RectF();
        this.J = true;
        int i10 = org.telegram.ui.ActionBar.y6.f23426h6;
        this.L = i10;
        this.K = u6Var;
        this.f26271x = AndroidUtilities.dp(40.0f);
        this.f26268r = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        this.f26269s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f26270w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f26268r);
        this.M = this.f26268r;
    }
}
