package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.j91;
public final class so implements j91 {
    public final int f30400a;
    public final bi f30401b;
    public final org.telegram.ui.cc f30402c;

    public so(bi biVar, org.telegram.ui.cc ccVar, int i10) {
        this.f30400a = i10;
        this.f30401b = biVar;
        this.f30402c = ccVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30400a) {
            case 0:
                this.f30401b.L();
                this.f30402c.a(tL_wallPaper);
                return;
            default:
                this.f30401b.L();
                this.f30402c.a(tL_wallPaper);
                return;
        }
    }
}
