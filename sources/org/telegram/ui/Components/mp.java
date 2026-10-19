package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class mp implements jc1 {
    public final int f28577a;
    public final np f28578b;

    public mp(np npVar, int i10) {
        this.f28577a = i10;
        this.f28578b = npVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28577a) {
            case 0:
                wp wpVar = this.f28578b.f28826a;
                wpVar.Y.dismissInternal();
                wpVar.dismiss();
                return;
            default:
                wp wpVar2 = this.f28578b.f28826a;
                wpVar2.Y.dismissInternal();
                wpVar2.dismiss();
                return;
        }
    }
}
