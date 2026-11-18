package org.telegram.ui;

import android.content.Context;
public final class eg0 extends org.telegram.ui.Cells.r1 {
    public int Ad;
    public int Bd;
    public final fg0 Cd;
    public int f47225zd;

    public eg0(fg0 fg0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, true, null, i6Var);
        this.Cd = fg0Var;
        this.f47225zd = Integer.MAX_VALUE;
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
        if (this.f31440ib.f32442x0 && i10 != 0 && this.f47225zd != Integer.MAX_VALUE && i12 != 0 && this.Ad != Integer.MAX_VALUE) {
            int i13 = this.Bd;
            int i14 = 0;
            if (getMessageObject() == null) {
                e12 = 0;
            } else {
                e12 = getMessageObject().e1();
            }
            if (i13 == e12) {
                if (!this.Cd.A0) {
                    setTranslationY(-(i10 - this.f47225zd));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.lr.h).start();
                }
                this.f47225zd = getTop();
                this.Ad = getBottom();
                if (getMessageObject() != null) {
                    i14 = getMessageObject().e1();
                }
                this.Bd = i14;
            }
        }
    }
}
