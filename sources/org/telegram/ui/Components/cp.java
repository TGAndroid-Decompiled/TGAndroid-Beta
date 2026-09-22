package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class cp implements wd1 {
    public final int f23417a;
    public final dp f23418b;

    public cp(dp dpVar, int i10) {
        this.f23417a = i10;
        this.f23418b = dpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23417a) {
            case 0:
                mp mpVar = this.f23418b.f23728a;
                mpVar.Y.dismissInternal();
                mpVar.dismiss();
                return;
            default:
                mp mpVar2 = this.f23418b.f23728a;
                mpVar2.Y.dismissInternal();
                mpVar2.dismiss();
                return;
        }
    }
}
