package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nl implements f5 {
    public final int f29185a;
    public final xl f29186b;
    public final TLRPC.TL_messageMediaVenue f29187c;

    public nl(xl xlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29185a = i10;
        this.f29186b = xlVar;
        this.f29187c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29185a) {
            case 0:
                xl xlVar = this.f29186b;
                xlVar.f33023x0.b(this.f29187c, xlVar.f33025y0, z10, i10, 0L);
                xlVar.f30245b.dismiss(true);
                return;
            default:
                xl xlVar2 = this.f29186b;
                xlVar2.f33023x0.b(this.f29187c, xlVar2.f33025y0, z10, i10, 0L);
                xlVar2.f30245b.dismiss(true);
                return;
        }
    }
}
