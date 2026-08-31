package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rk implements y4 {
    public final int f30748a;
    public final cl f30749b;
    public final TLRPC.TL_messageMediaVenue f30750c;

    public rk(cl clVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30748a = i10;
        this.f30749b = clVar;
        this.f30750c = tL_messageMediaVenue;
    }

    @Override
    public final void I(int i10, int i11, boolean z4) {
        switch (this.f30748a) {
            case 0:
                cl clVar = this.f30749b;
                clVar.f26018u0.d(this.f30750c, clVar.f26019v0, z4, i10, 0L);
                clVar.f26546b.dismiss(true);
                return;
            default:
                cl clVar2 = this.f30749b;
                clVar2.f26018u0.d(this.f30750c, clVar2.f26019v0, z4, i10, 0L);
                clVar2.f26546b.dismiss(true);
                return;
        }
    }
}
