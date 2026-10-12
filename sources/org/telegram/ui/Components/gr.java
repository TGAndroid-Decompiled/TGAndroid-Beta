package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gr extends View {
    public final Paint f25404a;
    public final Paint f25405b;
    public final RectF f25406c;
    public int d;
    public long e;
    public int f25407f;
    public int h;
    public int f25408n;
    public int f25409r;

    public gr(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f25404a = paint;
        Paint paint2 = new Paint(1);
        this.f25405b = paint2;
        this.f25406c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f25407f = org.telegram.ui.ActionBar.g6.B7;
            this.h = org.telegram.ui.ActionBar.g6.C7;
        } else if (i10 == 1) {
            this.f25407f = org.telegram.ui.ActionBar.g6.D7;
            this.h = org.telegram.ui.ActionBar.g6.E7;
        } else if (i10 == 2) {
            this.f25407f = org.telegram.ui.ActionBar.g6.F7;
            this.h = org.telegram.ui.ActionBar.g6.G7;
        } else if (i10 == 3) {
            this.f25407f = org.telegram.ui.ActionBar.g6.H7;
            this.h = org.telegram.ui.ActionBar.g6.I7;
        }
        b();
    }

    public final void a(int i10, int i11) {
        this.f25407f = -1;
        this.h = -1;
        this.f25408n = i10;
        this.f25409r = i11;
        b();
    }

    public final void b() {
        int i10 = this.f25407f;
        Paint paint = this.f25404a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        } else {
            paint.setColor(this.f25408n);
        }
        int i11 = this.h;
        Paint paint2 = this.f25405b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        } else {
            paint2.setColor(this.f25409r);
        }
        invalidate();
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
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        RectF rectF = this.f25406c;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f25404a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f25405b);
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.e = System.currentTimeMillis();
        invalidate();
    }
}
