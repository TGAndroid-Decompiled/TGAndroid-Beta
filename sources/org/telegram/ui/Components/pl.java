package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pl implements f5 {
    public final int f29544a;
    public final zl f29545b;
    public final TLRPC.TL_messageMediaVenue f29546c;

    public pl(zl zlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29544a = i10;
        this.f29545b = zlVar;
        this.f29546c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29544a) {
            case 0:
                zl zlVar = this.f29545b;
                zlVar.f33425x0.b(this.f29546c, zlVar.f33427y0, z10, i10, 0L);
                zlVar.f30574b.dismiss(true);
                return;
            default:
                zl zlVar2 = this.f29545b;
                zlVar2.f33425x0.b(this.f29546c, zlVar2.f33427y0, z10, i10, 0L);
                zlVar2.f30574b.dismiss(true);
                return;
        }
    }
}
