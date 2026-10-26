package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc1;
public final class mp implements sc1 {
    public final int f30679a;
    public final ti f30680b;
    public final org.telegram.ui.gc f30681c;

    public mp(ti tiVar, org.telegram.ui.gc gcVar, int i10) {
        this.f30679a = i10;
        this.f30680b = tiVar;
        this.f30681c = gcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30679a) {
            case 0:
                this.f30680b.dismissInternal();
                this.f30681c.run(tL_wallPaper);
                return;
            default:
                this.f30680b.dismissInternal();
                this.f30681c.run(tL_wallPaper);
                return;
        }
    }
}
