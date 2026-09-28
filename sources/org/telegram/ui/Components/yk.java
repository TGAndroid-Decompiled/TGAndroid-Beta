package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yk implements d5 {
    public final int f30668a;
    public final il f30669b;
    public final TLRPC.TL_messageMediaVenue f30670c;

    public yk(il ilVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30668a = i10;
        this.f30669b = ilVar;
        this.f30670c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30668a) {
            case 0:
                il ilVar = this.f30669b;
                ilVar.f25173x0.b(this.f30670c, ilVar.f25175y0, z10, i10, 0L);
                ilVar.f27076b.dismiss(true);
                return;
            default:
                il ilVar2 = this.f30669b;
                ilVar2.f25173x0.b(this.f30670c, ilVar2.f25175y0, z10, i10, 0L);
                ilVar2.f27076b.dismiss(true);
                return;
        }
    }
}
