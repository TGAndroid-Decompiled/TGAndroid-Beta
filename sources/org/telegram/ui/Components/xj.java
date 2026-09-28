package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xj implements Runnable {
    public final int f30398a;
    public final zj f30399b;

    public xj(zj zjVar, int i10) {
        this.f30398a = i10;
        this.f30399b = zjVar;
    }

    @Override
    public final void run() {
        switch (this.f30398a) {
            case 0:
                zj zjVar = this.f30399b;
                if (zjVar.f30903f != null) {
                    zjVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), zjVar.f30903f.phone, gf.b.c());
                    zjVar.f30906s = zjVar.f30903f;
                    AndroidUtilities.runOnUIThread(new xj(zjVar, 1));
                    return;
                }
                return;
            default:
                zj zjVar2 = this.f30399b;
                zjVar2.f30902c.l(zjVar2.v, false);
                return;
        }
    }
}
