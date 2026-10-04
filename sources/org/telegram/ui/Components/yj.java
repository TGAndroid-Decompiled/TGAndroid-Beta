package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yj implements Runnable {
    public final int f33162a;
    public final ak f33163b;

    public yj(ak akVar, int i10) {
        this.f33162a = i10;
        this.f33163b = akVar;
    }

    @Override
    public final void run() {
        switch (this.f33162a) {
            case 0:
                ak akVar = this.f33163b;
                if (akVar.f24562f != null) {
                    akVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), akVar.f24562f.phone, gf.b.c());
                    akVar.f24565s = akVar.f24562f;
                    AndroidUtilities.runOnUIThread(new yj(akVar, 1));
                    return;
                }
                return;
            default:
                ak akVar2 = this.f33163b;
                akVar2.f24560c.l(akVar2.v, false);
                return;
        }
    }
}
