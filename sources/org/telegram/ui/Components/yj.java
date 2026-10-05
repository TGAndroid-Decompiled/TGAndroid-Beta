package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yj implements Runnable {
    public final int f33285a;
    public final ak f33286b;

    public yj(ak akVar, int i10) {
        this.f33285a = i10;
        this.f33286b = akVar;
    }

    @Override
    public final void run() {
        switch (this.f33285a) {
            case 0:
                ak akVar = this.f33286b;
                if (akVar.f24632f != null) {
                    akVar.v = org.telegram.messenger.bi.g(new StringBuilder("+"), akVar.f24632f.phone, gf.b.c());
                    akVar.f24635s = akVar.f24632f;
                    AndroidUtilities.runOnUIThread(new yj(akVar, 1));
                    return;
                }
                return;
            default:
                ak akVar2 = this.f33286b;
                akVar2.f24630c.l(akVar2.v, false);
                return;
        }
    }
}
