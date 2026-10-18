package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lc1;
public final class mp implements lc1 {
    public final int f28571a;
    public final np f28572b;

    public mp(np npVar, int i10) {
        this.f28571a = i10;
        this.f28572b = npVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28571a) {
            case 0:
                wp wpVar = this.f28572b.f28817a;
                wpVar.Y.dismissInternal();
                wpVar.dismiss();
                return;
            default:
                wp wpVar2 = this.f28572b.f28817a;
                wpVar2.Y.dismissInternal();
                wpVar2.dismiss();
                return;
        }
    }
}
