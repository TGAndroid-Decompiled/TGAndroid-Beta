package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f30954a;
    public final wj f30955b;

    public uj(wj wjVar, int i10) {
        this.f30954a = i10;
        this.f30955b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f30954a) {
            case 0:
                wj wjVar = this.f30955b;
                if (wjVar.f32139f != null) {
                    wjVar.v = org.telegram.messenger.nk.g(new StringBuilder("+"), wjVar.f32139f.phone, jf.b.c());
                    wjVar.f32142s = wjVar.f32139f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f30955b;
                wjVar2.f32138c.l(wjVar2.v, false);
                return;
        }
    }
}
