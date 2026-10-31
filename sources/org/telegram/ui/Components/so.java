package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.l91;
public final class so implements l91 {
    public final int f30302a;
    public final bi f30303b;
    public final org.telegram.ui.cc f30304c;

    public so(bi biVar, org.telegram.ui.cc ccVar, int i10) {
        this.f30302a = i10;
        this.f30303b = biVar;
        this.f30304c = ccVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30302a) {
            case 0:
                this.f30303b.L();
                this.f30304c.a(tL_wallPaper);
                return;
            default:
                this.f30303b.L();
                this.f30304c.a(tL_wallPaper);
                return;
        }
    }
}
