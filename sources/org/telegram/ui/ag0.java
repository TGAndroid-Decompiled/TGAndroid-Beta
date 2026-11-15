package org.telegram.ui;

import android.content.Context;
public final class ag0 extends org.telegram.ui.Cells.q1 {
    public int Ad;
    public int Bd;
    public final bg0 Cd;
    public int f45044zd;

    public ag0(bg0 bg0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, true, null, e6Var);
        this.Cd = bg0Var;
        this.f45044zd = Integer.MAX_VALUE;
        this.Ad = Integer.MAX_VALUE;
        this.Bd = -1;
    }

    @Override
    public final xh.e W2() {
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
        if (this.f31018ib.f32012x0 && i10 != 0 && this.f45044zd != Integer.MAX_VALUE && i12 != 0 && this.Ad != Integer.MAX_VALUE) {
            int i13 = this.Bd;
            int i14 = 0;
            if (getMessageObject() == null) {
                e12 = 0;
            } else {
                e12 = getMessageObject().e1();
            }
            if (i13 == e12) {
                if (!this.Cd.A0) {
                    setTranslationY(-(i10 - this.f45044zd));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.er.h).start();
                }
                this.f45044zd = getTop();
                this.Ad = getBottom();
                if (getMessageObject() != null) {
                    i14 = getMessageObject().e1();
                }
                this.Bd = i14;
            }
        }
    }
}
