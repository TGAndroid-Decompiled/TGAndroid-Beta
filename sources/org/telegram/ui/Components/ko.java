package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.k71;
public final class ko implements k71 {
    public final int f35454a;
    public final bi f35455b;
    public final org.telegram.ui.ub f35456c;

    public ko(bi biVar, org.telegram.ui.ub ubVar, int i3) {
        this.f35454a = i3;
        this.f35455b = biVar;
        this.f35456c = ubVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35454a) {
            case 0:
                this.f35455b.K();
                this.f35456c.a(tL_wallPaper);
                return;
            default:
                this.f35455b.K();
                this.f35456c.a(tL_wallPaper);
                return;
        }
    }
}
