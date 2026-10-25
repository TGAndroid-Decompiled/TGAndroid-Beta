package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fl implements e5 {
    public final int f28223a;
    public final sl f28224b;
    public final TLRPC.TL_messageMediaVenue f28225c;

    public fl(sl slVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f28223a = i10;
        this.f28224b = slVar;
        this.f28225c = tL_messageMediaVenue;
    }

    @Override
    public final void G(int i10, int i11, boolean z10) {
        switch (this.f28223a) {
            case 0:
                sl slVar = this.f28224b;
                slVar.f32613u0.d(this.f28225c, slVar.f32614v0, z10, i10, 0L);
                slVar.f30213b.dismiss(true);
                return;
            default:
                sl slVar2 = this.f28224b;
                slVar2.f32613u0.d(this.f28225c, slVar2.f32614v0, z10, i10, 0L);
                slVar2.f30213b.dismiss(true);
                return;
        }
    }
}
