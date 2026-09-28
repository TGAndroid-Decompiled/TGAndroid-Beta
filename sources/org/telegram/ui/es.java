package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class es implements Runnable {
    public final int f33461a;
    public final ms f33462b;

    public es(ms msVar, int i10) {
        this.f33461a = i10;
        this.f33462b = msVar;
    }

    @Override
    public final void run() {
        switch (this.f33461a) {
            case 0:
                ms msVar = this.f33462b;
                if (msVar.J) {
                    msVar.d.f20492b.requestFocus();
                    AndroidUtilities.showKeyboard(msVar.d.f20492b);
                    return;
                }
                return;
            case 1:
                ms.Z(this.f33462b);
                return;
            default:
                ms msVar2 = this.f33462b;
                msVar2.presentFragment(wn.R9(msVar2.H), true);
                return;
        }
    }
}
