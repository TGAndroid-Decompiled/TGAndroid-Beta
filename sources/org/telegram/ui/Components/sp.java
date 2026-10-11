package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class sp implements vd1 {
    public final int f30835a;
    public final tp f30836b;

    public sp(tp tpVar, int i10) {
        this.f30835a = i10;
        this.f30836b = tpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30835a) {
            case 0:
                cq cqVar = this.f30836b.f31127a;
                cqVar.Y.dismissInternal();
                cqVar.dismiss();
                return;
            default:
                cq cqVar2 = this.f30836b.f31127a;
                cqVar2.Y.dismissInternal();
                cqVar2.dismiss();
                return;
        }
    }
}
