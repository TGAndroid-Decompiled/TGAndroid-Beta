package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class er extends View implements org.telegram.ui.ActionBar.p6 {
    public final Paint f27964a;
    public final Paint f27965b;
    public final RectF f27966c;
    public int d;
    public long e;
    public int f27967f;
    public int h;
    public int f27968n;
    public int f27969r;

    public er(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f27964a = paint;
        Paint paint2 = new Paint(1);
        this.f27965b = paint2;
        this.f27966c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f27967f = org.telegram.ui.ActionBar.y6.B7;
            this.h = org.telegram.ui.ActionBar.y6.C7;
        } else if (i10 == 1) {
            this.f27967f = org.telegram.ui.ActionBar.y6.D7;
            this.h = org.telegram.ui.ActionBar.y6.E7;
        } else if (i10 == 2) {
            this.f27967f = org.telegram.ui.ActionBar.y6.F7;
            this.h = org.telegram.ui.ActionBar.y6.G7;
        } else if (i10 == 3) {
            this.f27967f = org.telegram.ui.ActionBar.y6.H7;
            this.h = org.telegram.ui.ActionBar.y6.I7;
        }
        updateColors();
    }

    public final void a(int i10, int i11) {
        this.f27967f = -1;
        this.h = -1;
        this.f27968n = i10;
        this.f27969r = i11;
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
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        RectF rectF = this.f27966c;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f27964a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f27965b);
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
        int i10 = this.f27967f;
        Paint paint = this.f27964a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        } else {
            paint.setColor(this.f27968n);
        }
        int i11 = this.h;
        Paint paint2 = this.f27965b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        } else {
            paint2.setColor(this.f27969r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
