package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ls implements Runnable {
    public final int f39838a;
    public final ts f39839b;

    public ls(ts tsVar, int i10) {
        this.f39838a = i10;
        this.f39839b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f39838a) {
            case 0:
                ts tsVar = this.f39839b;
                if (tsVar.J) {
                    tsVar.d.f22081b.requestFocus();
                    AndroidUtilities.showKeyboard(tsVar.d.f22081b);
                    return;
                }
                return;
            case 1:
                ts.Z(this.f39839b);
                return;
            default:
                ts tsVar2 = this.f39839b;
                tsVar2.presentFragment(eo.W9(tsVar2.H), true);
                return;
        }
    }
}
