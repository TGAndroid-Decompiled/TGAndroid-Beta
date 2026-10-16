package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class jl implements f5 {
    public final int f26072a;
    public final tl f26073b;
    public final TLRPC.TL_messageMediaVenue f26074c;

    public jl(tl tlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26072a = i10;
        this.f26073b = tlVar;
        this.f26074c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f26072a) {
            case 0:
                tl tlVar = this.f26073b;
                tlVar.f29119x0.b(this.f26074c, tlVar.f29121y0, z10, i10, 0L);
                tlVar.f27360b.dismiss(true);
                return;
            default:
                tl tlVar2 = this.f26073b;
                tlVar2.f29119x0.b(this.f26074c, tlVar2.f29121y0, z10, i10, 0L);
                tlVar2.f27360b.dismiss(true);
                return;
        }
    }
}
