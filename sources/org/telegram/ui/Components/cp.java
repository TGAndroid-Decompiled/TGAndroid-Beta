package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;
public final class cp implements od1 {
    public final int f25475a;
    public final xi f25476b;
    public final org.telegram.ui.gc f25477c;

    public cp(xi xiVar, org.telegram.ui.gc gcVar, int i10) {
        this.f25475a = i10;
        this.f25476b = xiVar;
        this.f25477c = gcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f25475a) {
            case 0:
                this.f25476b.dismissInternal();
                this.f25477c.run(tL_wallPaper);
                return;
            default:
                this.f25476b.dismissInternal();
                this.f25477c.run(tL_wallPaper);
                return;
        }
    }
}
