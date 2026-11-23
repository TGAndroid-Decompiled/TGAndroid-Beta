package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class el implements a5 {
    public final int f34896a;
    public final ml f34897b;
    public final TLRPC.TL_messageMediaVenue f34898c;

    public el(ml mlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f34896a = i7;
        this.f34897b = mlVar;
        this.f34898c = tL_messageMediaVenue;
    }

    @Override
    public final void O(int i7, int i10, boolean z10) {
        switch (this.f34896a) {
            case 0:
                ml mlVar = this.f34897b;
                mlVar.f37560o0.b(this.f34898c, mlVar.f37561p0, z10, i7, 0L);
                mlVar.f37519b.a(true);
                return;
            default:
                ml mlVar2 = this.f34897b;
                mlVar2.f37560o0.b(this.f34898c, mlVar2.f37561p0, z10, i7, 0L);
                mlVar2.f37519b.a(true);
                return;
        }
    }
}
