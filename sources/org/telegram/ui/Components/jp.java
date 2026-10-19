package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class jp implements jc1 {
    public final int f27565a;
    public final ti f27566b;
    public final org.telegram.ui.fc f27567c;

    public jp(ti tiVar, org.telegram.ui.fc fcVar, int i10) {
        this.f27565a = i10;
        this.f27566b = tiVar;
        this.f27567c = fcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27565a) {
            case 0:
                this.f27566b.dismissInternal();
                this.f27567c.run(tL_wallPaper);
                return;
            default:
                this.f27566b.dismissInternal();
                this.f27567c.run(tL_wallPaper);
                return;
        }
    }
}
