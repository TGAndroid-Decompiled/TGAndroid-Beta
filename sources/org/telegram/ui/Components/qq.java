package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class qq extends View implements org.telegram.ui.ActionBar.b6 {
    public final Paint f38970a;
    public final Paint f38971b;
    public final RectF f38972c;
    public int d;
    public long f38973e;
    public int f38974f;
    public int h;
    public int f38975n;
    public int f38976r;

    public qq(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f38970a = paint;
        Paint paint2 = new Paint(1);
        this.f38971b = paint2;
        this.f38972c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i7 == 0) {
            this.f38974f = org.telegram.ui.ActionBar.m6.B7;
            this.h = org.telegram.ui.ActionBar.m6.C7;
        } else if (i7 == 1) {
            this.f38974f = org.telegram.ui.ActionBar.m6.D7;
            this.h = org.telegram.ui.ActionBar.m6.E7;
        } else if (i7 == 2) {
            this.f38974f = org.telegram.ui.ActionBar.m6.F7;
            this.h = org.telegram.ui.ActionBar.m6.G7;
        } else if (i7 == 3) {
            this.f38974f = org.telegram.ui.ActionBar.m6.H7;
            this.h = org.telegram.ui.ActionBar.m6.I7;
        }
        updateColors();
    }

    public final void a(int i7, int i10) {
        this.f38974f = -1;
        this.h = -1;
        this.f38975n = i7;
        this.f38976r = i10;
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38973e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f38973e;
        this.f38973e = currentTimeMillis;
        this.d = (int) ((((float) (j3 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(9.0f);
        RectF rectF = this.f38972c;
        rectF.set(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(18.0f) + measuredWidth, org.telegram.messenger.g0.L(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(9.0f), this.f38970a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f38971b);
        invalidate();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f38973e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i7 = this.f38974f;
        Paint paint = this.f38970a;
        if (i7 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        } else {
            paint.setColor(this.f38975n);
        }
        int i10 = this.h;
        Paint paint2 = this.f38971b;
        if (i10 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        } else {
            paint2.setColor(this.f38976r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
