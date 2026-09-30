package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class fp implements nd1 {
    public final int f24324a;
    public final gp f24325b;

    public fp(gp gpVar, int i10) {
        this.f24324a = i10;
        this.f24325b = gpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f24324a) {
            case 0:
                pp ppVar = this.f24325b.f24655a;
                ppVar.Y.dismissInternal();
                ppVar.dismiss();
                return;
            default:
                pp ppVar2 = this.f24325b.f24655a;
                ppVar2.Y.dismissInternal();
                ppVar2.dismiss();
                return;
        }
    }
}
