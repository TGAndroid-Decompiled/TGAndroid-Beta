package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zk implements d5 {
    public final int f33505a;
    public final jl f33506b;
    public final TLRPC.TL_messageMediaVenue f33507c;

    public zk(jl jlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f33505a = i10;
        this.f33506b = jlVar;
        this.f33507c = tL_messageMediaVenue;
    }

    @Override
    public final void K(int i10, int i11, boolean z10) {
        switch (this.f33505a) {
            case 0:
                jl jlVar = this.f33506b;
                jlVar.f27830x0.b(this.f33507c, jlVar.f27832y0, z10, i10, 0L);
                jlVar.f29642b.dismiss(true);
                return;
            default:
                jl jlVar2 = this.f33506b;
                jlVar2.f27830x0.b(this.f33507c, jlVar2.f27832y0, z10, i10, 0L);
                jlVar2.f29642b.dismiss(true);
                return;
        }
    }
}
