package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nl implements f5 {
    public final int f29206a;
    public final xl f29207b;
    public final TLRPC.TL_messageMediaVenue f29208c;

    public nl(xl xlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29206a = i10;
        this.f29207b = xlVar;
        this.f29208c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29206a) {
            case 0:
                xl xlVar = this.f29207b;
                xlVar.f32931x0.b(this.f29208c, xlVar.f32933y0, z10, i10, 0L);
                xlVar.f30173b.dismiss(true);
                return;
            default:
                xl xlVar2 = this.f29207b;
                xlVar2.f32931x0.b(this.f29208c, xlVar2.f32933y0, z10, i10, 0L);
                xlVar2.f30173b.dismiss(true);
                return;
        }
    }
}
