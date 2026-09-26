package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xj implements Runnable {
    public final int f30359a;
    public final zj f30360b;

    public xj(zj zjVar, int i10) {
        this.f30359a = i10;
        this.f30360b = zjVar;
    }

    @Override
    public final void run() {
        switch (this.f30359a) {
            case 0:
                zj zjVar = this.f30360b;
                if (zjVar.f30906f != null) {
                    zjVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), zjVar.f30906f.phone, gf.b.c());
                    zjVar.f30909s = zjVar.f30906f;
                    AndroidUtilities.runOnUIThread(new xj(zjVar, 1));
                    return;
                }
                return;
            default:
                zj zjVar2 = this.f30360b;
                zjVar2.f30905c.l(zjVar2.v, false);
                return;
        }
    }
}
