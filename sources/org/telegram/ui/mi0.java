package org.telegram.ui;

import android.content.Context;
public final class mi0 extends org.telegram.ui.Cells.s1 {
    public int He;
    public int Ie;
    public int Je;
    public final ni0 Ke;

    public mi0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, true, null, u6Var);
        this.Ke = ni0Var;
        this.He = Integer.MAX_VALUE;
        this.Ie = Integer.MAX_VALUE;
        this.Je = -1;
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int id2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Zc.f24941w0 && i11 != 0 && this.He != Integer.MAX_VALUE && i13 != 0 && this.Ie != Integer.MAX_VALUE) {
            int i14 = this.Je;
            int i15 = 0;
            if (getMessageObject() == null) {
                id2 = 0;
            } else {
                id2 = getMessageObject().getId();
            }
            if (i14 == id2) {
                if (!this.Ke.f41931v0) {
                    setTranslationY(-(i11 - this.He));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                }
                this.He = getTop();
                this.Ie = getBottom();
                if (getMessageObject() != null) {
                    i15 = getMessageObject().getId();
                }
                this.Je = i15;
            }
        }
    }

    @Override
    public final xh.f y3() {
        return xh.f.d(1, this, this.Ke.E);
    }
}
