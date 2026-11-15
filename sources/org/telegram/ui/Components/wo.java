package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wo implements org.telegram.ui.s71 {
    public final int f41410a;
    public final xo f41411b;

    public wo(xo xoVar, int i7) {
        this.f41410a = i7;
        this.f41411b = xoVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f41410a) {
            case 0:
                ep epVar = this.f41411b.f41743a;
                epVar.S1.L();
                epVar.dismiss();
                return;
            default:
                ep epVar2 = this.f41411b.f41743a;
                epVar2.S1.L();
                epVar2.dismiss();
                return;
        }
    }
}
