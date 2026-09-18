package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ks implements Runnable {
    public final int f35165a;
    public final ss f35166b;

    public ks(ss ssVar, int i10) {
        this.f35165a = i10;
        this.f35166b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f35165a) {
            case 0:
                ss ssVar = this.f35166b;
                if (ssVar.J) {
                    ssVar.d.f20455b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20455b);
                    return;
                }
                return;
            case 1:
                ss.Z(this.f35166b);
                return;
            default:
                ss ssVar2 = this.f35166b;
                ssVar2.presentFragment(zn.R9(ssVar2.H), true);
                return;
        }
    }
}
