package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class is implements Runnable {
    public final int f38794a;
    public final qs f38795b;

    public is(qs qsVar, int i10) {
        this.f38794a = i10;
        this.f38795b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f38794a) {
            case 0:
                qs qsVar = this.f38795b;
                if (qsVar.J) {
                    qsVar.d.f22301b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22301b);
                    return;
                }
                return;
            case 1:
                qs.Z(this.f38795b);
                return;
            default:
                qs qsVar2 = this.f38795b;
                qsVar2.presentFragment(zn.W9(qsVar2.H), true);
                return;
        }
    }
}
