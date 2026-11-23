package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class nq extends View implements org.telegram.ui.ActionBar.c6 {
    public final Paint f37891a;
    public final Paint f37892b;
    public final RectF f37893c;
    public int d;
    public long f37894e;
    public int f37895f;
    public int h;
    public int f37896n;
    public int f37897r;

    public nq(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f37891a = paint;
        Paint paint2 = new Paint(1);
        this.f37892b = paint2;
        this.f37893c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i7 == 0) {
            this.f37895f = org.telegram.ui.ActionBar.n6.B7;
            this.h = org.telegram.ui.ActionBar.n6.C7;
        } else if (i7 == 1) {
            this.f37895f = org.telegram.ui.ActionBar.n6.D7;
            this.h = org.telegram.ui.ActionBar.n6.E7;
        } else if (i7 == 2) {
            this.f37895f = org.telegram.ui.ActionBar.n6.F7;
            this.h = org.telegram.ui.ActionBar.n6.G7;
        } else if (i7 == 3) {
            this.f37895f = org.telegram.ui.ActionBar.n6.H7;
            this.h = org.telegram.ui.ActionBar.n6.I7;
        }
        updateColors();
    }

    public final void a(int i7, int i10) {
        this.f37895f = -1;
        this.h = -1;
        this.f37896n = i7;
        this.f37897r = i10;
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37894e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f37894e;
        this.f37894e = currentTimeMillis;
        this.d = (int) ((((float) (j3 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(9.0f);
        RectF rectF = this.f37893c;
        rectF.set(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(18.0f) + measuredWidth, org.telegram.messenger.g0.L(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(9.0f), this.f37891a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f37892b);
        invalidate();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f37894e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i7 = this.f37895f;
        Paint paint = this.f37891a;
        if (i7 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        } else {
            paint.setColor(this.f37896n);
        }
        int i10 = this.h;
        Paint paint2 = this.f37892b;
        if (i10 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        } else {
            paint2.setColor(this.f37897r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
