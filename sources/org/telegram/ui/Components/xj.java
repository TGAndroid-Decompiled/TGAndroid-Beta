package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xj implements Runnable {
    public final int f30425a;
    public final zj f30426b;

    public xj(zj zjVar, int i10) {
        this.f30425a = i10;
        this.f30426b = zjVar;
    }

    @Override
    public final void run() {
        switch (this.f30425a) {
            case 0:
                zj zjVar = this.f30426b;
                if (zjVar.f30935f != null) {
                    zjVar.v = org.telegram.messenger.qk.h(new StringBuilder("+"), zjVar.f30935f.phone, gf.b.c());
                    zjVar.f30938s = zjVar.f30935f;
                    AndroidUtilities.runOnUIThread(new xj(zjVar, 1));
                    return;
                }
                return;
            default:
                zj zjVar2 = this.f30426b;
                zjVar2.f30934c.l(zjVar2.v, false);
                return;
        }
    }
}
