package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class jp implements jc1 {
    public final int f27614a;
    public final ti f27615b;
    public final org.telegram.ui.fc f27616c;

    public jp(ti tiVar, org.telegram.ui.fc fcVar, int i10) {
        this.f27614a = i10;
        this.f27615b = tiVar;
        this.f27616c = fcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27614a) {
            case 0:
                this.f27615b.dismissInternal();
                this.f27616c.run(tL_wallPaper);
                return;
            default:
                this.f27615b.dismissInternal();
                this.f27616c.run(tL_wallPaper);
                return;
        }
    }
}
