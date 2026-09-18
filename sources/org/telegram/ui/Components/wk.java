package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements b5 {
    public final int f29686a;
    public final gl f29687b;
    public final TLRPC.TL_messageMediaVenue f29688c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29686a = i10;
        this.f29687b = glVar;
        this.f29688c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29686a) {
            case 0:
                gl glVar = this.f29687b;
                glVar.f24340x0.b(this.f29688c, glVar.f24342y0, z10, i10, 0L);
                glVar.f26463b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f29687b;
                glVar2.f24340x0.b(this.f29688c, glVar2.f24342y0, z10, i10, 0L);
                glVar2.f26463b.dismiss(true);
                return;
        }
    }
}
