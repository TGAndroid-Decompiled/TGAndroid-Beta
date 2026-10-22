package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class jp implements jc1 {
    public final int f27613a;
    public final ti f27614b;
    public final org.telegram.ui.fc f27615c;

    public jp(ti tiVar, org.telegram.ui.fc fcVar, int i10) {
        this.f27613a = i10;
        this.f27614b = tiVar;
        this.f27615c = fcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27613a) {
            case 0:
                this.f27614b.dismissInternal();
                this.f27615c.run(tL_wallPaper);
                return;
            default:
                this.f27614b.dismissInternal();
                this.f27615c.run(tL_wallPaper);
                return;
        }
    }
}
