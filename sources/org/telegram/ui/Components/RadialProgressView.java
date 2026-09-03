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
    public float B;
    public int C;
    public float D;
    public boolean E;
    public float F;
    public boolean G;
    public long f24991a;
    public float f24992b;
    public float f24993c;
    public boolean d;
    public float f24994e;
    public final RectF f24995f;
    public boolean h;
    public float f24996n;
    public int f24997r;
    public final DecelerateInterpolator f24998s;
    public final AccelerateInterpolator v;
    public final Paint f24999w;
    public int f25000x;
    public float f25001y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.f25000x / 2.0f;
        RectF rectF = this.f24995f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.f24992b;
        float f14 = this.f24993c;
        this.f24996n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.f24999w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24991a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24991a = currentTimeMillis;
        b(j10);
    }

    public final void b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RadialProgressView.b(long):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int i10;
        int measuredHeight;
        RectF rectF = this.f24995f;
        rectF.set((getMeasuredWidth() - this.f25000x) / 2, (getMeasuredHeight() - this.f25000x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f10 = this.f24992b;
        float f11 = this.f24993c;
        this.f24996n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.f24999w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24991a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24991a = currentTimeMillis;
        b(j10);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (this.h) {
            Drawable background = getBackground();
            int i10 = (int) (f10 * 255.0f);
            if (background != null) {
                background.setAlpha(i10);
            }
            this.f24999w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z4) {
        this.G = z4;
    }

    public void setProgress(float f10) {
        this.f25001y = f10;
        if (this.D > f10) {
            this.D = f10;
        }
        this.B = this.D;
        this.C = 0;
    }

    public void setProgressColor(int i10) {
        this.f24997r = i10;
        this.f24999w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f25000x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f24999w.setStrokeWidth(AndroidUtilities.dp(f10));
    }

    public void setUseSelfAlpha(boolean z4) {
        this.h = z4;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24995f = new RectF();
        this.G = true;
        this.f25000x = AndroidUtilities.dp(40.0f);
        this.f24997r = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21734h6, g6Var);
        this.f24998s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f24999w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f24997r);
    }
}
