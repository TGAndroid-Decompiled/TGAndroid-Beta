package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f33415a;
    public final wj f33416b;

    public uj(wj wjVar, int i10) {
        this.f33415a = i10;
        this.f33416b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f33415a) {
            case 0:
                wj wjVar = this.f33416b;
                if (wjVar.f34527f != null) {
                    wjVar.v = org.telegram.messenger.wh.g(new StringBuilder("+"), wjVar.f34527f.phone, kf.b.c());
                    wjVar.f34530s = wjVar.f34527f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f33416b;
                wjVar2.f34526c.l(wjVar2.v, false);
                return;
        }
    }
}
