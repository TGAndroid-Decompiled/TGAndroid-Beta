package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wj implements Runnable {
    public final int f30054a;
    public final yj f30055b;

    public wj(yj yjVar, int i10) {
        this.f30054a = i10;
        this.f30055b = yjVar;
    }

    @Override
    public final void run() {
        switch (this.f30054a) {
            case 0:
                yj yjVar = this.f30055b;
                if (yjVar.f30619f != null) {
                    yjVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), yjVar.f30619f.phone, gf.b.c());
                    yjVar.f30622s = yjVar.f30619f;
                    AndroidUtilities.runOnUIThread(new wj(yjVar, 1));
                    return;
                }
                return;
            default:
                yj yjVar2 = this.f30055b;
                yjVar2.f30618c.l(yjVar2.v, false);
                return;
        }
    }
}
