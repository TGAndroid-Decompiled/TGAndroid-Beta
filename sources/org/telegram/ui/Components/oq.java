package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class oq extends View implements org.telegram.ui.ActionBar.c6 {
    public final Paint f38152a;
    public final Paint f38153b;
    public final RectF f38154c;
    public int d;
    public long f38155e;
    public int f38156f;
    public int h;
    public int f38157n;
    public int f38158r;

    public oq(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f38152a = paint;
        Paint paint2 = new Paint(1);
        this.f38153b = paint2;
        this.f38154c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i7 == 0) {
            this.f38156f = org.telegram.ui.ActionBar.n6.B7;
            this.h = org.telegram.ui.ActionBar.n6.C7;
        } else if (i7 == 1) {
            this.f38156f = org.telegram.ui.ActionBar.n6.D7;
            this.h = org.telegram.ui.ActionBar.n6.E7;
        } else if (i7 == 2) {
            this.f38156f = org.telegram.ui.ActionBar.n6.F7;
            this.h = org.telegram.ui.ActionBar.n6.G7;
        } else if (i7 == 3) {
            this.f38156f = org.telegram.ui.ActionBar.n6.H7;
            this.h = org.telegram.ui.ActionBar.n6.I7;
        }
        updateColors();
    }

    public final void a(int i7, int i10) {
        this.f38156f = -1;
        this.h = -1;
        this.f38157n = i7;
        this.f38158r = i10;
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38155e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f38155e;
        this.f38155e = currentTimeMillis;
        this.d = (int) ((((float) (j3 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(9.0f);
        RectF rectF = this.f38154c;
        rectF.set(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(18.0f) + measuredWidth, org.telegram.messenger.g0.L(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(9.0f), this.f38152a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f38153b);
        invalidate();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f38155e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i7 = this.f38156f;
        Paint paint = this.f38152a;
        if (i7 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        } else {
            paint.setColor(this.f38157n);
        }
        int i10 = this.h;
        Paint paint2 = this.f38153b;
        if (i10 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        } else {
            paint2.setColor(this.f38158r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
