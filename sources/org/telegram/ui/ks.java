package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ks implements Runnable {
    public final int f38147a;
    public final ss f38148b;

    public ks(ss ssVar, int i10) {
        this.f38147a = i10;
        this.f38148b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f38147a) {
            case 0:
                ss ssVar = this.f38148b;
                if (ssVar.J) {
                    ssVar.d.f22102b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f22102b);
                    return;
                }
                return;
            case 1:
                ss.Z(this.f38148b);
                return;
            default:
                ss ssVar2 = this.f38148b;
                ssVar2.presentFragment(co.R9(ssVar2.H), true);
                return;
        }
    }
}
