package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dd1;
public final class yo implements dd1 {
    public final int f33552a;
    public final mi f33553b;
    public final org.telegram.ui.w3 f33554c;

    public yo(mi miVar, org.telegram.ui.w3 w3Var, int i10) {
        this.f33552a = i10;
        this.f33553b = miVar;
        this.f33554c = w3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f33552a) {
            case 0:
                this.f33553b.dismissInternal();
                this.f33554c.run(tL_wallPaper);
                return;
            default:
                this.f33553b.dismissInternal();
                this.f33554c.run(tL_wallPaper);
                return;
        }
    }
}
