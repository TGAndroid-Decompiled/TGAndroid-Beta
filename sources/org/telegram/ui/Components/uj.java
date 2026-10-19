package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f30971a;
    public final wj f30972b;

    public uj(wj wjVar, int i10) {
        this.f30971a = i10;
        this.f30972b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f30971a) {
            case 0:
                wj wjVar = this.f30972b;
                if (wjVar.f32131f != null) {
                    wjVar.v = org.telegram.messenger.kk.g(new StringBuilder("+"), wjVar.f32131f.phone, jf.b.c());
                    wjVar.f32134s = wjVar.f32131f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f30972b;
                wjVar2.f32130c.l(wjVar2.v, false);
                return;
        }
    }
}
