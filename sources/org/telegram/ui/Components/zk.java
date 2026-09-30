package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zk implements d5 {
    public final int f30975a;
    public final jl f30976b;
    public final TLRPC.TL_messageMediaVenue f30977c;

    public zk(jl jlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30975a = i10;
        this.f30976b = jlVar;
        this.f30977c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30975a) {
            case 0:
                jl jlVar = this.f30976b;
                jlVar.f25511x0.b(this.f30977c, jlVar.f25513y0, z10, i10, 0L);
                jlVar.f27362b.dismiss(true);
                return;
            default:
                jl jlVar2 = this.f30976b;
                jlVar2.f25511x0.b(this.f30977c, jlVar2.f25513y0, z10, i10, 0L);
                jlVar2.f27362b.dismiss(true);
                return;
        }
    }
}
