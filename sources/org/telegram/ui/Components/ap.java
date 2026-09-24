package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class ap implements nd1 {
    public final int f22725a;
    public final wi f22726b;
    public final org.telegram.ui.ec f22727c;

    public ap(wi wiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f22725a = i10;
        this.f22726b = wiVar;
        this.f22727c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f22725a) {
            case 0:
                this.f22726b.dismissInternal();
                this.f22727c.run(tL_wallPaper);
                return;
            default:
                this.f22726b.dismissInternal();
                this.f22727c.run(tL_wallPaper);
                return;
        }
    }
}
