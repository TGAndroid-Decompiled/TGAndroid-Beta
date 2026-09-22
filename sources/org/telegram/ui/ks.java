package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ks implements Runnable {
    public final int f35246a;
    public final ss f35247b;

    public ks(ss ssVar, int i10) {
        this.f35246a = i10;
        this.f35247b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f35246a) {
            case 0:
                ss ssVar = this.f35247b;
                if (ssVar.J) {
                    ssVar.d.f20542b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20542b);
                    return;
                }
                return;
            case 1:
                ss.Z(this.f35247b);
                return;
            default:
                ss ssVar2 = this.f35247b;
                ssVar2.presentFragment(zn.R9(ssVar2.H), true);
                return;
        }
    }
}
