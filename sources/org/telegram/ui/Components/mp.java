package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class mp implements jc1 {
    public final int f28581a;
    public final np f28582b;

    public mp(np npVar, int i10) {
        this.f28581a = i10;
        this.f28582b = npVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28581a) {
            case 0:
                wp wpVar = this.f28582b.f28862a;
                wpVar.Y.dismissInternal();
                wpVar.dismiss();
                return;
            default:
                wp wpVar2 = this.f28582b.f28862a;
                wpVar2.Y.dismissInternal();
                wpVar2.dismiss();
                return;
        }
    }
}
