package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yj implements Runnable {
    public final int f33168a;
    public final ak f33169b;

    public yj(ak akVar, int i10) {
        this.f33168a = i10;
        this.f33169b = akVar;
    }

    @Override
    public final void run() {
        switch (this.f33168a) {
            case 0:
                ak akVar = this.f33169b;
                if (akVar.f24566f != null) {
                    akVar.v = org.telegram.messenger.bi.g(new StringBuilder("+"), akVar.f24566f.phone, gf.b.c());
                    akVar.f24569s = akVar.f24566f;
                    AndroidUtilities.runOnUIThread(new yj(akVar, 1));
                    return;
                }
                return;
            default:
                ak akVar2 = this.f33169b;
                akVar2.f24564c.l(akVar2.v, false);
                return;
        }
    }
}
