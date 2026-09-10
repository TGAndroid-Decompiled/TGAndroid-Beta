package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ls implements Runnable {
    public final int f34764a;
    public final ts f34765b;

    public ls(ts tsVar, int i10) {
        this.f34764a = i10;
        this.f34765b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f34764a) {
            case 0:
                ts tsVar = this.f34765b;
                if (tsVar.J) {
                    tsVar.d.f19293b.requestFocus();
                    AndroidUtilities.showKeyboard(tsVar.d.f19293b);
                    return;
                }
                return;
            case 1:
                ts.Z(this.f34765b);
                return;
            default:
                ts tsVar2 = this.f34765b;
                tsVar2.presentFragment(eo.R9(tsVar2.H), true);
                return;
        }
    }
}
