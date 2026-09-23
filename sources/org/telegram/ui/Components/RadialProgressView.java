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
    public long f22118a;
    public float f22119b;
    public float f22120c;
    public boolean d;
    public float e;
    public final RectF f22121f;
    public boolean h;
    public float f22122n;
    public int f22123r;
    public final DecelerateInterpolator f22124s;
    public final AccelerateInterpolator v;
    public final Paint f22125w;
    public int f22126x;
    public float f22127y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f22126x / 2.0f;
        RectF rectF = this.f22121f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f22119b;
        float f13 = this.f22120c;
        this.f22122n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f22125w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f22118a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f22118a = currentTimeMillis;
        b(j3);
    }

    public final void b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RadialProgressView.b(long):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int i10;
        int measuredHeight;
        RectF rectF = this.f22121f;
        rectF.set((getMeasuredWidth() - this.f22126x) / 2, (getMeasuredHeight() - this.f22126x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f22119b;
        float f10 = this.f22120c;
        this.f22122n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f22125w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f22118a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f22118a = currentTimeMillis;
        b(j3);
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
            this.f22125w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f22127y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f22123r = i10;
        this.f22125w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f22126x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f22125w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22121f = new RectF();
        this.J = true;
        this.f22126x = AndroidUtilities.dp(40.0f);
        this.f22123r = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18860h6, d6Var);
        this.f22124s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f22125w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f22123r);
    }
}
