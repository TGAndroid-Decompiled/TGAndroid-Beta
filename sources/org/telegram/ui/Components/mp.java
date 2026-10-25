package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc1;
public final class mp implements sc1 {
    public final int f30677a;
    public final ti f30678b;
    public final org.telegram.ui.gc f30679c;

    public mp(ti tiVar, org.telegram.ui.gc gcVar, int i10) {
        this.f30677a = i10;
        this.f30678b = tiVar;
        this.f30679c = gcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30677a) {
            case 0:
                this.f30678b.dismissInternal();
                this.f30679c.run(tL_wallPaper);
                return;
            default:
                this.f30678b.dismissInternal();
                this.f30679c.run(tL_wallPaper);
                return;
        }
    }
}
