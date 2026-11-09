package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v71;
public final class ko implements v71 {
    public final int f35437a;
    public final di f35438b;
    public final org.telegram.ui.wb f35439c;

    public ko(di diVar, org.telegram.ui.wb wbVar, int i7) {
        this.f35437a = i7;
        this.f35438b = diVar;
        this.f35439c = wbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35437a) {
            case 0:
                this.f35438b.K();
                this.f35439c.a(tL_wallPaper);
                return;
            default:
                this.f35438b.K();
                this.f35439c.a(tL_wallPaper);
                return;
        }
    }
}
