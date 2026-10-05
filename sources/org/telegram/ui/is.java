package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class is implements Runnable {
    public final int f37485a;
    public final qs f37486b;

    public is(qs qsVar, int i10) {
        this.f37485a = i10;
        this.f37486b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f37485a) {
            case 0:
                qs qsVar = this.f37486b;
                if (qsVar.J) {
                    qsVar.d.f22315b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22315b);
                    return;
                }
                return;
            case 1:
                qs.Y(this.f37486b);
                return;
            default:
                qs qsVar2 = this.f37486b;
                qsVar2.presentFragment(yn.Q9(qsVar2.H), true);
                return;
        }
    }
}
