package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class ap implements nd1 {
    public final int f22744a;
    public final wi f22745b;
    public final org.telegram.ui.ec f22746c;

    public ap(wi wiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f22744a = i10;
        this.f22745b = wiVar;
        this.f22746c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f22744a) {
            case 0:
                this.f22745b.dismissInternal();
                this.f22746c.run(tL_wallPaper);
                return;
            default:
                this.f22745b.dismissInternal();
                this.f22746c.run(tL_wallPaper);
                return;
        }
    }
}
