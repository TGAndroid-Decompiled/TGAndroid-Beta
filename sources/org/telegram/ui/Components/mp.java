package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class mp implements jc1 {
    public final int f28579a;
    public final np f28580b;

    public mp(np npVar, int i10) {
        this.f28579a = i10;
        this.f28580b = npVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28579a) {
            case 0:
                wp wpVar = this.f28580b.f28828a;
                wpVar.Y.dismissInternal();
                wpVar.dismiss();
                return;
            default:
                wp wpVar2 = this.f28580b.f28828a;
                wpVar2.Y.dismissInternal();
                wpVar2.dismiss();
                return;
        }
    }
}
