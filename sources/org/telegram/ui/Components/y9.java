package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class y9 extends View {
    public final Paint f32658a;
    public float f32659b;
    public int f32660c;
    public int d;
    public final RectF e;
    public final z4.g f32661f;
    public final int h;
    public int f32662n;
    public int f32663r;

    public y9(Context context, z4.g gVar, int i10) {
        super(context);
        this.f32658a = new Paint(1);
        new DecelerateInterpolator();
        this.e = new RectF();
        this.f32662n = -1;
        this.f32663r = -1;
        this.f32661f = gVar;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        RectF rectF;
        int L;
        org.telegram.messenger.i0.L(5.0f);
        int i11 = this.f32662n;
        Paint paint = this.f32658a;
        if (i11 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.t6.x0(null, i11, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.t6.D0().q()) {
                i10 = -11184811;
            } else {
                i10 = -4473925;
            }
            paint.setColor(i10);
        }
        this.d = this.f32661f.getCurrentItem();
        int i12 = 0;
        while (true) {
            int i13 = this.h;
            rectF = this.e;
            if (i12 >= i13) {
                break;
            }
            if (i12 != this.d) {
                rectF.set(org.telegram.messenger.i0.L(11.0f) * i12, 0.0f, org.telegram.messenger.i0.L(5.0f) + L, org.telegram.messenger.i0.L(5.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.5f), org.telegram.messenger.i0.L(2.5f), paint);
            }
            i12++;
        }
        int i14 = this.f32663r;
        if (i14 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i14, false));
        } else {
            paint.setColor(-14509328);
        }
        int L2 = org.telegram.messenger.i0.L(11.0f) * this.d;
        if (this.f32659b != 0.0f) {
            if (this.f32660c >= this.d) {
                rectF.set(L2, 0.0f, (org.telegram.messenger.i0.L(11.0f) * this.f32659b) + org.telegram.messenger.i0.L(5.0f) + L2, org.telegram.messenger.i0.L(5.0f));
            } else {
                rectF.set(sc.e.z(1.0f, this.f32659b, org.telegram.messenger.i0.L(11.0f), L2), 0.0f, org.telegram.messenger.i0.L(5.0f) + L2, org.telegram.messenger.i0.L(5.0f));
            }
        } else {
            rectF.set(L2, 0.0f, org.telegram.messenger.i0.L(5.0f) + L2, org.telegram.messenger.i0.L(5.0f));
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.5f), org.telegram.messenger.i0.L(2.5f), paint);
    }

    public void setCurrentPage(int i10) {
        this.d = i10;
        invalidate();
    }
}
