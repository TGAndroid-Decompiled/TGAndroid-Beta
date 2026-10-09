package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class sp implements wd1 {
    public final int f30864a;
    public final tp f30865b;

    public sp(tp tpVar, int i10) {
        this.f30864a = i10;
        this.f30865b = tpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30864a) {
            case 0:
                cq cqVar = this.f30865b.f31261a;
                cqVar.Y.dismissInternal();
                cqVar.dismiss();
                return;
            default:
                cq cqVar2 = this.f30865b.f31261a;
                cqVar2.Y.dismissInternal();
                cqVar2.dismiss();
                return;
        }
    }
}
