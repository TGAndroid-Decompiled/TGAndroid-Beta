package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jr extends View {
    public final Paint f27756a;
    public final Paint f27757b;
    public final RectF f27758c;
    public int d;
    public long f27759e;
    public int f27760f;
    public int h;
    public int f27761n;
    public int f27762r;

    public jr(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f27756a = paint;
        Paint paint2 = new Paint(1);
        this.f27757b = paint2;
        this.f27758c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f27760f = org.telegram.ui.ActionBar.i6.B7;
            this.h = org.telegram.ui.ActionBar.i6.C7;
        } else if (i10 == 1) {
            this.f27760f = org.telegram.ui.ActionBar.i6.D7;
            this.h = org.telegram.ui.ActionBar.i6.E7;
        } else if (i10 == 2) {
            this.f27760f = org.telegram.ui.ActionBar.i6.F7;
            this.h = org.telegram.ui.ActionBar.i6.G7;
        } else if (i10 == 3) {
            this.f27760f = org.telegram.ui.ActionBar.i6.H7;
            this.h = org.telegram.ui.ActionBar.i6.I7;
        }
        b();
    }

    public final void a(int i10, int i11) {
        this.f27760f = -1;
        this.h = -1;
        this.f27761n = i10;
        this.f27762r = i11;
        b();
    }

    public final void b() {
        int i10 = this.f27760f;
        Paint paint = this.f27756a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        } else {
            paint.setColor(this.f27761n);
        }
        int i11 = this.h;
        Paint paint2 = this.f27757b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        } else {
            paint2.setColor(this.f27762r);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27759e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f27759e;
        this.f27759e = currentTimeMillis;
        this.d = (int) ((((float) (j3 * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        RectF rectF = this.f27758c;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f27756a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f27757b);
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f27759e = System.currentTimeMillis();
        invalidate();
    }
}
