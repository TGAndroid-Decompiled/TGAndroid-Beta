package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yj implements Runnable {
    public final int f33161a;
    public final ak f33162b;

    public yj(ak akVar, int i10) {
        this.f33161a = i10;
        this.f33162b = akVar;
    }

    @Override
    public final void run() {
        switch (this.f33161a) {
            case 0:
                ak akVar = this.f33162b;
                if (akVar.f24561f != null) {
                    akVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), akVar.f24561f.phone, gf.b.c());
                    akVar.f24564s = akVar.f24561f;
                    AndroidUtilities.runOnUIThread(new yj(akVar, 1));
                    return;
                }
                return;
            default:
                ak akVar2 = this.f33162b;
                akVar2.f24559c.l(akVar2.v, false);
                return;
        }
    }
}
