package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xk implements d5 {
    public final int f30350a;
    public final hl f30351b;
    public final TLRPC.TL_messageMediaVenue f30352c;

    public xk(hl hlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30350a = i10;
        this.f30351b = hlVar;
        this.f30352c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30350a) {
            case 0:
                hl hlVar = this.f30351b;
                hlVar.f24824x0.b(this.f30352c, hlVar.f24826y0, z10, i10, 0L);
                hlVar.f27087b.dismiss(true);
                return;
            default:
                hl hlVar2 = this.f30351b;
                hlVar2.f24824x0.b(this.f30352c, hlVar2.f24826y0, z10, i10, 0L);
                hlVar2.f27087b.dismiss(true);
                return;
        }
    }
}
