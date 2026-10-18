package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f31005a;
    public final wj f31006b;

    public uj(wj wjVar, int i10) {
        this.f31005a = i10;
        this.f31006b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f31005a) {
            case 0:
                wj wjVar = this.f31006b;
                if (wjVar.f32141f != null) {
                    wjVar.v = org.telegram.messenger.kk.g(new StringBuilder("+"), wjVar.f32141f.phone, jf.b.c());
                    wjVar.f32144s = wjVar.f32141f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f31006b;
                wjVar2.f32140c.l(wjVar2.v, false);
                return;
        }
    }
}
