package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hl implements e5 {
    public final int f26917a;
    public final rl f26918b;
    public final TLRPC.TL_messageMediaVenue f26919c;

    public hl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26917a = i10;
        this.f26918b = rlVar;
        this.f26919c = tL_messageMediaVenue;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f26917a) {
            case 0:
                rl rlVar = this.f26918b;
                rlVar.f29978x0.b(this.f26919c, rlVar.f29980y0, z10, i10, 0L);
                rlVar.f28177b.dismiss(true);
                return;
            default:
                rl rlVar2 = this.f26918b;
                rlVar2.f29978x0.b(this.f26919c, rlVar2.f29980y0, z10, i10, 0L);
                rlVar2.f28177b.dismiss(true);
                return;
        }
    }
}
