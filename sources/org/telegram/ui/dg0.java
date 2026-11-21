package org.telegram.ui;

import android.content.Context;
public final class dg0 extends org.telegram.ui.Cells.r1 {
    public int Ad;
    public int Bd;
    public final eg0 Cd;
    public int f46966zd;

    public dg0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, true, null, h6Var);
        this.Cd = eg0Var;
        this.f46966zd = Integer.MAX_VALUE;
        this.Ad = Integer.MAX_VALUE;
        this.Bd = -1;
    }

    @Override
    public final xh.e Y2() {
        return xh.e.d(1, this, this.Cd.F);
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int e12;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f31468ib.f32470x0 && i10 != 0 && this.f46966zd != Integer.MAX_VALUE && i12 != 0 && this.Ad != Integer.MAX_VALUE) {
            int i13 = this.Bd;
            int i14 = 0;
            if (getMessageObject() == null) {
                e12 = 0;
            } else {
                e12 = getMessageObject().e1();
            }
            if (i13 == e12) {
                if (!this.Cd.A0) {
                    setTranslationY(-(i10 - this.f46966zd));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                }
                this.f46966zd = getTop();
                this.Ad = getBottom();
                if (getMessageObject() != null) {
                    i14 = getMessageObject().e1();
                }
                this.Bd = i14;
            }
        }
    }
}
