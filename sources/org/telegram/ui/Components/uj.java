package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f33424a;
    public final wj f33425b;

    public uj(wj wjVar, int i10) {
        this.f33424a = i10;
        this.f33425b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f33424a) {
            case 0:
                wj wjVar = this.f33425b;
                if (wjVar.f34459f != null) {
                    wjVar.v = org.telegram.messenger.vh.g(new StringBuilder("+"), wjVar.f34459f.phone, kf.b.c());
                    wjVar.f34462s = wjVar.f34459f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f33425b;
                wjVar2.f34458c.l(wjVar2.v, false);
                return;
        }
    }
}
