package org.telegram.ui;

import android.content.Context;
public final class ki0 extends org.telegram.ui.Cells.t1 {
    public int Be;
    public int Ce;
    public int De;
    public final li0 Ee;

    public ki0(li0 li0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, true, null, b6Var);
        this.Ee = li0Var;
        this.Be = Integer.MAX_VALUE;
        this.Ce = Integer.MAX_VALUE;
        this.De = -1;
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int id2;
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.Vc.f25235w0 && i10 != 0 && this.Be != Integer.MAX_VALUE && i12 != 0 && this.Ce != Integer.MAX_VALUE) {
            int i13 = this.De;
            int i14 = 0;
            if (getMessageObject() == null) {
                id2 = 0;
            } else {
                id2 = getMessageObject().getId();
            }
            if (i13 == id2) {
                if (!this.Ee.f40172s0) {
                    setTranslationY(-(i10 - this.Be));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                }
                this.Be = getTop();
                this.Ce = getBottom();
                if (getMessageObject() != null) {
                    i14 = getMessageObject().getId();
                }
                this.De = i14;
            }
        }
    }

    @Override
    public final dh.k w3() {
        return dh.k.d(1, this, this.Ee.B);
    }
}
