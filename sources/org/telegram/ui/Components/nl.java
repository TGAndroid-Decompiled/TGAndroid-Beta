package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nl implements f5 {
    public final int f29077a;
    public final xl f29078b;
    public final TLRPC.TL_messageMediaVenue f29079c;

    public nl(xl xlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29077a = i10;
        this.f29078b = xlVar;
        this.f29079c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29077a) {
            case 0:
                xl xlVar = this.f29078b;
                xlVar.f32975x0.b(this.f29079c, xlVar.f32977y0, z10, i10, 0L);
                xlVar.f30161b.dismiss(true);
                return;
            default:
                xl xlVar2 = this.f29078b;
                xlVar2.f32975x0.b(this.f29079c, xlVar2.f32977y0, z10, i10, 0L);
                xlVar2.f30161b.dismiss(true);
                return;
        }
    }
}
