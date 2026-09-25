package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wj implements Runnable {
    public final int f30075a;
    public final yj f30076b;

    public wj(yj yjVar, int i10) {
        this.f30075a = i10;
        this.f30076b = yjVar;
    }

    @Override
    public final void run() {
        switch (this.f30075a) {
            case 0:
                yj yjVar = this.f30076b;
                if (yjVar.f30630f != null) {
                    yjVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), yjVar.f30630f.phone, gf.b.c());
                    yjVar.f30633s = yjVar.f30630f;
                    AndroidUtilities.runOnUIThread(new wj(yjVar, 1));
                    return;
                }
                return;
            default:
                yj yjVar2 = this.f30076b;
                yjVar2.f30629c.l(yjVar2.v, false);
                return;
        }
    }
}
