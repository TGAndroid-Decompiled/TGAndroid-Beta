package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f30950a;
    public final wj f30951b;

    public uj(wj wjVar, int i10) {
        this.f30950a = i10;
        this.f30951b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f30950a) {
            case 0:
                wj wjVar = this.f30951b;
                if (wjVar.f32135f != null) {
                    wjVar.v = org.telegram.messenger.mk.g(new StringBuilder("+"), wjVar.f32135f.phone, jf.b.c());
                    wjVar.f32138s = wjVar.f32135f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f30951b;
                wjVar2.f32134c.l(wjVar2.v, false);
                return;
        }
    }
}
