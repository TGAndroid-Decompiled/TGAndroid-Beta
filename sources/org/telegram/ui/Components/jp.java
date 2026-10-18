package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lc1;
public final class jp implements lc1 {
    public final int f27571a;
    public final ti f27572b;
    public final org.telegram.ui.hc f27573c;

    public jp(ti tiVar, org.telegram.ui.hc hcVar, int i10) {
        this.f27571a = i10;
        this.f27572b = tiVar;
        this.f27573c = hcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27571a) {
            case 0:
                this.f27572b.dismissInternal();
                this.f27573c.run(tL_wallPaper);
                return;
            default:
                this.f27572b.dismissInternal();
                this.f27573c.run(tL_wallPaper);
                return;
        }
    }
}
