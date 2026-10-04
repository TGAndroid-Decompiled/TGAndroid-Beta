package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zk implements d5 {
    public final int f33512a;
    public final jl f33513b;
    public final TLRPC.TL_messageMediaVenue f33514c;

    public zk(jl jlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f33512a = i10;
        this.f33513b = jlVar;
        this.f33514c = tL_messageMediaVenue;
    }

    @Override
    public final void K(int i10, int i11, boolean z10) {
        switch (this.f33512a) {
            case 0:
                jl jlVar = this.f33513b;
                jlVar.f27836x0.b(this.f33514c, jlVar.f27838y0, z10, i10, 0L);
                jlVar.f29648b.dismiss(true);
                return;
            default:
                jl jlVar2 = this.f33513b;
                jlVar2.f27836x0.b(this.f33514c, jlVar2.f27838y0, z10, i10, 0L);
                jlVar2.f29648b.dismiss(true);
                return;
        }
    }
}
