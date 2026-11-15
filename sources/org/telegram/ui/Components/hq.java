package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class hq extends View implements org.telegram.ui.ActionBar.z5 {
    public final Paint f35310a;
    public final Paint f35311b;
    public final RectF f35312c;
    public int d;
    public long f35313e;
    public int f35314f;
    public int h;
    public int f35315n;
    public int f35316r;

    public hq(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f35310a = paint;
        Paint paint2 = new Paint(1);
        this.f35311b = paint2;
        this.f35312c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i7 == 0) {
            this.f35314f = org.telegram.ui.ActionBar.j6.B7;
            this.h = org.telegram.ui.ActionBar.j6.C7;
        } else if (i7 == 1) {
            this.f35314f = org.telegram.ui.ActionBar.j6.D7;
            this.h = org.telegram.ui.ActionBar.j6.E7;
        } else if (i7 == 2) {
            this.f35314f = org.telegram.ui.ActionBar.j6.F7;
            this.h = org.telegram.ui.ActionBar.j6.G7;
        } else if (i7 == 3) {
            this.f35314f = org.telegram.ui.ActionBar.j6.H7;
            this.h = org.telegram.ui.ActionBar.j6.I7;
        }
        updateColors();
    }

    public final void a(int i7, int i10) {
        this.f35314f = -1;
        this.h = -1;
        this.f35315n = i7;
        this.f35316r = i10;
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35313e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f35313e;
        this.f35313e = currentTimeMillis;
        this.d = (int) ((((float) (j3 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(9.0f);
        RectF rectF = this.f35312c;
        rectF.set(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(18.0f) + measuredWidth, org.telegram.messenger.g0.L(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(9.0f), this.f35310a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f35311b);
        invalidate();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f35313e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i7 = this.f35314f;
        Paint paint = this.f35310a;
        if (i7 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        } else {
            paint.setColor(this.f35315n);
        }
        int i10 = this.h;
        Paint paint2 = this.f35311b;
        if (i10 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        } else {
            paint2.setColor(this.f35316r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
