package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class iq extends View implements org.telegram.ui.ActionBar.k6 {
    public final Paint f27058a;
    public final Paint f27059b;
    public final RectF f27060c;
    public int d;
    public long e;
    public int f27061f;
    public int h;
    public int f27062n;
    public int f27063r;

    public iq(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f27058a = paint;
        Paint paint2 = new Paint(1);
        this.f27059b = paint2;
        this.f27060c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f27061f = org.telegram.ui.ActionBar.t6.B7;
            this.h = org.telegram.ui.ActionBar.t6.C7;
        } else if (i10 == 1) {
            this.f27061f = org.telegram.ui.ActionBar.t6.D7;
            this.h = org.telegram.ui.ActionBar.t6.E7;
        } else if (i10 == 2) {
            this.f27061f = org.telegram.ui.ActionBar.t6.F7;
            this.h = org.telegram.ui.ActionBar.t6.G7;
        } else if (i10 == 3) {
            this.f27061f = org.telegram.ui.ActionBar.t6.H7;
            this.h = org.telegram.ui.ActionBar.t6.I7;
        }
        updateColors();
    }

    public final void a(int i10, int i11) {
        this.f27061f = -1;
        this.h = -1;
        this.f27062n = i10;
        this.f27063r = i11;
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.e;
        this.e = currentTimeMillis;
        this.d = (int) ((((float) (j10 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.i0.L(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(9.0f);
        RectF rectF = this.f27060c;
        rectF.set(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(18.0f) + measuredWidth, org.telegram.messenger.i0.L(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, org.telegram.messenger.i0.L(9.0f), this.f27058a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f27059b);
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i10 = this.f27061f;
        Paint paint = this.f27058a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        } else {
            paint.setColor(this.f27062n);
        }
        int i11 = this.h;
        Paint paint2 = this.f27059b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        } else {
            paint2.setColor(this.f27063r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
