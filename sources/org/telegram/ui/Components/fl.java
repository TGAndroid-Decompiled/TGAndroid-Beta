package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fl implements e5 {
    public final int f28225a;
    public final sl f28226b;
    public final TLRPC.TL_messageMediaVenue f28227c;

    public fl(sl slVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f28225a = i10;
        this.f28226b = slVar;
        this.f28227c = tL_messageMediaVenue;
    }

    @Override
    public final void G(int i10, int i11, boolean z10) {
        switch (this.f28225a) {
            case 0:
                sl slVar = this.f28226b;
                slVar.f32615u0.d(this.f28227c, slVar.f32616v0, z10, i10, 0L);
                slVar.f30215b.dismiss(true);
                return;
            default:
                sl slVar2 = this.f28226b;
                slVar2.f32615u0.d(this.f28227c, slVar2.f32616v0, z10, i10, 0L);
                slVar2.f30215b.dismiss(true);
                return;
        }
    }
}
