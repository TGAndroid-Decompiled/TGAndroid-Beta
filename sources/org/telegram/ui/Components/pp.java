package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc1;
public final class pp implements sc1 {
    public final int f31671a;
    public final qp f31672b;

    public pp(qp qpVar, int i10) {
        this.f31671a = i10;
        this.f31672b = qpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31671a) {
            case 0:
                yp ypVar = this.f31672b.f31974a;
                ypVar.X.dismissInternal();
                ypVar.dismiss();
                return;
            default:
                yp ypVar2 = this.f31672b.f31974a;
                ypVar2.X.dismissInternal();
                ypVar2.dismiss();
                return;
        }
    }
}
