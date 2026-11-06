package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;
public final class ko implements t71 {
    public final int f35374a;
    public final di f35375b;
    public final org.telegram.ui.wb f35376c;

    public ko(di diVar, org.telegram.ui.wb wbVar, int i7) {
        this.f35374a = i7;
        this.f35375b = diVar;
        this.f35376c = wbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35374a) {
            case 0:
                this.f35375b.K();
                this.f35376c.a(tL_wallPaper);
                return;
            default:
                this.f35375b.K();
                this.f35376c.a(tL_wallPaper);
                return;
        }
    }
}
