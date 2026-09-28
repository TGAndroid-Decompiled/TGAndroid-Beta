package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class bp implements nd1 {
    public final int f23078a;
    public final wi f23079b;
    public final org.telegram.ui.ec f23080c;

    public bp(wi wiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f23078a = i10;
        this.f23079b = wiVar;
        this.f23080c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23078a) {
            case 0:
                this.f23079b.dismissInternal();
                this.f23080c.run(tL_wallPaper);
                return;
            default:
                this.f23079b.dismissInternal();
                this.f23080c.run(tL_wallPaper);
                return;
        }
    }
}
