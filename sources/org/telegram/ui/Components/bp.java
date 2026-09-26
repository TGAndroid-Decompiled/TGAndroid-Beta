package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class bp implements nd1 {
    public final int f23076a;
    public final wi f23077b;
    public final org.telegram.ui.ec f23078c;

    public bp(wi wiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f23076a = i10;
        this.f23077b = wiVar;
        this.f23078c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23076a) {
            case 0:
                this.f23077b.dismissInternal();
                this.f23078c.run(tL_wallPaper);
                return;
            default:
                this.f23077b.dismissInternal();
                this.f23078c.run(tL_wallPaper);
                return;
        }
    }
}
