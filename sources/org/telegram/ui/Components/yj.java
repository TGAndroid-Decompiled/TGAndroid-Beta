package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yj implements Runnable {
    public final int f29438a;
    public final ak f29439b;

    public yj(ak akVar, int i10) {
        this.f29438a = i10;
        this.f29439b = akVar;
    }

    @Override
    public final void run() {
        switch (this.f29438a) {
            case 0:
                ak akVar = this.f29439b;
                if (akVar.f21516f != null) {
                    akVar.v = org.telegram.messenger.a2.j(new StringBuilder("+"), akVar.f21516f.phone, gf.b.c());
                    akVar.f21519s = akVar.f21516f;
                    AndroidUtilities.runOnUIThread(new yj(akVar, 1));
                    return;
                }
                return;
            default:
                ak akVar2 = this.f29439b;
                akVar2.f21515c.l(akVar2.v, false);
                return;
        }
    }
}
