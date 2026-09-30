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
    public long f22371a;
    public float f22372b;
    public float f22373c;
    public boolean d;
    public float e;
    public final RectF f22374f;
    public boolean h;
    public float f22375n;
    public int f22376r;
    public final DecelerateInterpolator f22377s;
    public final AccelerateInterpolator v;
    public final Paint f22378w;
    public int f22379x;
    public float f22380y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f22379x / 2.0f;
        RectF rectF = this.f22374f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f22372b;
        float f13 = this.f22373c;
        this.f22375n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f22378w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f22371a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f22371a = currentTimeMillis;
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
        RectF rectF = this.f22374f;
        rectF.set((getMeasuredWidth() - this.f22379x) / 2, (getMeasuredHeight() - this.f22379x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f22372b;
        float f10 = this.f22373c;
        this.f22375n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f22378w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f22371a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f22371a = currentTimeMillis;
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
            this.f22378w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f22380y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f22376r = i10;
        this.f22378w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f22379x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f22378w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22374f = new RectF();
        this.J = true;
        this.f22379x = AndroidUtilities.dp(40.0f);
        this.f22376r = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19132h6, d6Var);
        this.f22377s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f22378w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f22376r);
    }
}
