package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jc1;
public final class jp implements jc1 {
    public final int f27567a;
    public final ti f27568b;
    public final org.telegram.ui.fc f27569c;

    public jp(ti tiVar, org.telegram.ui.fc fcVar, int i10) {
        this.f27567a = i10;
        this.f27568b = tiVar;
        this.f27569c = fcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27567a) {
            case 0:
                this.f27568b.dismissInternal();
                this.f27569c.run(tL_wallPaper);
                return;
            default:
                this.f27568b.dismissInternal();
                this.f27569c.run(tL_wallPaper);
                return;
        }
    }
}
