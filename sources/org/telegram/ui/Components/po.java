package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nc1;
public final class po implements nc1 {
    public final int f31714a;
    public final ki f31715b;
    public final org.telegram.ui.w3 f31716c;

    public po(ki kiVar, org.telegram.ui.w3 w3Var, int i9) {
        this.f31714a = i9;
        this.f31715b = kiVar;
        this.f31716c = w3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31714a) {
            case 0:
                this.f31715b.dismissInternal();
                this.f31716c.run(tL_wallPaper);
                return;
            default:
                this.f31715b.dismissInternal();
                this.f31716c.run(tL_wallPaper);
                return;
        }
    }
}
