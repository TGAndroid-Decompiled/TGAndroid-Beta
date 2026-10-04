package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qd1;
public final class fp implements qd1 {
    public final int f26542a;
    public final gp f26543b;

    public fp(gp gpVar, int i10) {
        this.f26542a = i10;
        this.f26543b = gpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f26542a) {
            case 0:
                pp ppVar = this.f26543b.f26903a;
                ppVar.Y.dismissInternal();
                ppVar.dismiss();
                return;
            default:
                pp ppVar2 = this.f26543b.f26903a;
                ppVar2.Y.dismissInternal();
                ppVar2.dismiss();
                return;
        }
    }
}
