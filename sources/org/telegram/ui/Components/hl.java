package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hl implements e5 {
    public final int f26905a;
    public final rl f26906b;
    public final TLRPC.TL_messageMediaVenue f26907c;

    public hl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26905a = i10;
        this.f26906b = rlVar;
        this.f26907c = tL_messageMediaVenue;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f26905a) {
            case 0:
                rl rlVar = this.f26906b;
                rlVar.f29996x0.b(this.f26907c, rlVar.f29998y0, z10, i10, 0L);
                rlVar.f28245b.dismiss(true);
                return;
            default:
                rl rlVar2 = this.f26906b;
                rlVar2.f29996x0.b(this.f26907c, rlVar2.f29998y0, z10, i10, 0L);
                rlVar2.f28245b.dismiss(true);
                return;
        }
    }
}
