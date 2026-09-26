package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yk implements d5 {
    public final int f30652a;
    public final il f30653b;
    public final TLRPC.TL_messageMediaVenue f30654c;

    public yk(il ilVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30652a = i10;
        this.f30653b = ilVar;
        this.f30654c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30652a) {
            case 0:
                il ilVar = this.f30653b;
                ilVar.f25147x0.b(this.f30654c, ilVar.f25149y0, z10, i10, 0L);
                ilVar.f27043b.dismiss(true);
                return;
            default:
                il ilVar2 = this.f30653b;
                ilVar2.f25147x0.b(this.f30654c, ilVar2.f25149y0, z10, i10, 0L);
                ilVar2.f27043b.dismiss(true);
                return;
        }
    }
}
