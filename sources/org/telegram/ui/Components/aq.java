package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class aq extends View implements org.telegram.ui.ActionBar.z5 {
    public final Paint f31971a;
    public final Paint f31972b;
    public final RectF f31973c;
    public int d;
    public long f31974e;
    public int f31975f;
    public int h;
    public int f31976n;
    public int f31977r;

    public aq(Context context, int i3) {
        super(context);
        Paint paint = new Paint(1);
        this.f31971a = paint;
        Paint paint2 = new Paint(1);
        this.f31972b = paint2;
        this.f31973c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i3 == 0) {
            this.f31975f = org.telegram.ui.ActionBar.k6.B7;
            this.h = org.telegram.ui.ActionBar.k6.C7;
        } else if (i3 == 1) {
            this.f31975f = org.telegram.ui.ActionBar.k6.D7;
            this.h = org.telegram.ui.ActionBar.k6.E7;
        } else if (i3 == 2) {
            this.f31975f = org.telegram.ui.ActionBar.k6.F7;
            this.h = org.telegram.ui.ActionBar.k6.G7;
        } else if (i3 == 3) {
            this.f31975f = org.telegram.ui.ActionBar.k6.H7;
            this.h = org.telegram.ui.ActionBar.k6.I7;
        }
        updateColors();
    }

    public final void a(int i3, int i10) {
        this.f31975f = -1;
        this.h = -1;
        this.f31976n = i3;
        this.f31977r = i10;
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31974e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f31974e;
        this.f31974e = currentTimeMillis;
        this.d = (int) ((((float) (j10 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(9.0f);
        RectF rectF = this.f31973c;
        rectF.set(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(18.0f) + measuredWidth, org.telegram.messenger.g0.L(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(9.0f), this.f31971a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f31972b);
        invalidate();
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        this.f31974e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i3 = this.f31975f;
        Paint paint = this.f31971a;
        if (i3 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        } else {
            paint.setColor(this.f31976n);
        }
        int i10 = this.h;
        Paint paint2 = this.f31972b;
        if (i10 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        } else {
            paint2.setColor(this.f31977r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
