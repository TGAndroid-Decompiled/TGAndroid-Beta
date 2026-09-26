package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class ap implements nd1 {
    public final int f22743a;
    public final wi f22744b;
    public final org.telegram.ui.ec f22745c;

    public ap(wi wiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f22743a = i10;
        this.f22744b = wiVar;
        this.f22745c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f22743a) {
            case 0:
                this.f22744b.dismissInternal();
                this.f22745c.run(tL_wallPaper);
                return;
            default:
                this.f22744b.dismissInternal();
                this.f22745c.run(tL_wallPaper);
                return;
        }
    }
}
