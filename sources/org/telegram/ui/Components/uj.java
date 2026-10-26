package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f33427a;
    public final wj f33428b;

    public uj(wj wjVar, int i10) {
        this.f33427a = i10;
        this.f33428b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f33427a) {
            case 0:
                wj wjVar = this.f33428b;
                if (wjVar.f34462f != null) {
                    wjVar.v = org.telegram.messenger.vh.g(new StringBuilder("+"), wjVar.f34462f.phone, kf.b.c());
                    wjVar.f34465s = wjVar.f34462f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f33428b;
                wjVar2.f34461c.l(wjVar2.v, false);
                return;
        }
    }
}
