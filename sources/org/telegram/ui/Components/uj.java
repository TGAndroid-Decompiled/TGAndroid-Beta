package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj implements Runnable {
    public final int f31171a;
    public final wj f31172b;

    public uj(wj wjVar, int i10) {
        this.f31171a = i10;
        this.f31172b = wjVar;
    }

    @Override
    public final void run() {
        switch (this.f31171a) {
            case 0:
                wj wjVar = this.f31172b;
                if (wjVar.f32256f != null) {
                    wjVar.v = org.telegram.messenger.sl.h(new StringBuilder("+"), wjVar.f32256f.phone, jf.b.c());
                    wjVar.f32259s = wjVar.f32256f;
                    AndroidUtilities.runOnUIThread(new uj(wjVar, 1));
                    return;
                }
                return;
            default:
                wj wjVar2 = this.f31172b;
                wjVar2.f32255c.l(wjVar2.v, false);
                return;
        }
    }
}
