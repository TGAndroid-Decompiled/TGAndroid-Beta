package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ud1;
public final class cp implements ud1 {
    public final int f23116a;
    public final dp f23117b;

    public cp(dp dpVar, int i10) {
        this.f23116a = i10;
        this.f23117b = dpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23116a) {
            case 0:
                mp mpVar = this.f23117b.f23371a;
                mpVar.Y.dismissInternal();
                mpVar.dismiss();
                return;
            default:
                mp mpVar2 = this.f23117b.f23371a;
                mpVar2.Y.dismissInternal();
                mpVar2.dismiss();
                return;
        }
    }
}
