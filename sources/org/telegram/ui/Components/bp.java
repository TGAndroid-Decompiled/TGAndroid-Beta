package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class bp implements nd1 {
    public final int f23047a;
    public final wi f23048b;
    public final org.telegram.ui.ec f23049c;

    public bp(wi wiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f23047a = i10;
        this.f23048b = wiVar;
        this.f23049c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23047a) {
            case 0:
                this.f23048b.dismissInternal();
                this.f23049c.run(tL_wallPaper);
                return;
            default:
                this.f23048b.dismissInternal();
                this.f23049c.run(tL_wallPaper);
                return;
        }
    }
}
