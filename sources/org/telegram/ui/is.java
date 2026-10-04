package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class is implements Runnable {
    public final int f37492a;
    public final qs f37493b;

    public is(qs qsVar, int i10) {
        this.f37492a = i10;
        this.f37493b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f37492a) {
            case 0:
                qs qsVar = this.f37493b;
                if (qsVar.J) {
                    qsVar.d.f22306b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22306b);
                    return;
                }
                return;
            case 1:
                qs.Y(this.f37493b);
                return;
            default:
                qs qsVar2 = this.f37493b;
                qsVar2.presentFragment(yn.Q9(qsVar2.H), true);
                return;
        }
    }
}
