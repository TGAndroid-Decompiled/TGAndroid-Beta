package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class ea extends View {
    public final Paint f33184a;
    public float f33185b;
    public int f33186c;
    public int d;
    public final RectF f33187e;
    public final c5.k f33188f;
    public final int h;
    public int f33189n;
    public int f33190r;

    public ea(Context context, c5.k kVar, int i7) {
        super(context);
        this.f33184a = new Paint(1);
        new DecelerateInterpolator();
        this.f33187e = new RectF();
        this.f33189n = -1;
        this.f33190r = -1;
        this.f33188f = kVar;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        RectF rectF;
        int L;
        org.telegram.messenger.g0.L(5.0f);
        int i10 = this.f33189n;
        Paint paint = this.f33184a;
        if (i10 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.k6.x0(null, i10, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.k6.D0().q()) {
                i7 = -11184811;
            } else {
                i7 = -4473925;
            }
            paint.setColor(i7);
        }
        this.d = this.f33188f.getCurrentItem();
        int i11 = 0;
        while (true) {
            int i12 = this.h;
            rectF = this.f33187e;
            if (i11 >= i12) {
                break;
            }
            if (i11 != this.d) {
                rectF.set(org.telegram.messenger.g0.L(11.0f) * i11, 0.0f, org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), paint);
            }
            i11++;
        }
        int i13 = this.f33190r;
        if (i13 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        } else {
            paint.setColor(-14509328);
        }
        int L2 = org.telegram.messenger.g0.L(11.0f) * this.d;
        if (this.f33185b != 0.0f) {
            if (this.f33186c >= this.d) {
                rectF.set(L2, 0.0f, (org.telegram.messenger.g0.L(11.0f) * this.f33185b) + org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
            } else {
                rectF.set(com.google.android.recaptcha.internal.a.v(1.0f, this.f33185b, org.telegram.messenger.g0.L(11.0f), L2), 0.0f, org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
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
