package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class zp extends View implements org.telegram.ui.ActionBar.a6 {
    public final Paint f41077a;
    public final Paint f41078b;
    public final RectF f41079c;
    public int d;
    public long f41080e;
    public int f41081f;
    public int h;
    public int f41082n;
    public int f41083r;

    public zp(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f41077a = paint;
        Paint paint2 = new Paint(1);
        this.f41078b = paint2;
        this.f41079c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i7 == 0) {
            this.f41081f = org.telegram.ui.ActionBar.k6.B7;
            this.h = org.telegram.ui.ActionBar.k6.C7;
        } else if (i7 == 1) {
            this.f41081f = org.telegram.ui.ActionBar.k6.D7;
            this.h = org.telegram.ui.ActionBar.k6.E7;
        } else if (i7 == 2) {
            this.f41081f = org.telegram.ui.ActionBar.k6.F7;
            this.h = org.telegram.ui.ActionBar.k6.G7;
        } else if (i7 == 3) {
            this.f41081f = org.telegram.ui.ActionBar.k6.H7;
            this.h = org.telegram.ui.ActionBar.k6.I7;
        }
        updateColors();
    }

    public final void a(int i7, int i10) {
        this.f41081f = -1;
        this.h = -1;
        this.f41082n = i7;
        this.f41083r = i10;
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41080e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f41080e;
        this.f41080e = currentTimeMillis;
        this.d = (int) ((((float) (j3 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(9.0f);
        RectF rectF = this.f41079c;
        rectF.set(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(18.0f) + measuredWidth, org.telegram.messenger.g0.L(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(9.0f), this.f41077a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f41078b);
        invalidate();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f41080e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i7 = this.f41081f;
        Paint paint = this.f41077a;
        if (i7 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        } else {
            paint.setColor(this.f41082n);
        }
        int i10 = this.h;
        Paint paint2 = this.f41078b;
        if (i10 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        } else {
            paint2.setColor(this.f41083r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
