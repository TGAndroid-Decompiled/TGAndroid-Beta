package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class es implements Runnable {
    public final int f33445a;
    public final ms f33446b;

    public es(ms msVar, int i10) {
        this.f33445a = i10;
        this.f33446b = msVar;
    }

    @Override
    public final void run() {
        switch (this.f33445a) {
            case 0:
                ms msVar = this.f33446b;
                if (msVar.J) {
                    msVar.d.f20477b.requestFocus();
                    AndroidUtilities.showKeyboard(msVar.d.f20477b);
                    return;
                }
                return;
            case 1:
                ms.Z(this.f33446b);
                return;
            default:
                ms msVar2 = this.f33446b;
                msVar2.presentFragment(wn.R9(msVar2.H), true);
                return;
        }
    }
}
