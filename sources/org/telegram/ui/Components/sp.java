package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class sp implements vd1 {
    public final int f30903a;
    public final tp f30904b;

    public sp(tp tpVar, int i10) {
        this.f30903a = i10;
        this.f30904b = tpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30903a) {
            case 0:
                cq cqVar = this.f30904b.f31315a;
                cqVar.Y.dismissInternal();
                cqVar.dismiss();
                return;
            default:
                cq cqVar2 = this.f30904b.f31315a;
                cqVar2.Y.dismissInternal();
                cqVar2.dismiss();
                return;
        }
    }
}
