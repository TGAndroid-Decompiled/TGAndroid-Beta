package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ud1;
public final class cp implements ud1 {
    public final int f23303a;
    public final dp f23304b;

    public cp(dp dpVar, int i10) {
        this.f23303a = i10;
        this.f23304b = dpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23303a) {
            case 0:
                mp mpVar = this.f23304b.f23659a;
                mpVar.Y.dismissInternal();
                mpVar.dismiss();
                return;
            default:
                mp mpVar2 = this.f23304b.f23659a;
                mpVar2.Y.dismissInternal();
                mpVar2.dismiss();
                return;
        }
    }
}
