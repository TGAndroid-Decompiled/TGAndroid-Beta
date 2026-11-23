package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class el implements a5 {
    public final int f34882a;
    public final ml f34883b;
    public final TLRPC.TL_messageMediaVenue f34884c;

    public el(ml mlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.f34882a = i7;
        this.f34883b = mlVar;
        this.f34884c = tL_messageMediaVenue;
    }

    @Override
    public final void O(int i7, int i10, boolean z10) {
        switch (this.f34882a) {
            case 0:
                ml mlVar = this.f34883b;
                mlVar.f37518o0.b(this.f34884c, mlVar.f37519p0, z10, i7, 0L);
                mlVar.f37477b.a(true);
                return;
            default:
                ml mlVar2 = this.f34883b;
                mlVar2.f37518o0.b(this.f34884c, mlVar2.f37519p0, z10, i7, 0L);
                mlVar2.f37477b.a(true);
                return;
        }
    }
}
