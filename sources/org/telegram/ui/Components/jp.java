package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class jp implements jc1 {
    public final int f27610a;
    public final ti f27611b;
    public final org.telegram.ui.fc f27612c;

    public jp(ti tiVar, org.telegram.ui.fc fcVar, int i10) {
        this.f27610a = i10;
        this.f27611b = tiVar;
        this.f27612c = fcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27610a) {
            case 0:
                this.f27611b.dismissInternal();
                this.f27612c.run(tL_wallPaper);
                return;
            default:
                this.f27611b.dismissInternal();
                this.f27612c.run(tL_wallPaper);
                return;
        }
    }
}
