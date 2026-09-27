package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hs implements Runnable {
    public final int f34275a;
    public final ps f34276b;

    public hs(ps psVar, int i10) {
        this.f34275a = i10;
        this.f34276b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f34275a) {
            case 0:
                ps psVar = this.f34276b;
                if (psVar.J) {
                    psVar.d.f20493b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.f20493b);
                    return;
                }
                return;
            case 1:
                ps.Z(this.f34276b);
                return;
            default:
                ps psVar2 = this.f34276b;
                psVar2.presentFragment(xn.R9(psVar2.H), true);
                return;
        }
    }
}
