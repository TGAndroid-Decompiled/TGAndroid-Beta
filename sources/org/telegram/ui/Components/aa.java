package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class aa extends View {
    public final Paint f32936a;
    public float f32937b;
    public int f32938c;
    public int d;
    public final RectF f32939e;
    public final c5.l f32940f;
    public final int h;
    public int f32941n;
    public int f32942r;

    public aa(Context context, c5.l lVar, int i7) {
        super(context);
        this.f32936a = new Paint(1);
        new DecelerateInterpolator();
        this.f32939e = new RectF();
        this.f32941n = -1;
        this.f32942r = -1;
        this.f32940f = lVar;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        RectF rectF;
        int L;
        org.telegram.messenger.g0.L(5.0f);
        int i10 = this.f32941n;
        Paint paint = this.f32936a;
        if (i10 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.j6.x0(null, i10, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.j6.D0().q()) {
                i7 = -11184811;
            } else {
                i7 = -4473925;
            }
            paint.setColor(i7);
        }
        this.d = this.f32940f.getCurrentItem();
        int i11 = 0;
        while (true) {
            int i12 = this.h;
            rectF = this.f32939e;
            if (i11 >= i12) {
                break;
            }
            if (i11 != this.d) {
                rectF.set(org.telegram.messenger.g0.L(11.0f) * i11, 0.0f, org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(2.5f), paint);
            }
            i11++;
        }
        int i13 = this.f32942r;
        if (i13 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i13, false));
        } else {
            paint.setColor(-14509328);
        }
        int L2 = org.telegram.messenger.g0.L(11.0f) * this.d;
        if (this.f32937b != 0.0f) {
            if (this.f32938c >= this.d) {
                rectF.set(L2, 0.0f, (org.telegram.messenger.g0.L(11.0f) * this.f32937b) + org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
            } else {
                rectF.set(com.google.android.gms.internal.vision.e2.t(1.0f, this.f32937b, org.telegram.messenger.g0.L(11.0f), L2), 0.0f, org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(5.0f));
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
