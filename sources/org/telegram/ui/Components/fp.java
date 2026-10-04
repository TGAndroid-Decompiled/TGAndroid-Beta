package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qd1;
public final class fp implements qd1 {
    public final int f26547a;
    public final gp f26548b;

    public fp(gp gpVar, int i10) {
        this.f26547a = i10;
        this.f26548b = gpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f26547a) {
            case 0:
                pp ppVar = this.f26548b.f26908a;
                ppVar.Y.dismissInternal();
                ppVar.dismiss();
                return;
            default:
                pp ppVar2 = this.f26548b.f26908a;
                ppVar2.Y.dismissInternal();
                ppVar2.dismiss();
                return;
        }
    }
}
