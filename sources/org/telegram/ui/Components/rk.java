package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rk implements y4 {
    public final int f30792a;
    public final cl f30793b;
    public final TLRPC.TL_messageMediaVenue f30794c;

    public rk(cl clVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30792a = i10;
        this.f30793b = clVar;
        this.f30794c = tL_messageMediaVenue;
    }

    @Override
    public final void I(int i10, int i11, boolean z4) {
        switch (this.f30792a) {
            case 0:
                cl clVar = this.f30793b;
                clVar.f25995u0.d(this.f30794c, clVar.f25996v0, z4, i10, 0L);
                clVar.f26590b.dismiss(true);
                return;
            default:
                cl clVar2 = this.f30793b;
                clVar2.f25995u0.d(this.f30794c, clVar2.f25996v0, z4, i10, 0L);
                clVar2.f26590b.dismiss(true);
                return;
        }
    }
}
