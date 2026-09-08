package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ks implements Runnable {
    public final int f38146a;
    public final ss f38147b;

    public ks(ss ssVar, int i10) {
        this.f38146a = i10;
        this.f38147b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f38146a) {
            case 0:
                ss ssVar = this.f38147b;
                if (ssVar.J) {
                    ssVar.d.f22101b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f22101b);
                    return;
                }
                return;
            case 1:
                ss.Z(this.f38147b);
                return;
            default:
                ss ssVar2 = this.f38147b;
                ssVar2.presentFragment(co.R9(ssVar2.H), true);
                return;
        }
    }
}
