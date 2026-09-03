package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class tq extends View {
    public final Paint f31390a;
    public final Paint f31391b;
    public final RectF f31392c;
    public int d;
    public long f31393e;
    public int f31394f;
    public int h;
    public int f31395n;
    public int f31396r;

    public tq(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f31390a = paint;
        Paint paint2 = new Paint(1);
        this.f31391b = paint2;
        this.f31392c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f31394f = org.telegram.ui.ActionBar.k6.B7;
            this.h = org.telegram.ui.ActionBar.k6.C7;
        } else if (i10 == 1) {
            this.f31394f = org.telegram.ui.ActionBar.k6.D7;
            this.h = org.telegram.ui.ActionBar.k6.E7;
        } else if (i10 == 2) {
            this.f31394f = org.telegram.ui.ActionBar.k6.F7;
            this.h = org.telegram.ui.ActionBar.k6.G7;
        } else if (i10 == 3) {
            this.f31394f = org.telegram.ui.ActionBar.k6.H7;
            this.h = org.telegram.ui.ActionBar.k6.I7;
        }
        b();
    }

    public final void a(int i10, int i11) {
        this.f31394f = -1;
        this.h = -1;
        this.f31395n = i10;
        this.f31396r = i11;
        b();
    }

    public final void b() {
        int i10 = this.f31394f;
        Paint paint = this.f31390a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        } else {
            paint.setColor(this.f31395n);
        }
        int i11 = this.h;
        Paint paint2 = this.f31391b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        } else {
            paint2.setColor(this.f31396r);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31393e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f31393e;
        this.f31393e = currentTimeMillis;
        this.d = (int) ((((float) (j10 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        RectF rectF = this.f31392c;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f31390a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f31391b);
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f31393e = System.currentTimeMillis();
        invalidate();
    }
}
