package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;
public final class bp implements od1 {
    public final int f23101a;
    public final wi f23102b;
    public final org.telegram.ui.gc f23103c;

    public bp(wi wiVar, org.telegram.ui.gc gcVar, int i10) {
        this.f23101a = i10;
        this.f23102b = wiVar;
        this.f23103c = gcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23101a) {
            case 0:
                this.f23102b.dismissInternal();
                this.f23103c.run(tL_wallPaper);
                return;
            default:
                this.f23102b.dismissInternal();
                this.f23103c.run(tL_wallPaper);
                return;
        }
    }
}
