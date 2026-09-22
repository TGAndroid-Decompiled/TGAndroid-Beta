package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ks implements Runnable {
    public final int f35250a;
    public final ss f35251b;

    public ks(ss ssVar, int i10) {
        this.f35250a = i10;
        this.f35251b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f35250a) {
            case 0:
                ss ssVar = this.f35251b;
                if (ssVar.J) {
                    ssVar.d.f20190b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20190b);
                    return;
                }
                return;
            case 1:
                ss.Z(this.f35251b);
                return;
            default:
                ss ssVar2 = this.f35251b;
                ssVar2.presentFragment(bo.R9(ssVar2.H), true);
                return;
        }
    }
}
