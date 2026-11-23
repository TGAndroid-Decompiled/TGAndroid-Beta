package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fp implements org.telegram.ui.w71 {
    public final int f35293a;
    public final gp f35294b;

    public fp(gp gpVar, int i7) {
        this.f35293a = i7;
        this.f35294b = gpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35293a) {
            case 0:
                np npVar = this.f35294b.f35649a;
                npVar.S1.L();
                npVar.dismiss();
                return;
            default:
                np npVar2 = this.f35294b.f35649a;
                npVar2.S1.L();
                npVar2.dismiss();
                return;
        }
    }
}
