package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yj implements Runnable {
    public final int f30726a;
    public final ak f30727b;

    public yj(ak akVar, int i10) {
        this.f30726a = i10;
        this.f30727b = akVar;
    }

    @Override
    public final void run() {
        switch (this.f30726a) {
            case 0:
                ak akVar = this.f30727b;
                if (akVar.f22648f != null) {
                    akVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), akVar.f22648f.phone, gf.b.c());
                    akVar.f22651s = akVar.f22648f;
                    AndroidUtilities.runOnUIThread(new yj(akVar, 1));
                    return;
                }
                return;
            default:
                ak akVar2 = this.f30727b;
                akVar2.f22647c.l(akVar2.v, false);
                return;
        }
    }
}
