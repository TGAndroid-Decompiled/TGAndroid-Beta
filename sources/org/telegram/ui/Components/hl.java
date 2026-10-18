package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hl implements e5 {
    public final int f26898a;
    public final rl f26899b;
    public final TLRPC.TL_messageMediaVenue f26900c;

    public hl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26898a = i10;
        this.f26899b = rlVar;
        this.f26900c = tL_messageMediaVenue;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f26898a) {
            case 0:
                rl rlVar = this.f26899b;
                rlVar.f29990x0.b(this.f26900c, rlVar.f29992y0, z10, i10, 0L);
                rlVar.f28238b.dismiss(true);
                return;
            default:
                rl rlVar2 = this.f26899b;
                rlVar2.f29990x0.b(this.f26900c, rlVar2.f29992y0, z10, i10, 0L);
                rlVar2.f28238b.dismiss(true);
                return;
        }
    }
}
