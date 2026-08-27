package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class hq extends View {

    public final Paint f29076a;

    public final Paint f29077b;

    public final RectF f29078c;
    public int d;

    public long f29079e;

    public int f29080f;
    public int h;

    public int f29081n;

    public int f29082r;

    public hq(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f29076a = paint;
        Paint paint2 = new Paint(1);
        this.f29077b = paint2;
        this.f29078c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f29080f = org.telegram.ui.ActionBar.g6.B7;
            this.h = org.telegram.ui.ActionBar.g6.C7;
        } else if (i10 == 1) {
            this.f29080f = org.telegram.ui.ActionBar.g6.D7;
            this.h = org.telegram.ui.ActionBar.g6.E7;
        } else if (i10 == 2) {
            this.f29080f = org.telegram.ui.ActionBar.g6.F7;
            this.h = org.telegram.ui.ActionBar.g6.G7;
        } else if (i10 == 3) {
            this.f29080f = org.telegram.ui.ActionBar.g6.H7;
            this.h = org.telegram.ui.ActionBar.g6.I7;
        }
        b();
    }

    public final void a(int i10, int i11) {
        this.f29080f = -1;
        this.h = -1;
        this.f29081n = i10;
        this.f29082r = i11;
        b();
    }

    public final void b() {
        int i10 = this.f29080f;
        Paint paint = this.f29076a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        } else {
            paint.setColor(this.f29081n);
        }
        int i11 = this.h;
        Paint paint2 = this.f29077b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        } else {
            paint2.setColor(this.f29082r);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29079e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f29079e;
        this.f29079e = jCurrentTimeMillis;
        this.d = (int) (((j10 * 360) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float fDp = AndroidUtilities.dp(18.0f) + measuredWidth;
        float fDp2 = AndroidUtilities.dp(18.0f) + measuredHeight;
        RectF rectF = this.f29078c;
        rectF.set(f10, f11, fDp, fDp2);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f29076a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f29077b);
        invalidate();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f29079e = System.currentTimeMillis();
        invalidate();
    }
}
