package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ks implements Runnable {
    public final int f38120a;
    public final ss f38121b;

    public ks(ss ssVar, int i10) {
        this.f38120a = i10;
        this.f38121b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f38120a) {
            case 0:
                ss ssVar = this.f38121b;
                if (ssVar.J) {
                    ssVar.d.f22075b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f22075b);
                    return;
                }
                return;
            case 1:
                ss.Z(this.f38121b);
                return;
            default:
                ss ssVar2 = this.f38121b;
                ssVar2.presentFragment(co.R9(ssVar2.H), true);
                return;
        }
    }
}
