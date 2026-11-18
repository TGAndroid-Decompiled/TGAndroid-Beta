package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cl implements z4 {
    public final int f34097a;
    public final kl f34098b;
    public final TLRPC.TL_messageMediaVenue f34099c;

    public cl(kl klVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f34097a = i7;
        this.f34098b = klVar;
        this.f34099c = tL_messageMediaVenue;
    }

    @Override
    public final void O(int i7, int i10, boolean z10) {
        switch (this.f34097a) {
            case 0:
                kl klVar = this.f34098b;
                klVar.f36807o0.b(this.f34099c, klVar.f36808p0, z10, i7, 0L);
                klVar.f36766b.a(true);
                return;
            default:
                kl klVar2 = this.f34098b;
                klVar2.f36807o0.b(this.f34099c, klVar2.f36808p0, z10, i7, 0L);
                klVar2.f36766b.a(true);
                return;
        }
    }
}
