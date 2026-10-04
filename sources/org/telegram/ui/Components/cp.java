package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qd1;
public final class cp implements qd1 {
    public final int f25421a;
    public final xi f25422b;
    public final org.telegram.ui.gc f25423c;

    public cp(xi xiVar, org.telegram.ui.gc gcVar, int i10) {
        this.f25421a = i10;
        this.f25422b = xiVar;
        this.f25423c = gcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f25421a) {
            case 0:
                this.f25422b.dismissInternal();
                this.f25423c.run(tL_wallPaper);
                return;
            default:
                this.f25422b.dismissInternal();
                this.f25423c.run(tL_wallPaper);
                return;
        }
    }
}
