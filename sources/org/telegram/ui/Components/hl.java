package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hl implements e5 {
    public final int f26891a;
    public final rl f26892b;
    public final TLRPC.TL_messageMediaVenue f26893c;

    public hl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26891a = i10;
        this.f26892b = rlVar;
        this.f26893c = tL_messageMediaVenue;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f26891a) {
            case 0:
                rl rlVar = this.f26892b;
                rlVar.f29994x0.b(this.f26893c, rlVar.f29996y0, z10, i10, 0L);
                rlVar.f28223b.dismiss(true);
                return;
            default:
                rl rlVar2 = this.f26892b;
                rlVar2.f29994x0.b(this.f26893c, rlVar2.f29996y0, z10, i10, 0L);
                rlVar2.f28223b.dismiss(true);
                return;
        }
    }
}
