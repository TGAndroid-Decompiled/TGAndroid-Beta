package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class bl implements c5 {
    public final int f21851a;
    public final ll f21852b;
    public final TLRPC.TL_messageMediaVenue f21853c;

    public bl(ll llVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f21851a = i10;
        this.f21852b = llVar;
        this.f21853c = tL_messageMediaVenue;
    }

    @Override
    public final void I(int i10, int i11, boolean z10) {
        switch (this.f21851a) {
            case 0:
                ll llVar = this.f21852b;
                llVar.f25051x0.b(this.f21853c, llVar.f25053y0, z10, i10, 0L);
                llVar.f26422b.dismiss(true);
                return;
            default:
                ll llVar2 = this.f21852b;
                llVar2.f25051x0.b(this.f21853c, llVar2.f25053y0, z10, i10, 0L);
                llVar2.f26422b.dismiss(true);
                return;
        }
    }
}
