package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yd1;
public final class rp implements yd1 {
    public final int f30202a;
    public final aj f30203b;
    public final org.telegram.ui.ic f30204c;

    public rp(aj ajVar, org.telegram.ui.ic icVar, int i10) {
        this.f30202a = i10;
        this.f30203b = ajVar;
        this.f30204c = icVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30202a) {
            case 0:
                this.f30203b.dismissInternal();
                this.f30204c.run(tL_wallPaper);
                return;
            default:
                this.f30203b.dismissInternal();
                this.f30204c.run(tL_wallPaper);
                return;
        }
    }
}
