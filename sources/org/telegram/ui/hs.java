package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hs implements Runnable {
    public final int f34746a;
    public final ps f34747b;

    public hs(ps psVar, int i10) {
        this.f34746a = i10;
        this.f34747b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f34746a) {
            case 0:
                ps psVar = this.f34747b;
                if (psVar.G) {
                    psVar.d.f21132b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.f21132b);
                    return;
                }
                return;
            case 1:
                ps.Z(this.f34747b);
                return;
            default:
                ps psVar2 = this.f34747b;
                psVar2.presentFragment(zn.R9(psVar2.E), true);
                return;
        }
    }
}
