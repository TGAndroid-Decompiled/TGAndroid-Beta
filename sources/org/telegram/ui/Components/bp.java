package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class bp implements nd1 {
    public final int f23077a;
    public final wi f23078b;
    public final org.telegram.ui.ec f23079c;

    public bp(wi wiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f23077a = i10;
        this.f23078b = wiVar;
        this.f23079c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23077a) {
            case 0:
                this.f23078b.dismissInternal();
                this.f23079c.run(tL_wallPaper);
                return;
            default:
                this.f23078b.dismissInternal();
                this.f23079c.run(tL_wallPaper);
                return;
        }
    }
}
