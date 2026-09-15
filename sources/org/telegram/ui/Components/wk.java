package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements b5 {
    public final int f29733a;
    public final gl f29734b;
    public final TLRPC.TL_messageMediaVenue f29735c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29733a = i10;
        this.f29734b = glVar;
        this.f29735c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29733a) {
            case 0:
                gl glVar = this.f29734b;
                glVar.f24415x0.b(this.f29735c, glVar.f24417y0, z10, i10, 0L);
                glVar.f26462b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f29734b;
                glVar2.f24415x0.b(this.f29735c, glVar2.f24417y0, z10, i10, 0L);
                glVar2.f26462b.dismiss(true);
                return;
        }
    }
}
