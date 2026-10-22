package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f30953a;
    public final wj f30954b;

    public uj(wj wjVar, int i10) {
        this.f30953a = i10;
        this.f30954b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f30953a) {
            case 0:
                wj wjVar = this.f30954b;
                if (wjVar.f32138f != null) {
                    wjVar.v = org.telegram.messenger.ok.g(new StringBuilder("+"), wjVar.f32138f.phone, jf.b.c());
                    wjVar.f32141s = wjVar.f32138f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f30954b;
                wjVar2.f32137c.l(wjVar2.v, false);
                return;
        }
    }
}
