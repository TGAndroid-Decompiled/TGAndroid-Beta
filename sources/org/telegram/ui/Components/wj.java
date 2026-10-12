package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wj implements Runnable {
    public final int f30905a;
    public final yj f30906b;

    public wj(yj yjVar, int i10) {
        this.f30905a = i10;
        this.f30906b = yjVar;
    }

    @Override
    public final void run() {
        switch (this.f30905a) {
            case 0:
                yj yjVar = this.f30906b;
                if (yjVar.f31594f != null) {
                    yjVar.v = org.telegram.messenger.yh.g(new StringBuilder("+"), yjVar.f31594f.phone, jf.b.c());
                    yjVar.f31597s = yjVar.f31594f;
                    AndroidUtilities.runOnUIThread(new wj(yjVar, 1));
                    return;
                }
                return;
            default:
                yj yjVar2 = this.f30906b;
                yjVar2.f31593c.l(yjVar2.v, false);
                return;
        }
    }
}
