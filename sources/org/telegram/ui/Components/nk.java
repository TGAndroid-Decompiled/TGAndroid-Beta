package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nk implements x4 {
    public final int f31121a;
    public final xk f31122b;
    public final TLRPC.TL_messageMediaVenue f31123c;

    public nk(xk xkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i9) {
        this.f31121a = i9;
        this.f31122b = xkVar;
        this.f31123c = tL_messageMediaVenue;
    }

    @Override
    public final void B(int i9, int i10, boolean z10) {
        switch (this.f31121a) {
            case 0:
                xk xkVar = this.f31122b;
                xkVar.f34709t0.d(this.f31123c, xkVar.f34710u0, z10, i9, 0L);
                xkVar.f27493b.dismiss(true);
                return;
            default:
                xk xkVar2 = this.f31122b;
                xkVar2.f34709t0.d(this.f31123c, xkVar2.f34710u0, z10, i9, 0L);
                xkVar2.f27493b.dismiss(true);
                return;
        }
    }
}
