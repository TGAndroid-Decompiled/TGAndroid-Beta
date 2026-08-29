package org.telegram.ui;

import android.content.Context;
public final class ji0 extends org.telegram.ui.Cells.s1 {
    public int Be;
    public int Ce;
    public int De;
    public final ki0 Ee;

    public ji0(ki0 ki0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, true, null, c6Var);
        this.Ee = ki0Var;
        this.Be = Integer.MAX_VALUE;
        this.Ce = Integer.MAX_VALUE;
        this.De = -1;
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int id2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Vc.f25191w0 && i11 != 0 && this.Be != Integer.MAX_VALUE && i13 != 0 && this.Ce != Integer.MAX_VALUE) {
            int i14 = this.De;
            int i15 = 0;
            if (getMessageObject() == null) {
                id2 = 0;
            } else {
                id2 = getMessageObject().getId();
            }
            if (i14 == id2) {
                if (!this.Ee.f39897s0) {
                    setTranslationY(-(i11 - this.Be));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.jr.h).start();
                }
                this.Be = getTop();
                this.Ce = getBottom();
                if (getMessageObject() != null) {
                    i15 = getMessageObject().getId();
                }
                this.De = i15;
            }
        }
    }

    @Override
    public final gh.j w3() {
        return gh.j.d(1, this, this.Ee.B);
    }
}
