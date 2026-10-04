package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qd1;
public final class cp implements qd1 {
    public final int f25422a;
    public final xi f25423b;
    public final org.telegram.ui.gc f25424c;

    public cp(xi xiVar, org.telegram.ui.gc gcVar, int i10) {
        this.f25422a = i10;
        this.f25423b = xiVar;
        this.f25424c = gcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f25422a) {
            case 0:
                this.f25423b.dismissInternal();
                this.f25424c.run(tL_wallPaper);
                return;
            default:
                this.f25423b.dismissInternal();
                this.f25424c.run(tL_wallPaper);
                return;
        }
    }
}
