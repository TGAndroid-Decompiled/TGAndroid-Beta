package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;
public final class ko implements t71 {
    public final int f35383a;
    public final di f35384b;
    public final org.telegram.ui.wb f35385c;

    public ko(di diVar, org.telegram.ui.wb wbVar, int i7) {
        this.f35383a = i7;
        this.f35384b = diVar;
        this.f35385c = wbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35383a) {
            case 0:
                this.f35384b.K();
                this.f35385c.a(tL_wallPaper);
                return;
            default:
                this.f35384b.K();
                this.f35385c.a(tL_wallPaper);
                return;
        }
    }
}
