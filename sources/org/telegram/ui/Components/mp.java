package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.be1;
public final class mp implements be1 {
    public final int f27179a;
    public final vi f27180b;
    public final org.telegram.ui.kc f27181c;

    public mp(vi viVar, org.telegram.ui.kc kcVar, int i10) {
        this.f27179a = i10;
        this.f27180b = viVar;
        this.f27181c = kcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27179a) {
            case 0:
                this.f27180b.dismissInternal();
                this.f27181c.run(tL_wallPaper);
                return;
            default:
                this.f27180b.dismissInternal();
                this.f27181c.run(tL_wallPaper);
                return;
        }
    }
}
