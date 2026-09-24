package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xk implements d5 {
    public final int f30343a;
    public final hl f30344b;
    public final TLRPC.TL_messageMediaVenue f30345c;

    public xk(hl hlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30343a = i10;
        this.f30344b = hlVar;
        this.f30345c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30343a) {
            case 0:
                hl hlVar = this.f30344b;
                hlVar.f24798x0.b(this.f30345c, hlVar.f24800y0, z10, i10, 0L);
                hlVar.f27083b.dismiss(true);
                return;
            default:
                hl hlVar2 = this.f30344b;
                hlVar2.f24798x0.b(this.f30345c, hlVar2.f24800y0, z10, i10, 0L);
                hlVar2.f27083b.dismiss(true);
                return;
        }
    }
}
