package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc1;
public final class pp implements sc1 {
    public final int f31673a;
    public final qp f31674b;

    public pp(qp qpVar, int i10) {
        this.f31673a = i10;
        this.f31674b = qpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31673a) {
            case 0:
                yp ypVar = this.f31674b.f31976a;
                ypVar.X.dismissInternal();
                ypVar.dismiss();
                return;
            default:
                yp ypVar2 = this.f31674b.f31976a;
                ypVar2.X.dismissInternal();
                ypVar2.dismiss();
                return;
        }
    }
}
