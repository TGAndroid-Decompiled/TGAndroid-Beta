package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hs implements Runnable {
    public final int f38497a;
    public final ps f38498b;

    public hs(ps psVar, int i10) {
        this.f38497a = i10;
        this.f38498b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f38497a) {
            case 0:
                ps psVar = this.f38498b;
                if (psVar.J) {
                    psVar.d.f22289b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.f22289b);
                    return;
                }
                return;
            case 1:
                ps.Z(this.f38498b);
                return;
            default:
                ps psVar2 = this.f38498b;
                psVar2.presentFragment(zn.W9(psVar2.H), true);
                return;
        }
    }
}
