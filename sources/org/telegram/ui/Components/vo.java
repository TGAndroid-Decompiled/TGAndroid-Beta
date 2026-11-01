package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.j91;
public final class vo implements j91 {
    public final int f31354a;
    public final wo f31355b;

    public vo(wo woVar, int i10) {
        this.f31354a = i10;
        this.f31355b = woVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31354a) {
            case 0:
                dp dpVar = this.f31355b.f32289a;
                dpVar.O1.L();
                dpVar.dismiss();
                return;
            default:
                dp dpVar2 = this.f31355b.f32289a;
                dpVar2.O1.L();
                dpVar2.dismiss();
                return;
        }
    }
}
