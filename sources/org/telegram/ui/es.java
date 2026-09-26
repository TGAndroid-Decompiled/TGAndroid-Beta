package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class es implements Runnable {
    public final int f33459a;
    public final ms f33460b;

    public es(ms msVar, int i10) {
        this.f33459a = i10;
        this.f33460b = msVar;
    }

    @Override
    public final void run() {
        switch (this.f33459a) {
            case 0:
                ms msVar = this.f33460b;
                if (msVar.J) {
                    msVar.d.f20491b.requestFocus();
                    AndroidUtilities.showKeyboard(msVar.d.f20491b);
                    return;
                }
                return;
            case 1:
                ms.Z(this.f33460b);
                return;
            default:
                ms msVar2 = this.f33460b;
                msVar2.presentFragment(wn.R9(msVar2.H), true);
                return;
        }
    }
}
