package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wj implements Runnable {
    public final int f30074a;
    public final yj f30075b;

    public wj(yj yjVar, int i10) {
        this.f30074a = i10;
        this.f30075b = yjVar;
    }

    @Override
    public final void run() {
        switch (this.f30074a) {
            case 0:
                yj yjVar = this.f30075b;
                if (yjVar.f30629f != null) {
                    yjVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), yjVar.f30629f.phone, gf.b.c());
                    yjVar.f30632s = yjVar.f30629f;
                    AndroidUtilities.runOnUIThread(new wj(yjVar, 1));
                    return;
                }
                return;
            default:
                yj yjVar2 = this.f30075b;
                yjVar2.f30628c.l(yjVar2.v, false);
                return;
        }
    }
}
