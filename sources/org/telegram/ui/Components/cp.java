package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class cp implements wd1 {
    public final int f23112a;
    public final dp f23113b;

    public cp(dp dpVar, int i10) {
        this.f23112a = i10;
        this.f23113b = dpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23112a) {
            case 0:
                mp mpVar = this.f23113b.f23372a;
                mpVar.Y.dismissInternal();
                mpVar.dismiss();
                return;
            default:
                mp mpVar2 = this.f23113b.f23372a;
                mpVar2.Y.dismissInternal();
                mpVar2.dismiss();
                return;
        }
    }
}
