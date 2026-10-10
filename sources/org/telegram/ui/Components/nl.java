package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nl implements f5 {
    public final int f29143a;
    public final xl f29144b;
    public final TLRPC.TL_messageMediaVenue f29145c;

    public nl(xl xlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29143a = i10;
        this.f29144b = xlVar;
        this.f29145c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29143a) {
            case 0:
                xl xlVar = this.f29144b;
                xlVar.f32985x0.b(this.f29145c, xlVar.f32987y0, z10, i10, 0L);
                xlVar.f30211b.dismiss(true);
                return;
            default:
                xl xlVar2 = this.f29144b;
                xlVar2.f32985x0.b(this.f29145c, xlVar2.f32987y0, z10, i10, 0L);
                xlVar2.f30211b.dismiss(true);
                return;
        }
    }
}
