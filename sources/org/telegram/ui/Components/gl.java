package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class gl implements d5 {
    public final int f26625a;
    public final rl f26626b;
    public final TLRPC.TL_messageMediaVenue f26627c;

    public gl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f26625a = i10;
        this.f26626b = rlVar;
        this.f26627c = tL_messageMediaVenue;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f26625a) {
            case 0:
                rl rlVar = this.f26626b;
                rlVar.f30213v0.b(this.f26627c, rlVar.f30215w0, z10, i10, 0L);
                rlVar.f28366b.dismiss(true);
                return;
            default:
                rl rlVar2 = this.f26626b;
                rlVar2.f30213v0.b(this.f26627c, rlVar2.f30215w0, z10, i10, 0L);
                rlVar2.f28366b.dismiss(true);
                return;
        }
    }
}
