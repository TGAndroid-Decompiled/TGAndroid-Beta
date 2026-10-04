package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qd1;
public final class cp implements qd1 {
    public final int f25427a;
    public final xi f25428b;
    public final org.telegram.ui.gc f25429c;

    public cp(xi xiVar, org.telegram.ui.gc gcVar, int i10) {
        this.f25427a = i10;
        this.f25428b = xiVar;
        this.f25429c = gcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f25427a) {
            case 0:
                this.f25428b.dismissInternal();
                this.f25429c.run(tL_wallPaper);
                return;
            default:
                this.f25428b.dismissInternal();
                this.f25429c.run(tL_wallPaper);
                return;
        }
    }
}
