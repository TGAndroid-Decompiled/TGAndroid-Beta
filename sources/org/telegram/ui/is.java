package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class is implements Runnable {
    public final int f37498a;
    public final qs f37499b;

    public is(qs qsVar, int i10) {
        this.f37498a = i10;
        this.f37499b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f37498a) {
            case 0:
                qs qsVar = this.f37499b;
                if (qsVar.J) {
                    qsVar.d.f22311b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22311b);
                    return;
                }
                return;
            case 1:
                qs.Y(this.f37499b);
                return;
            default:
                qs qsVar2 = this.f37499b;
                qsVar2.presentFragment(yn.Q9(qsVar2.H), true);
                return;
        }
    }
}
