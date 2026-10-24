package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class dl implements b5 {
    public final int f25776a;
    public final pl f25777b;
    public final TLRPC.TL_messageMediaVenue f25778c;

    public dl(pl plVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f25776a = i10;
        this.f25777b = plVar;
        this.f25778c = tL_messageMediaVenue;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f25776a) {
            case 0:
                pl plVar = this.f25777b;
                plVar.f29610u0.b(this.f25778c, plVar.f29611v0, z10, i10, 0L);
                plVar.f27704b.dismiss(true);
                return;
            default:
                pl plVar2 = this.f25777b;
                plVar2.f29610u0.b(this.f25778c, plVar2.f29611v0, z10, i10, 0L);
                plVar2.f27704b.dismiss(true);
                return;
        }
    }
}
