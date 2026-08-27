package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class jk implements x4 {

    public final int f29714a;

    public final tk f29715b;

    public final TLRPC.TL_messageMediaVenue f29716c;

    public jk(tk tkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29714a = i10;
        this.f29715b = tkVar;
        this.f29716c = tL_messageMediaVenue;
    }

    @Override
    public final void I(int i10, int i11, boolean z10) {
        switch (this.f29714a) {
            case 0:
                tk tkVar = this.f29715b;
                tkVar.f32819t0.d(this.f29716c, tkVar.f32820u0, z10, i10, 0L);
                tkVar.f34900b.dismiss(true);
                break;
            default:
                tk tkVar2 = this.f29715b;
                tkVar2.f32819t0.d(this.f29716c, tkVar2.f32820u0, z10, i10, 0L);
                tkVar2.f34900b.dismiss(true);
                break;
        }
    }
}
