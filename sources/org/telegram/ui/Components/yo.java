package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;
public final class yo implements id1 {
    public final int f33576a;
    public final mi f33577b;
    public final org.telegram.ui.w3 f33578c;

    public yo(mi miVar, org.telegram.ui.w3 w3Var, int i10) {
        this.f33576a = i10;
        this.f33577b = miVar;
        this.f33578c = w3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f33576a) {
            case 0:
                this.f33577b.dismissInternal();
                this.f33578c.run(tL_wallPaper);
                return;
            default:
                this.f33577b.dismissInternal();
                this.f33578c.run(tL_wallPaper);
                return;
        }
    }
}
