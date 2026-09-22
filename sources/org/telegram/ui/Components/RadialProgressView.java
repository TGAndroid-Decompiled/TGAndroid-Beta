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
    public long f22144a;
    public float f22145b;
    public float f22146c;
    public boolean d;
    public float e;
    public final RectF f22147f;
    public boolean h;
    public float f22148n;
    public int f22149r;
    public final DecelerateInterpolator f22150s;
    public final AccelerateInterpolator v;
    public final Paint f22151w;
    public int f22152x;
    public float f22153y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.f22152x / 2.0f;
        RectF rectF = this.f22147f;
        rectF.set(f7 - f11, f10 - f11, f7 + f11, f11 + f10);
        float f12 = this.f22145b;
        float f13 = this.f22146c;
        this.f22148n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.f22151w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f22144a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f22144a = currentTimeMillis;
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
        RectF rectF = this.f22147f;
        rectF.set((getMeasuredWidth() - this.f22152x) / 2, (getMeasuredHeight() - this.f22152x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f7 = this.f22145b;
        float f10 = this.f22146c;
        this.f22148n = f10;
        canvas.drawArc(rectF, f7, f10, false, this.f22151w);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f22144a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f22144a = currentTimeMillis;
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
            this.f22151w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.J = z10;
    }

    public void setProgress(float f7) {
        this.f22153y = f7;
        if (this.G > f7) {
            this.G = f7;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i10) {
        this.f22149r = i10;
        this.f22151w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f22152x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.f22151w.setStrokeWidth(AndroidUtilities.dp(f7));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f22147f = new RectF();
        this.J = true;
        this.f22152x = AndroidUtilities.dp(40.0f);
        this.f22149r = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18905h6, e6Var);
        this.f22150s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f22151w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f22149r);
    }
}
