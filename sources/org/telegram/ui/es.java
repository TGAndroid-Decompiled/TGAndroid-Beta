package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class es implements Runnable {
    public final int f33545a;
    public final ms f33546b;

    public es(ms msVar, int i10) {
        this.f33545a = i10;
        this.f33546b = msVar;
    }

    @Override
    public final void run() {
        switch (this.f33545a) {
            case 0:
                ms msVar = this.f33546b;
                if (msVar.J) {
                    msVar.d.f20508b.requestFocus();
                    AndroidUtilities.showKeyboard(msVar.d.f20508b);
                    return;
                }
                return;
            case 1:
                ms.Z(this.f33546b);
                return;
            default:
                ms msVar2 = this.f33546b;
                msVar2.presentFragment(wn.R9(msVar2.H), true);
                return;
        }
    }
}
