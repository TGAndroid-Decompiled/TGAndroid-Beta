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
    public float A;
    public int B;
    public float C;
    public boolean D;
    public float E;
    public boolean F;
    public long f26502a;
    public float f26503b;
    public float f26504c;
    public boolean d;
    public float f26505e;
    public final RectF f26506f;
    public boolean h;
    public float f26507n;
    public int f26508r;
    public final DecelerateInterpolator f26509s;
    public final AccelerateInterpolator v;
    public final Paint f26510w;
    public int f26511x;
    public float f26512y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f9, float f10) {
        float f11 = this.f26511x / 2.0f;
        RectF rectF = this.f26506f;
        rectF.set(f9 - f11, f10 - f11, f9 + f11, f11 + f10);
        float f12 = this.f26503b;
        float f13 = this.f26504c;
        this.f26507n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f26510w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26502a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f26502a = currentTimeMillis;
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
        RectF rectF = this.f26506f;
        rectF.set((getMeasuredWidth() - this.f26511x) / 2, (getMeasuredHeight() - this.f26511x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f9 = this.f26503b;
        float f10 = this.f26504c;
        this.f26507n = f10;
        canvas.drawArc(rectF, f9, f10, false, this.f26510w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26502a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f26502a = currentTimeMillis;
        b(j10);
    }

    @Override
    public void setAlpha(float f9) {
        super.setAlpha(f9);
        if (this.h) {
            Drawable background = getBackground();
            int i10 = (int) (f9 * 255.0f);
            if (background != null) {
                background.setAlpha(i10);
            }
            this.f26510w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.F = z10;
    }

    public void setProgress(float f9) {
        this.f26512y = f9;
        if (this.C > f9) {
            this.C = f9;
        }
        this.A = this.C;
        this.B = 0;
    }

    public void setProgressColor(int i10) {
        this.f26508r = i10;
        this.f26510w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f26511x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f9) {
        this.f26510w.setStrokeWidth(AndroidUtilities.dp(f9));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26506f = new RectF();
        this.F = true;
        this.f26511x = AndroidUtilities.dp(40.0f);
        this.f26508r = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23134h6, c6Var);
        this.f26509s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f26510w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f26508r);
    }
}
