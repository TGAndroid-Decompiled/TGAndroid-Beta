package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fl implements e5 {
    public final int f28205a;
    public final sl f28206b;
    public final TLRPC.TL_messageMediaVenue f28207c;

    public fl(sl slVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f28205a = i10;
        this.f28206b = slVar;
        this.f28207c = tL_messageMediaVenue;
    }

    @Override
    public final void G(int i10, int i11, boolean z10) {
        switch (this.f28205a) {
            case 0:
                sl slVar = this.f28206b;
                slVar.f32636u0.d(this.f28207c, slVar.f32637v0, z10, i10, 0L);
                slVar.f30254b.dismiss(true);
                return;
            default:
                sl slVar2 = this.f28206b;
                slVar2.f32636u0.d(this.f28207c, slVar2.f32637v0, z10, i10, 0L);
                slVar2.f30254b.dismiss(true);
                return;
        }
    }
}
