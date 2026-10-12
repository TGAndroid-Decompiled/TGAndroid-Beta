package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.be1;
public final class pp implements be1 {
    public final int f28394a;
    public final qp f28395b;

    public pp(qp qpVar, int i10) {
        this.f28394a = i10;
        this.f28395b = qpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28394a) {
            case 0:
                zp zpVar = this.f28395b.f28659a;
                zpVar.Y.dismissInternal();
                zpVar.dismiss();
                return;
            default:
                zp zpVar2 = this.f28395b.f28659a;
                zpVar2.Y.dismissInternal();
                zpVar2.dismiss();
                return;
        }
    }
}
