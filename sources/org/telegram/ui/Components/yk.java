package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yk implements d5 {
    public final int f30673a;
    public final il f30674b;
    public final TLRPC.TL_messageMediaVenue f30675c;

    public yk(il ilVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30673a = i10;
        this.f30674b = ilVar;
        this.f30675c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30673a) {
            case 0:
                il ilVar = this.f30674b;
                ilVar.f25195x0.b(this.f30675c, ilVar.f25197y0, z10, i10, 0L);
                ilVar.f27104b.dismiss(true);
                return;
            default:
                il ilVar2 = this.f30674b;
                ilVar2.f25195x0.b(this.f30675c, ilVar2.f25197y0, z10, i10, 0L);
                ilVar2.f27104b.dismiss(true);
                return;
        }
    }
}
