package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;
public final class ko implements t71 {
    public final int f35380a;
    public final di f35381b;
    public final org.telegram.ui.wb f35382c;

    public ko(di diVar, org.telegram.ui.wb wbVar, int i7) {
        this.f35380a = i7;
        this.f35381b = diVar;
        this.f35382c = wbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35380a) {
            case 0:
                this.f35381b.K();
                this.f35382c.a(tL_wallPaper);
                return;
            default:
                this.f35381b.K();
                this.f35382c.a(tL_wallPaper);
                return;
        }
    }
}
