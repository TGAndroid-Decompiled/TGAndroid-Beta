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
    public long f24094a;
    public float f24095b;
    public float f24096c;
    public boolean d;
    public float f24097e;
    public final RectF f24098f;
    public boolean h;
    public float f24099n;
    public int f24100r;
    public final DecelerateInterpolator f24101s;
    public final AccelerateInterpolator v;
    public final Paint f24102w;
    public int f24103x;
    public float f24104y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f24103x / 2.0f;
        RectF rectF = this.f24098f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f24095b;
        float f13 = this.f24096c;
        this.f24099n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f24102w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24094a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f24094a = currentTimeMillis;
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
        RectF rectF = this.f24098f;
        rectF.set((getMeasuredWidth() - this.f24103x) / 2, (getMeasuredHeight() - this.f24103x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f24095b;
        float f10 = this.f24096c;
        this.f24099n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f24102w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24094a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f24094a = currentTimeMillis;
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
            this.f24102w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f24104y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f24100r = i10;
        this.f24102w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f24103x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f24102w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24098f = new RectF();
        this.J = true;
        this.f24103x = AndroidUtilities.dp(40.0f);
        this.f24100r = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20736h6, f6Var);
        this.f24101s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f24102w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f24100r);
    }
}
