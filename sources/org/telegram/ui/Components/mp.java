package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.be1;
public final class mp implements be1 {
    public final int f27470a;
    public final vi f27471b;
    public final org.telegram.ui.lc f27472c;

    public mp(vi viVar, org.telegram.ui.lc lcVar, int i10) {
        this.f27470a = i10;
        this.f27471b = viVar;
        this.f27472c = lcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27470a) {
            case 0:
                this.f27471b.dismissInternal();
                this.f27472c.run(tL_wallPaper);
                return;
            default:
                this.f27471b.dismissInternal();
                this.f27472c.run(tL_wallPaper);
                return;
        }
    }
}
