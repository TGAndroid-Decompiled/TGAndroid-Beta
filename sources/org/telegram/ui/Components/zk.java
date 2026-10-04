package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zk implements d5 {
    public final int f33506a;
    public final jl f33507b;
    public final TLRPC.TL_messageMediaVenue f33508c;

    public zk(jl jlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f33506a = i10;
        this.f33507b = jlVar;
        this.f33508c = tL_messageMediaVenue;
    }

    @Override
    public final void K(int i10, int i11, boolean z10) {
        switch (this.f33506a) {
            case 0:
                jl jlVar = this.f33507b;
                jlVar.f27831x0.b(this.f33508c, jlVar.f27833y0, z10, i10, 0L);
                jlVar.f29643b.dismiss(true);
                return;
            default:
                jl jlVar2 = this.f33507b;
                jlVar2.f27831x0.b(this.f33508c, jlVar2.f27833y0, z10, i10, 0L);
                jlVar2.f29643b.dismiss(true);
                return;
        }
    }
}
