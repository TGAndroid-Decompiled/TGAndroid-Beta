package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.u71;
public final class ko implements u71 {
    public final int f35400a;
    public final di f35401b;
    public final org.telegram.ui.wb f35402c;

    public ko(di diVar, org.telegram.ui.wb wbVar, int i7) {
        this.f35400a = i7;
        this.f35401b = diVar;
        this.f35402c = wbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35400a) {
            case 0:
                this.f35401b.K();
                this.f35402c.a(tL_wallPaper);
                return;
            default:
                this.f35401b.K();
                this.f35402c.a(tL_wallPaper);
                return;
        }
    }
}
