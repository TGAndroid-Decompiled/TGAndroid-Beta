package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class da extends View {
    public final Paint f33026a;
    public float f33027b;
    public int f33028c;
    public int d;
    public final RectF f33029e;
    public final b5.l f33030f;
    public final int h;
    public int f33031n;
    public int f33032r;

    public da(Context context, b5.l lVar, int i3) {
        super(context);
        this.f33026a = new Paint(1);
        new DecelerateInterpolator();
        this.f33029e = new RectF();
        this.f33031n = -1;
        this.f33032r = -1;
        this.f33030f = lVar;
        this.h = i3;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        RectF rectF;
        int L;
        org.telegram.messenger.g0.L(5.0f);
        int i10 = this.f33031n;
        Paint paint = this.f33026a;
        if (i10 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.k6.x0(null, i10, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.k6.D0().q()) {
                i3 = -11184811;
            } else {
                i3 = -4473925;
            }
            paint.setColor(i3);
        }
        this.d = this.f33030f.getCurrentItem();
        int i11 = 0;
        while (true) {
            int i12 = this.h;
            rectF = this.f33029e;
            if (i11 >= i12) {
                break;
            }
            if (i11 != this.d) {
                rectF.set(org.telegram.messenger.g0.L(11.0f) * i11, 0.0f, org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), paint);
            }
            i11++;
        }
        int i13 = this.f33032r;
        if (i13 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        } else {
            paint.setColor(-14509328);
        }
        int L2 = org.telegram.messenger.g0.L(11.0f) * this.d;
        if (this.f33027b != 0.0f) {
            if (this.f33028c >= this.d) {
                rectF.set(L2, 0.0f, (org.telegram.messenger.g0.L(11.0f) * this.f33027b) + org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
            } else {
                rectF.set(a1.g.D(1.0f, this.f33027b, org.telegram.messenger.g0.L(11.0f), L2), 0.0f, org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
            }
        } else {
            rectF.set(L2, 0.0f, org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), paint);
    }

    public void setCurrentPage(int i3) {
        this.d = i3;
        invalidate();
    }
}
