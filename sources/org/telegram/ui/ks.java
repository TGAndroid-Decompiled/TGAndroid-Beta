package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ks implements Runnable {
    public final int f38119a;
    public final ss f38120b;

    public ks(ss ssVar, int i10) {
        this.f38119a = i10;
        this.f38120b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f38119a) {
            case 0:
                ss ssVar = this.f38120b;
                if (ssVar.J) {
                    ssVar.d.f22074b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f22074b);
                    return;
                }
                return;
            case 1:
                ss.Z(this.f38120b);
                return;
            default:
                ss ssVar2 = this.f38120b;
                ssVar2.presentFragment(co.R9(ssVar2.H), true);
                return;
        }
    }
}
