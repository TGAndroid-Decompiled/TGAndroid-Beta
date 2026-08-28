package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jq extends View {
    public final Paint f29819a;
    public final Paint f29820b;
    public final RectF f29821c;
    public int d;
    public long f29822e;
    public int f29823f;
    public int h;
    public int f29824n;
    public int f29825r;

    public jq(Context context, int i9) {
        super(context);
        Paint paint = new Paint(1);
        this.f29819a = paint;
        Paint paint2 = new Paint(1);
        this.f29820b = paint2;
        this.f29821c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i9 == 0) {
            this.f29823f = org.telegram.ui.ActionBar.f6.B7;
            this.h = org.telegram.ui.ActionBar.f6.C7;
        } else if (i9 == 1) {
            this.f29823f = org.telegram.ui.ActionBar.f6.D7;
            this.h = org.telegram.ui.ActionBar.f6.E7;
        } else if (i9 == 2) {
            this.f29823f = org.telegram.ui.ActionBar.f6.F7;
            this.h = org.telegram.ui.ActionBar.f6.G7;
        } else if (i9 == 3) {
            this.f29823f = org.telegram.ui.ActionBar.f6.H7;
            this.h = org.telegram.ui.ActionBar.f6.I7;
        }
        b();
    }

    public final void a(int i9, int i10) {
        this.f29823f = -1;
        this.h = -1;
        this.f29824n = i9;
        this.f29825r = i10;
        b();
    }

    public final void b() {
        int i9 = this.f29823f;
        Paint paint = this.f29819a;
        if (i9 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        } else {
            paint.setColor(this.f29824n);
        }
        int i10 = this.h;
        Paint paint2 = this.f29820b;
        if (i10 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        } else {
            paint2.setColor(this.f29825r);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29822e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f29822e;
        this.f29822e = currentTimeMillis;
        this.d = (int) ((((float) (j10 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        RectF rectF = this.f29821c;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f29819a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f29820b);
        invalidate();
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        this.f29822e = System.currentTimeMillis();
        invalidate();
    }
}
