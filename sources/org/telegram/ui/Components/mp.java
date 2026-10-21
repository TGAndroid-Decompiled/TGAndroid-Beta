package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class mp implements jc1 {
    public final int f28578a;
    public final np f28579b;

    public mp(np npVar, int i10) {
        this.f28578a = i10;
        this.f28579b = npVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28578a) {
            case 0:
                wp wpVar = this.f28579b.f28859a;
                wpVar.Y.dismissInternal();
                wpVar.dismiss();
                return;
            default:
                wp wpVar2 = this.f28579b.f28859a;
                wpVar2.Y.dismissInternal();
                wpVar2.dismiss();
                return;
        }
    }
}
