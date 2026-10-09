package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class is implements Runnable {
    public final int f38750a;
    public final qs f38751b;

    public is(qs qsVar, int i10) {
        this.f38750a = i10;
        this.f38751b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f38750a) {
            case 0:
                qs qsVar = this.f38751b;
                if (qsVar.J) {
                    qsVar.d.f22297b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22297b);
                    return;
                }
                return;
            case 1:
                qs.Z(this.f38751b);
                return;
            default:
                qs qsVar2 = this.f38751b;
                qsVar2.presentFragment(zn.W9(qsVar2.H), true);
                return;
        }
    }
}
