package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bd1;
public final class wo implements bd1 {
    public final int f30395a;
    public final li f30396b;
    public final org.telegram.ui.w3 f30397c;

    public wo(li liVar, org.telegram.ui.w3 w3Var, int i10) {
        this.f30395a = i10;
        this.f30396b = liVar;
        this.f30397c = w3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f30395a) {
            case 0:
                this.f30396b.dismissInternal();
                this.f30397c.run(tL_wallPaper);
                return;
            default:
                this.f30396b.dismissInternal();
                this.f30397c.run(tL_wallPaper);
                return;
        }
    }
}
