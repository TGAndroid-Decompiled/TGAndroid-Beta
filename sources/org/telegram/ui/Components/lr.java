package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lr extends View {
    public final Paint f28268a;
    public final Paint f28269b;
    public final RectF f28270c;
    public int d;
    public long f28271e;
    public int f28272f;
    public int h;
    public int f28273n;
    public int f28274r;

    public lr(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f28268a = paint;
        Paint paint2 = new Paint(1);
        this.f28269b = paint2;
        this.f28270c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f28272f = org.telegram.ui.ActionBar.h6.B7;
            this.h = org.telegram.ui.ActionBar.h6.C7;
        } else if (i10 == 1) {
            this.f28272f = org.telegram.ui.ActionBar.h6.D7;
            this.h = org.telegram.ui.ActionBar.h6.E7;
        } else if (i10 == 2) {
            this.f28272f = org.telegram.ui.ActionBar.h6.F7;
            this.h = org.telegram.ui.ActionBar.h6.G7;
        } else if (i10 == 3) {
            this.f28272f = org.telegram.ui.ActionBar.h6.H7;
            this.h = org.telegram.ui.ActionBar.h6.I7;
        }
        b();
    }

    public final void a(int i10, int i11) {
        this.f28272f = -1;
        this.h = -1;
        this.f28273n = i10;
        this.f28274r = i11;
        b();
    }

    public final void b() {
        int i10 = this.f28272f;
        Paint paint = this.f28268a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        } else {
            paint.setColor(this.f28273n);
        }
        int i11 = this.h;
        Paint paint2 = this.f28269b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        } else {
            paint2.setColor(this.f28274r);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28271e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f28271e;
        this.f28271e = currentTimeMillis;
        this.d = (int) ((((float) (j3 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        RectF rectF = this.f28270c;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f28268a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f28269b);
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f28271e = System.currentTimeMillis();
        invalidate();
    }
}
