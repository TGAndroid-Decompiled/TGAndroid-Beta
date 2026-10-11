package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jr extends View {
    public final Paint f27815a;
    public final Paint f27816b;
    public final RectF f27817c;
    public int d;
    public long f27818e;
    public int f27819f;
    public int h;
    public int f27820n;
    public int f27821r;

    public jr(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f27815a = paint;
        Paint paint2 = new Paint(1);
        this.f27816b = paint2;
        this.f27817c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f27819f = org.telegram.ui.ActionBar.h6.B7;
            this.h = org.telegram.ui.ActionBar.h6.C7;
        } else if (i10 == 1) {
            this.f27819f = org.telegram.ui.ActionBar.h6.D7;
            this.h = org.telegram.ui.ActionBar.h6.E7;
        } else if (i10 == 2) {
            this.f27819f = org.telegram.ui.ActionBar.h6.F7;
            this.h = org.telegram.ui.ActionBar.h6.G7;
        } else if (i10 == 3) {
            this.f27819f = org.telegram.ui.ActionBar.h6.H7;
            this.h = org.telegram.ui.ActionBar.h6.I7;
        }
        b();
    }

    public final void a(int i10, int i11) {
        this.f27819f = -1;
        this.h = -1;
        this.f27820n = i10;
        this.f27821r = i11;
        b();
    }

    public final void b() {
        int i10 = this.f27819f;
        Paint paint = this.f27815a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        } else {
            paint.setColor(this.f27820n);
        }
        int i11 = this.h;
        Paint paint2 = this.f27816b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        } else {
            paint2.setColor(this.f27821r);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27818e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f27818e;
        this.f27818e = currentTimeMillis;
        this.d = (int) ((((float) (j3 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        RectF rectF = this.f27817c;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f27815a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f27816b);
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f27818e = System.currentTimeMillis();
        invalidate();
    }
}
