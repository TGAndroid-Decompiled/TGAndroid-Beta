package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yk implements d5 {
    public final int f30669a;
    public final il f30670b;
    public final TLRPC.TL_messageMediaVenue f30671c;

    public yk(il ilVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30669a = i10;
        this.f30670b = ilVar;
        this.f30671c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30669a) {
            case 0:
                il ilVar = this.f30670b;
                ilVar.f25174x0.b(this.f30671c, ilVar.f25176y0, z10, i10, 0L);
                ilVar.f27077b.dismiss(true);
                return;
            default:
                il ilVar2 = this.f30670b;
                ilVar2.f25174x0.b(this.f30671c, ilVar2.f25176y0, z10, i10, 0L);
                ilVar2.f27077b.dismiss(true);
                return;
        }
    }
}
