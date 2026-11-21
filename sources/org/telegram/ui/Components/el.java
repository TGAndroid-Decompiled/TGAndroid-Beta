package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class el implements a5 {
    public final int f34898a;
    public final ml f34899b;
    public final TLRPC.TL_messageMediaVenue f34900c;

    public el(ml mlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f34898a = i7;
        this.f34899b = mlVar;
        this.f34900c = tL_messageMediaVenue;
    }

    @Override
    public final void O(int i7, int i10, boolean z10) {
        switch (this.f34898a) {
            case 0:
                ml mlVar = this.f34899b;
                mlVar.f37562o0.b(this.f34900c, mlVar.f37563p0, z10, i7, 0L);
                mlVar.f37521b.a(true);
                return;
            default:
                ml mlVar2 = this.f34899b;
                mlVar2.f37562o0.b(this.f34900c, mlVar2.f37563p0, z10, i7, 0L);
                mlVar2.f37521b.a(true);
                return;
        }
    }
}
