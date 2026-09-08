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
    public long f24120a;
    public float f24121b;
    public float f24122c;
    public boolean d;
    public float f24123e;
    public final RectF f24124f;
    public boolean h;
    public float f24125n;
    public int f24126r;
    public final DecelerateInterpolator f24127s;
    public final AccelerateInterpolator v;
    public final Paint f24128w;
    public int f24129x;
    public float f24130y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f24129x / 2.0f;
        RectF rectF = this.f24124f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f24121b;
        float f13 = this.f24122c;
        this.f24125n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f24128w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24120a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f24120a = currentTimeMillis;
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
        RectF rectF = this.f24124f;
        rectF.set((getMeasuredWidth() - this.f24129x) / 2, (getMeasuredHeight() - this.f24129x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f24121b;
        float f10 = this.f24122c;
        this.f24125n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f24128w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24120a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f24120a = currentTimeMillis;
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
            this.f24128w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f24130y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f24126r = i10;
        this.f24128w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f24129x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f24128w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24124f = new RectF();
        this.J = true;
        this.f24129x = AndroidUtilities.dp(40.0f);
        this.f24126r = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20762h6, f6Var);
        this.f24127s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f24128w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f24126r);
    }
}
