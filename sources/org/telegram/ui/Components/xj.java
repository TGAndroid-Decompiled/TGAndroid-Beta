package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xj implements Runnable {
    public final int f30397a;
    public final zj f30398b;

    public xj(zj zjVar, int i10) {
        this.f30397a = i10;
        this.f30398b = zjVar;
    }

    @Override
    public final void run() {
        switch (this.f30397a) {
            case 0:
                zj zjVar = this.f30398b;
                if (zjVar.f30902f != null) {
                    zjVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), zjVar.f30902f.phone, gf.b.c());
                    zjVar.f30905s = zjVar.f30902f;
                    AndroidUtilities.runOnUIThread(new xj(zjVar, 1));
                    return;
                }
                return;
            default:
                zj zjVar2 = this.f30398b;
                zjVar2.f30901c.l(zjVar2.v, false);
                return;
        }
    }
}
