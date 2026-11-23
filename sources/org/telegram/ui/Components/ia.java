package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class ia extends View {
    public final Paint f36181a;
    public float f36182b;
    public int f36183c;
    public int d;
    public final RectF f36184e;
    public final c5.l f36185f;
    public final int h;
    public int f36186n;
    public int f36187r;

    public ia(Context context, c5.l lVar, int i7) {
        super(context);
        this.f36181a = new Paint(1);
        new DecelerateInterpolator();
        this.f36184e = new RectF();
        this.f36186n = -1;
        this.f36187r = -1;
        this.f36185f = lVar;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        RectF rectF;
        int L;
        org.telegram.messenger.g0.L(5.0f);
        int i10 = this.f36186n;
        Paint paint = this.f36181a;
        if (i10 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.m6.x0(null, i10, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.m6.D0().q()) {
                i7 = -11184811;
            } else {
                i7 = -4473925;
            }
            paint.setColor(i7);
        }
        this.d = this.f36185f.getCurrentItem();
        int i11 = 0;
        while (true) {
            int i12 = this.h;
            rectF = this.f36184e;
            if (i11 >= i12) {
                break;
            }
            if (i11 != this.d) {
                rectF.set(org.telegram.messenger.g0.L(11.0f) * i11, 0.0f, org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), paint);
            }
            i11++;
        }
        int i13 = this.f36187r;
        if (i13 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i13, false));
        } else {
            paint.setColor(-14509328);
        }
        int L2 = org.telegram.messenger.g0.L(11.0f) * this.d;
        if (this.f36182b != 0.0f) {
            if (this.f36183c >= this.d) {
                rectF.set(L2, 0.0f, (org.telegram.messenger.g0.L(11.0f) * this.f36182b) + org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
            } else {
                rectF.set(com.google.android.gms.internal.vision.e2.t(1.0f, this.f36182b, org.telegram.messenger.g0.L(11.0f), L2), 0.0f, org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
            }
        } else {
            rectF.set(L2, 0.0f, org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), paint);
    }

    public void setCurrentPage(int i7) {
        this.d = i7;
        invalidate();
    }
}
