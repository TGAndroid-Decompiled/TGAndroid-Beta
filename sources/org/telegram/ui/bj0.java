package org.telegram.ui;

import android.content.Context;
public final class bj0 extends org.telegram.ui.Cells.u1 {
    public int Ge;
    public int He;
    public int Ie;
    public final cj0 Je;

    public bj0(cj0 cj0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, true, null, e6Var);
        this.Je = cj0Var;
        this.Ge = Integer.MAX_VALUE;
        this.He = Integer.MAX_VALUE;
        this.Ie = -1;
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int id2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Zc.f21134w0 && i11 != 0 && this.Ge != Integer.MAX_VALUE && i13 != 0 && this.He != Integer.MAX_VALUE) {
            int i14 = this.Ie;
            int i15 = 0;
            if (getMessageObject() == null) {
                id2 = 0;
            } else {
                id2 = getMessageObject().getId();
            }
            if (i14 == id2) {
                if (!this.Je.f32700w0) {
                    setTranslationY(-(i11 - this.Ge));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                }
                this.Ge = getTop();
                this.He = getBottom();
                if (getMessageObject() != null) {
                    i15 = getMessageObject().getId();
                }
                this.Ie = i15;
            }
        }
    }

    @Override
    public final vh.g w3() {
        return vh.g.d(1, this, this.Je.F);
    }
}
