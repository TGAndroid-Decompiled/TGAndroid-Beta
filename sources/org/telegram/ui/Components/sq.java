package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sq extends View {
    public final Paint f30392a;
    public final Paint f30393b;
    public final RectF f30394c;
    public int d;
    public long f30395e;
    public int f30396f;
    public int h;
    public int f30397n;
    public int f30398r;

    public sq(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f30392a = paint;
        Paint paint2 = new Paint(1);
        this.f30393b = paint2;
        this.f30394c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f30396f = org.telegram.ui.ActionBar.j6.B7;
            this.h = org.telegram.ui.ActionBar.j6.C7;
        } else if (i10 == 1) {
            this.f30396f = org.telegram.ui.ActionBar.j6.D7;
            this.h = org.telegram.ui.ActionBar.j6.E7;
        } else if (i10 == 2) {
            this.f30396f = org.telegram.ui.ActionBar.j6.F7;
            this.h = org.telegram.ui.ActionBar.j6.G7;
        } else if (i10 == 3) {
            this.f30396f = org.telegram.ui.ActionBar.j6.H7;
            this.h = org.telegram.ui.ActionBar.j6.I7;
        }
        b();
    }

    public final void a(int i10, int i11) {
        this.f30396f = -1;
        this.h = -1;
        this.f30397n = i10;
        this.f30398r = i11;
        b();
    }

    public final void b() {
        int i10 = this.f30396f;
        Paint paint = this.f30392a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        } else {
            paint.setColor(this.f30397n);
        }
        int i11 = this.h;
        Paint paint2 = this.f30393b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        } else {
            paint2.setColor(this.f30398r);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30395e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f30395e;
        this.f30395e = currentTimeMillis;
        this.d = (int) ((((float) (j3 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        RectF rectF = this.f30394c;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f30392a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f30393b);
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f30395e = System.currentTimeMillis();
        invalidate();
    }
}
