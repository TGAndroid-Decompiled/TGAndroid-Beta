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
    public long f24322a;
    public float f24323b;
    public float f24324c;
    public boolean d;
    public float e;
    public final RectF f24325f;
    public boolean h;
    public float f24326n;
    public int f24327r;
    public final DecelerateInterpolator f24328s;
    public final AccelerateInterpolator v;
    public final Paint f24329w;
    public int f24330x;
    public float f24331y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f24330x / 2.0f;
        RectF rectF = this.f24325f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f24323b;
        float f13 = this.f24324c;
        this.f24326n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f24329w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24322a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24322a = currentTimeMillis;
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
        RectF rectF = this.f24325f;
        rectF.set((getMeasuredWidth() - this.f24330x) / 2, (getMeasuredHeight() - this.f24330x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f24323b;
        float f10 = this.f24324c;
        this.f24326n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f24329w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f24322a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f24322a = currentTimeMillis;
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
            this.f24329w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f24331y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f24327r = i10;
        this.f24329w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f24330x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f24329w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24325f = new RectF();
        this.J = true;
        this.f24330x = AndroidUtilities.dp(40.0f);
        this.f24327r = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21058h6, d6Var);
        this.f24328s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f24329w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f24327r);
    }
}
