package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pl implements f5 {
    public final int f29523a;
    public final zl f29524b;
    public final TLRPC.TL_messageMediaVenue f29525c;

    public pl(zl zlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29523a = i10;
        this.f29524b = zlVar;
        this.f29525c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29523a) {
            case 0:
                zl zlVar = this.f29524b;
                zlVar.f33427x0.b(this.f29525c, zlVar.f33429y0, z10, i10, 0L);
                zlVar.f30570b.dismiss(true);
                return;
            default:
                zl zlVar2 = this.f29524b;
                zlVar2.f33427x0.b(this.f29525c, zlVar2.f33429y0, z10, i10, 0L);
                zlVar2.f30570b.dismiss(true);
                return;
        }
    }
}
