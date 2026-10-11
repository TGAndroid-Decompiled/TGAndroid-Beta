package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hs implements Runnable {
    public final int f38531a;
    public final ps f38532b;

    public hs(ps psVar, int i10) {
        this.f38531a = i10;
        this.f38532b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f38531a) {
            case 0:
                ps psVar = this.f38532b;
                if (psVar.J) {
                    psVar.d.f22325b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.f22325b);
                    return;
                }
                return;
            case 1:
                ps.Z(this.f38532b);
                return;
            default:
                ps psVar2 = this.f38532b;
                psVar2.presentFragment(zn.W9(psVar2.H), true);
                return;
        }
    }
}
