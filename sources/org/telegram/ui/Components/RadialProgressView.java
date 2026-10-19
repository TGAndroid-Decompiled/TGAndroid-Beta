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
    public long f24325a;
    public float f24326b;
    public float f24327c;
    public boolean d;
    public float e;
    public final RectF f24328f;
    public boolean h;
    public float f24329n;
    public int f24330r;
    public final DecelerateInterpolator f24331s;
    public final AccelerateInterpolator v;
    public final Paint f24332w;
    public int f24333x;
    public float f24334y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f24333x / 2.0f;
        RectF rectF = this.f24328f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f24326b;
        float f13 = this.f24327c;
        this.f24329n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f24332w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24325a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24325a = currentTimeMillis;
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
        RectF rectF = this.f24328f;
        rectF.set((getMeasuredWidth() - this.f24333x) / 2, (getMeasuredHeight() - this.f24333x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f24326b;
        float f10 = this.f24327c;
        this.f24329n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f24332w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24325a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24325a = currentTimeMillis;
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
            this.f24332w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f24334y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f24330r = i10;
        this.f24332w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f24333x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f24332w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24328f = new RectF();
        this.J = true;
        this.f24333x = AndroidUtilities.dp(40.0f);
        this.f24330r = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21061h6, d6Var);
        this.f24331s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f24332w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f24330r);
    }
}
