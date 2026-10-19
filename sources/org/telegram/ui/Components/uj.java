package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f30973a;
    public final wj f30974b;

    public uj(wj wjVar, int i10) {
        this.f30973a = i10;
        this.f30974b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f30973a) {
            case 0:
                wj wjVar = this.f30974b;
                if (wjVar.f32133f != null) {
                    wjVar.v = org.telegram.messenger.lk.g(new StringBuilder("+"), wjVar.f32133f.phone, jf.b.c());
                    wjVar.f32136s = wjVar.f32133f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f30974b;
                wjVar2.f32132c.l(wjVar2.v, false);
                return;
        }
    }
}
