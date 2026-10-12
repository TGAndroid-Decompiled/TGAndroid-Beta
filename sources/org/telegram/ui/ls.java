package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ls implements Runnable {
    public final int f39835a;
    public final ts f39836b;

    public ls(ts tsVar, int i10) {
        this.f39835a = i10;
        this.f39836b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f39835a) {
            case 0:
                ts tsVar = this.f39836b;
                if (tsVar.J) {
                    tsVar.d.f22080b.requestFocus();
                    AndroidUtilities.showKeyboard(tsVar.d.f22080b);
                    return;
                }
                return;
            case 1:
                ts.Z(this.f39836b);
                return;
            default:
                ts tsVar2 = this.f39836b;
                tsVar2.presentFragment(eo.W9(tsVar2.H), true);
                return;
        }
    }
}
