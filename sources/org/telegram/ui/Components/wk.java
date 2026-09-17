package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements b5 {
    public final int f29683a;
    public final gl f29684b;
    public final TLRPC.TL_messageMediaVenue f29685c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29683a = i10;
        this.f29684b = glVar;
        this.f29685c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29683a) {
            case 0:
                gl glVar = this.f29684b;
                glVar.f24337x0.b(this.f29685c, glVar.f24339y0, z10, i10, 0L);
                glVar.f26460b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f29684b;
                glVar2.f24337x0.b(this.f29685c, glVar2.f24339y0, z10, i10, 0L);
                glVar2.f26460b.dismiss(true);
                return;
        }
    }
}
