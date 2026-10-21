package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hl implements e5 {
    public final int f26913a;
    public final rl f26914b;
    public final TLRPC.TL_messageMediaVenue f26915c;

    public hl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26913a = i10;
        this.f26914b = rlVar;
        this.f26915c = tL_messageMediaVenue;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f26913a) {
            case 0:
                rl rlVar = this.f26914b;
                rlVar.f29974x0.b(this.f26915c, rlVar.f29976y0, z10, i10, 0L);
                rlVar.f28173b.dismiss(true);
                return;
            default:
                rl rlVar2 = this.f26914b;
                rlVar2.f29974x0.b(this.f26915c, rlVar2.f29976y0, z10, i10, 0L);
                rlVar2.f28173b.dismiss(true);
                return;
        }
    }
}
