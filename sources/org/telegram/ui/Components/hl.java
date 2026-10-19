package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hl implements e5 {
    public final int f26893a;
    public final rl f26894b;
    public final TLRPC.TL_messageMediaVenue f26895c;

    public hl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26893a = i10;
        this.f26894b = rlVar;
        this.f26895c = tL_messageMediaVenue;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f26893a) {
            case 0:
                rl rlVar = this.f26894b;
                rlVar.f29997x0.b(this.f26895c, rlVar.f29999y0, z10, i10, 0L);
                rlVar.f28225b.dismiss(true);
                return;
            default:
                rl rlVar2 = this.f26894b;
                rlVar2.f29997x0.b(this.f26895c, rlVar2.f29999y0, z10, i10, 0L);
                rlVar2.f28225b.dismiss(true);
                return;
        }
    }
}
