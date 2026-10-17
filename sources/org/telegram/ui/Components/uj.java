package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f30998a;
    public final wj f30999b;

    public uj(wj wjVar, int i10) {
        this.f30998a = i10;
        this.f30999b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f30998a) {
            case 0:
                wj wjVar = this.f30999b;
                if (wjVar.f32134f != null) {
                    wjVar.v = org.telegram.messenger.wh.g(new StringBuilder("+"), wjVar.f32134f.phone, jf.b.c());
                    wjVar.f32137s = wjVar.f32134f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f30999b;
                wjVar2.f32133c.l(wjVar2.v, false);
                return;
        }
    }
}
