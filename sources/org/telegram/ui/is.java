package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class is implements Runnable {
    public final int f37493a;
    public final qs f37494b;

    public is(qs qsVar, int i10) {
        this.f37493a = i10;
        this.f37494b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f37493a) {
            case 0:
                qs qsVar = this.f37494b;
                if (qsVar.J) {
                    qsVar.d.f22307b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22307b);
                    return;
                }
                return;
            case 1:
                qs.Y(this.f37494b);
                return;
            default:
                qs qsVar2 = this.f37494b;
                qsVar2.presentFragment(yn.Q9(qsVar2.H), true);
                return;
        }
    }
}
