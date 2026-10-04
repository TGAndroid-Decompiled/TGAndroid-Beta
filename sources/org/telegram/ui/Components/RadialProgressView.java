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
    public long f24279a;
    public float f24280b;
    public float f24281c;
    public boolean d;
    public float f24282e;
    public final RectF f24283f;
    public boolean h;
    public float f24284n;
    public int f24285r;
    public final DecelerateInterpolator f24286s;
    public final AccelerateInterpolator v;
    public final Paint f24287w;
    public int f24288x;
    public float f24289y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f24288x / 2.0f;
        RectF rectF = this.f24283f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f24280b;
        float f13 = this.f24281c;
        this.f24284n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f24287w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24279a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f24279a = currentTimeMillis;
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
        RectF rectF = this.f24283f;
        rectF.set((getMeasuredWidth() - this.f24288x) / 2, (getMeasuredHeight() - this.f24288x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f24280b;
        float f10 = this.f24281c;
        this.f24284n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f24287w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f24279a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f24279a = currentTimeMillis;
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
            this.f24287w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f24289y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f24285r = i10;
        this.f24287w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f24288x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f24287w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24283f = new RectF();
        this.J = true;
        this.f24288x = AndroidUtilities.dp(40.0f);
        this.f24285r = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20890h6, d6Var);
        this.f24286s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f24287w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f24285r);
    }
}
