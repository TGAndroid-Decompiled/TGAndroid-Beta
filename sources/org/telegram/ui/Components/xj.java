package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xj implements Runnable {
    public final int f30390a;
    public final zj f30391b;

    public xj(zj zjVar, int i10) {
        this.f30390a = i10;
        this.f30391b = zjVar;
    }

    @Override
    public final void run() {
        switch (this.f30390a) {
            case 0:
                zj zjVar = this.f30391b;
                if (zjVar.f30904f != null) {
                    zjVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), zjVar.f30904f.phone, gf.b.c());
                    zjVar.f30907s = zjVar.f30904f;
                    AndroidUtilities.runOnUIThread(new xj(zjVar, 1));
                    return;
                }
                return;
            default:
                zj zjVar2 = this.f30391b;
                zjVar2.f30903c.l(zjVar2.v, false);
                return;
        }
    }
}
