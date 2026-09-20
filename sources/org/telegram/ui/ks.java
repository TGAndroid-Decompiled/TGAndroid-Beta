package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ks implements Runnable {
    public final int f35228a;
    public final ss f35229b;

    public ks(ss ssVar, int i10) {
        this.f35228a = i10;
        this.f35229b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f35228a) {
            case 0:
                ss ssVar = this.f35229b;
                if (ssVar.J) {
                    ssVar.d.f20527b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20527b);
                    return;
                }
                return;
            case 1:
                ss.Z(this.f35229b);
                return;
            default:
                ss ssVar2 = this.f35229b;
                ssVar2.presentFragment(zn.R9(ssVar2.H), true);
                return;
        }
    }
}
