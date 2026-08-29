package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rk implements b5 {
    public final int f32330a;
    public final bl f32331b;
    public final TLRPC.TL_messageMediaVenue f32332c;

    public rk(bl blVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f32330a = i10;
        this.f32331b = blVar;
        this.f32332c = tL_messageMediaVenue;
    }

    @Override
    public final void I(int i10, int i11, boolean z10) {
        switch (this.f32330a) {
            case 0:
                bl blVar = this.f32331b;
                blVar.f27173t0.d(this.f32332c, blVar.f27174u0, z10, i10, 0L);
                blVar.f28403b.dismiss(true);
                return;
            default:
                bl blVar2 = this.f32331b;
                blVar2.f27173t0.d(this.f32332c, blVar2.f27174u0, z10, i10, 0L);
                blVar2.f28403b.dismiss(true);
                return;
        }
    }
}
