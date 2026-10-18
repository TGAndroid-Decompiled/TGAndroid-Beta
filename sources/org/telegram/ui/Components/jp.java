package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lc1;
public final class jp implements lc1 {
    public final int f27564a;
    public final ti f27565b;
    public final org.telegram.ui.hc f27566c;

    public jp(ti tiVar, org.telegram.ui.hc hcVar, int i10) {
        this.f27564a = i10;
        this.f27565b = tiVar;
        this.f27566c = hcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27564a) {
            case 0:
                this.f27565b.dismissInternal();
                this.f27566c.run(tL_wallPaper);
                return;
            default:
                this.f27565b.dismissInternal();
                this.f27566c.run(tL_wallPaper);
                return;
        }
    }
}
