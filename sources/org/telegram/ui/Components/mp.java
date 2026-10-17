package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lc1;
public final class mp implements lc1 {
    public final int f28564a;
    public final np f28565b;

    public mp(np npVar, int i10) {
        this.f28564a = i10;
        this.f28565b = npVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28564a) {
            case 0:
                wp wpVar = this.f28565b.f28810a;
                wpVar.Y.dismissInternal();
                wpVar.dismiss();
                return;
            default:
                wp wpVar2 = this.f28565b.f28810a;
                wpVar2.Y.dismissInternal();
                wpVar2.dismiss();
                return;
        }
    }
}
