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
    public long f26491a;
    public float f26492b;
    public float f26493c;
    public boolean d;
    public float f26494e;
    public final RectF f26495f;
    public boolean h;
    public float f26496n;
    public int f26497r;
    public final DecelerateInterpolator f26498s;
    public final AccelerateInterpolator v;
    public final Paint f26499w;
    public int f26500x;
    public float f26501y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.f26500x / 2.0f;
        RectF rectF = this.f26495f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.f26492b;
        float f14 = this.f26493c;
        this.f26496n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.f26499w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26491a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f26491a = currentTimeMillis;
        b(j10);
    }

    public final void b(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RadialProgressView.b(long):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int i9;
        int measuredHeight;
        RectF rectF = this.f26495f;
        rectF.set((getMeasuredWidth() - this.f26500x) / 2, (getMeasuredHeight() - this.f26500x) / 2, measuredWidth + i9, measuredHeight + i9);
        float f10 = this.f26492b;
        float f11 = this.f26493c;
        this.f26496n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.f26499w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f26491a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f26491a = currentTimeMillis;
        b(j10);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (this.h) {
            Drawable background = getBackground();
            int i9 = (int) (f10 * 255.0f);
            if (background != null) {
                background.setAlpha(i9);
            }
            this.f26499w.setAlpha(i9);
        }
    }

    public void setNoProgress(boolean z10) {
        this.F = z10;
    }

    public void setProgress(float f10) {
        this.f26501y = f10;
        if (this.C > f10) {
            this.C = f10;
        }
        this.A = this.C;
        this.B = 0;
    }

    public void setProgressColor(int i9) {
        this.f26497r = i9;
        this.f26499w.setColor(i9);
    }

    public void setSize(int i9) {
        this.f26500x = i9;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f26499w.setStrokeWidth(AndroidUtilities.dp(f10));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f26495f = new RectF();
        this.F = true;
        this.f26500x = AndroidUtilities.dp(40.0f);
        this.f26497r = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23073h6, b6Var);
        this.f26498s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f26499w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f26497r);
    }
}
