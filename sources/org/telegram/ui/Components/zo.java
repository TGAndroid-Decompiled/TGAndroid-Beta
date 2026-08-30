package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bd1;
public final class zo implements bd1 {
    public final int f31411a;
    public final ap f31412b;

    public zo(ap apVar, int i10) {
        this.f31411a = i10;
        this.f31412b = apVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31411a) {
            case 0:
                kp kpVar = this.f31412b.f23484a;
                kpVar.V.dismissInternal();
                kpVar.dismiss();
                return;
            default:
                kp kpVar2 = this.f31412b.f23484a;
                kpVar2.V.dismissInternal();
                kpVar2.dismiss();
                return;
        }
    }
}
