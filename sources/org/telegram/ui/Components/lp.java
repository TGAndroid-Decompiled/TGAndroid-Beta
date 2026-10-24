package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oc1;
public final class lp implements oc1 {
    public final int f28426a;
    public final mp f28427b;

    public lp(mp mpVar, int i10) {
        this.f28426a = i10;
        this.f28427b = mpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f28426a) {
            case 0:
                up upVar = this.f28427b.f28665a;
                upVar.X.dismissInternal();
                upVar.dismiss();
                return;
            default:
                up upVar2 = this.f28427b.f28665a;
                upVar2.X.dismissInternal();
                upVar2.dismiss();
                return;
        }
    }
}
