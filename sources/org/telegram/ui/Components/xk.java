package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xk implements d5 {
    public final int f30351a;
    public final hl f30352b;
    public final TLRPC.TL_messageMediaVenue f30353c;

    public xk(hl hlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30351a = i10;
        this.f30352b = hlVar;
        this.f30353c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30351a) {
            case 0:
                hl hlVar = this.f30352b;
                hlVar.f24825x0.b(this.f30353c, hlVar.f24827y0, z10, i10, 0L);
                hlVar.f27088b.dismiss(true);
                return;
            default:
                hl hlVar2 = this.f30352b;
                hlVar2.f24825x0.b(this.f30353c, hlVar2.f24827y0, z10, i10, 0L);
                hlVar2.f27088b.dismiss(true);
                return;
        }
    }
}
