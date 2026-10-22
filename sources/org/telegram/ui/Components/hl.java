package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hl implements e5 {
    public final int f26916a;
    public final rl f26917b;
    public final TLRPC.TL_messageMediaVenue f26918c;

    public hl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26916a = i10;
        this.f26917b = rlVar;
        this.f26918c = tL_messageMediaVenue;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f26916a) {
            case 0:
                rl rlVar = this.f26917b;
                rlVar.f29977x0.b(this.f26918c, rlVar.f29979y0, z10, i10, 0L);
                rlVar.f28176b.dismiss(true);
                return;
            default:
                rl rlVar2 = this.f26917b;
                rlVar2.f29977x0.b(this.f26918c, rlVar2.f29979y0, z10, i10, 0L);
                rlVar2.f28176b.dismiss(true);
                return;
        }
    }
}
