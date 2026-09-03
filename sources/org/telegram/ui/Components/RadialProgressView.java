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
    public long f23107a;
    public float f23108b;
    public float f23109c;
    public boolean d;
    public float e;
    public final RectF f23110f;
    public boolean h;
    public float f23111n;
    public int f23112r;
    public final DecelerateInterpolator f23113s;
    public final AccelerateInterpolator v;
    public final Paint f23114w;
    public int f23115x;
    public float f23116y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.f23115x / 2.0f;
        RectF rectF = this.f23110f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.f23108b;
        float f14 = this.f23109c;
        this.f23111n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.f23114w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f23107a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f23107a = currentTimeMillis;
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
        RectF rectF = this.f23110f;
        rectF.set((getMeasuredWidth() - this.f23115x) / 2, (getMeasuredHeight() - this.f23115x) / 2, measuredWidth + i10, measuredHeight + i10);
        float f10 = this.f23108b;
        float f11 = this.f23109c;
        this.f23111n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.f23114w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f23107a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f23107a = currentTimeMillis;
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
            this.f23114w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z4) {
        this.G = z4;
    }

    public void setProgress(float f10) {
        this.f23116y = f10;
        if (this.D > f10) {
            this.D = f10;
        }
        this.B = this.D;
        this.C = 0;
    }

    public void setProgressColor(int i10) {
        this.f23112r = i10;
        this.f23114w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f23115x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f23114w.setStrokeWidth(AndroidUtilities.dp(f10));
    }

    public void setUseSelfAlpha(boolean z4) {
        this.h = z4;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23110f = new RectF();
        this.G = true;
        this.f23115x = AndroidUtilities.dp(40.0f);
        this.f23112r = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19953h6, f6Var);
        this.f23113s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f23114w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f23112r);
    }
}
