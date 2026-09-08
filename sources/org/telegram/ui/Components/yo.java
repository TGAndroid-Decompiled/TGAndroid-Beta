package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;
public final class yo implements vd1 {
    public final int f33001a;
    public final vi f33002b;
    public final org.telegram.ui.t3 f33003c;

    public yo(vi viVar, org.telegram.ui.t3 t3Var, int i10) {
        this.f33001a = i10;
        this.f33002b = viVar;
        this.f33003c = t3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f33001a) {
            case 0:
                this.f33002b.dismissInternal();
                this.f33003c.run(tL_wallPaper);
                return;
            default:
                this.f33002b.dismissInternal();
                this.f33003c.run(tL_wallPaper);
                return;
        }
    }
}
