package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class ar extends View implements org.telegram.ui.ActionBar.b6 {
    public final Paint f24784a;
    public final Paint f24785b;
    public final RectF f24786c;
    public int d;
    public long e;
    public int f24787f;
    public int h;
    public int f24788n;
    public int f24789r;

    public ar(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f24784a = paint;
        Paint paint2 = new Paint(1);
        this.f24785b = paint2;
        this.f24786c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i10 == 0) {
            this.f24787f = org.telegram.ui.ActionBar.k6.B7;
            this.h = org.telegram.ui.ActionBar.k6.C7;
        } else if (i10 == 1) {
            this.f24787f = org.telegram.ui.ActionBar.k6.D7;
            this.h = org.telegram.ui.ActionBar.k6.E7;
        } else if (i10 == 2) {
            this.f24787f = org.telegram.ui.ActionBar.k6.F7;
            this.h = org.telegram.ui.ActionBar.k6.G7;
        } else if (i10 == 3) {
            this.f24787f = org.telegram.ui.ActionBar.k6.H7;
            this.h = org.telegram.ui.ActionBar.k6.I7;
        }
        updateColors();
    }

    public final void a(int i10, int i11) {
        this.f24787f = -1;
        this.h = -1;
        this.f24788n = i10;
        this.f24789r = i11;
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
        RectF rectF = this.f24786c;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.f24784a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.f24785b);
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
        int i10 = this.f24787f;
        Paint paint = this.f24784a;
        if (i10 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        } else {
            paint.setColor(this.f24788n);
        }
        int i11 = this.h;
        Paint paint2 = this.f24785b;
        if (i11 >= 0) {
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        } else {
            paint2.setColor(this.f24789r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
