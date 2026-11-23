package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cl implements z4 {
    public final int f34079a;
    public final kl f34080b;
    public final TLRPC.TL_messageMediaVenue f34081c;

    public cl(kl klVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f34079a = i7;
        this.f34080b = klVar;
        this.f34081c = tL_messageMediaVenue;
    }

    @Override
    public final void I(int i7, int i10, boolean z10) {
        switch (this.f34079a) {
            case 0:
                kl klVar = this.f34080b;
                klVar.f36786o0.d(this.f34081c, klVar.f36787p0, z10, i7, 0L);
                klVar.f37135b.a(true);
                return;
            default:
                kl klVar2 = this.f34080b;
                klVar2.f36786o0.d(this.f34081c, klVar2.f36787p0, z10, i7, 0L);
                klVar2.f37135b.a(true);
                return;
        }
    }
}
