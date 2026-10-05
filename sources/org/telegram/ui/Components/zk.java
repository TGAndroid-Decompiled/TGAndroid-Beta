package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zk implements d5 {
    public final int f33520a;
    public final jl f33521b;
    public final TLRPC.TL_messageMediaVenue f33522c;

    public zk(jl jlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f33520a = i10;
        this.f33521b = jlVar;
        this.f33522c = tL_messageMediaVenue;
    }

    @Override
    public final void K(int i10, int i11, boolean z10) {
        switch (this.f33520a) {
            case 0:
                jl jlVar = this.f33521b;
                jlVar.f27903x0.b(this.f33522c, jlVar.f27905y0, z10, i10, 0L);
                jlVar.f29741b.dismiss(true);
                return;
            default:
                jl jlVar2 = this.f33521b;
                jlVar2.f27903x0.b(this.f33522c, jlVar2.f27905y0, z10, i10, 0L);
                jlVar2.f29741b.dismiss(true);
                return;
        }
    }
}
