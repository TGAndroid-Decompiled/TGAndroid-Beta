package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cp implements org.telegram.ui.u71 {
    public final int f34101a;
    public final dp f34102b;

    public cp(dp dpVar, int i7) {
        this.f34101a = i7;
        this.f34102b = dpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f34101a) {
            case 0:
                kp kpVar = this.f34102b.f34420a;
                kpVar.S1.L();
                kpVar.dismiss();
                return;
            default:
                kp kpVar2 = this.f34102b.f34420a;
                kpVar2.S1.L();
                kpVar2.dismiss();
                return;
        }
    }
}
