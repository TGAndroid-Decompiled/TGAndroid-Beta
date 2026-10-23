package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class mp implements jc1 {
    public final int f28582a;
    public final np f28583b;

    public mp(np npVar, int i10) {
        this.f28582a = i10;
        this.f28583b = npVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28582a) {
            case 0:
                wp wpVar = this.f28583b.f28863a;
                wpVar.Y.dismissInternal();
                wpVar.dismiss();
                return;
            default:
                wp wpVar2 = this.f28583b.f28863a;
                wpVar2.Y.dismissInternal();
                wpVar2.dismiss();
                return;
        }
    }
}
