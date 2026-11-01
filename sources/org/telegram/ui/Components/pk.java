package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pk implements q4 {
    public final int f29442a;
    public final bl f29443b;
    public final TLRPC.TL_messageMediaVenue f29444c;

    public pk(bl blVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29442a = i10;
        this.f29443b = blVar;
        this.f29444c = tL_messageMediaVenue;
    }

    @Override
    public final void K(int i10, int i11, boolean z10) {
        switch (this.f29442a) {
            case 0:
                bl blVar = this.f29443b;
                blVar.f24872u0.d(this.f29444c, blVar.f24873v0, z10, i10, 0L);
                blVar.f30964b.a(true);
                return;
            default:
                bl blVar2 = this.f29443b;
                blVar2.f24872u0.d(this.f29444c, blVar2.f24873v0, z10, i10, 0L);
                blVar2.f30964b.a(true);
                return;
        }
    }
}
