package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class sp implements wd1 {
    public final int f30823a;
    public final tp f30824b;

    public sp(tp tpVar, int i10) {
        this.f30823a = i10;
        this.f30824b = tpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30823a) {
            case 0:
                cq cqVar = this.f30824b.f31196a;
                cqVar.Y.dismissInternal();
                cqVar.dismiss();
                return;
            default:
                cq cqVar2 = this.f30824b.f31196a;
                cqVar2.Y.dismissInternal();
                cqVar2.dismiss();
                return;
        }
    }
}
