package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.l91;
public final class vo implements l91 {
    public final int f31297a;
    public final wo f31298b;

    public vo(wo woVar, int i10) {
        this.f31297a = i10;
        this.f31298b = woVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31297a) {
            case 0:
                dp dpVar = this.f31298b.f32222a;
                dpVar.O1.L();
                dpVar.dismiss();
                return;
            default:
                dp dpVar2 = this.f31298b.f32222a;
                dpVar2.O1.L();
                dpVar2.dismiss();
                return;
        }
    }
}
