package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class kl implements f5 {
    public final int f26724a;
    public final ul f26725b;
    public final TLRPC.TL_messageMediaVenue f26726c;

    public kl(ul ulVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26724a = i10;
        this.f26725b = ulVar;
        this.f26726c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f26724a) {
            case 0:
                ul ulVar = this.f26725b;
                ulVar.f29733x0.b(this.f26726c, ulVar.f29735y0, z10, i10, 0L);
                ulVar.f27671b.dismiss(true);
                return;
            default:
                ul ulVar2 = this.f26725b;
                ulVar2.f29733x0.b(this.f26726c, ulVar2.f29735y0, z10, i10, 0L);
                ulVar2.f27671b.dismiss(true);
                return;
        }
    }
}
