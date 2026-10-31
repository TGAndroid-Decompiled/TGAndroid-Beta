package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pk implements q4 {
    public final int f29372a;
    public final bl f29373b;
    public final TLRPC.TL_messageMediaVenue f29374c;

    public pk(bl blVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29372a = i10;
        this.f29373b = blVar;
        this.f29374c = tL_messageMediaVenue;
    }

    @Override
    public final void K(int i10, int i11, boolean z10) {
        switch (this.f29372a) {
            case 0:
                bl blVar = this.f29373b;
                blVar.f24817u0.d(this.f29374c, blVar.f24818v0, z10, i10, 0L);
                blVar.f30947b.a(true);
                return;
            default:
                bl blVar2 = this.f29373b;
                blVar2.f24817u0.d(this.f29374c, blVar2.f24818v0, z10, i10, 0L);
                blVar2.f30947b.a(true);
                return;
        }
    }
}
