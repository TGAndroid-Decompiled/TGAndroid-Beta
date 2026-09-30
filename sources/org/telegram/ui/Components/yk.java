package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yk implements d5 {
    public final int f30664a;
    public final il f30665b;
    public final TLRPC.TL_messageMediaVenue f30666c;

    public yk(il ilVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30664a = i10;
        this.f30665b = ilVar;
        this.f30666c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30664a) {
            case 0:
                il ilVar = this.f30665b;
                ilVar.f25152x0.b(this.f30666c, ilVar.f25154y0, z10, i10, 0L);
                ilVar.f27075b.dismiss(true);
                return;
            default:
                il ilVar2 = this.f30665b;
                ilVar2.f25152x0.b(this.f30666c, ilVar2.f25154y0, z10, i10, 0L);
                ilVar2.f27075b.dismiss(true);
                return;
        }
    }
}
