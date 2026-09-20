package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements c5 {
    public final int f30060a;
    public final gl f30061b;
    public final TLRPC.TL_messageMediaVenue f30062c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30060a = i10;
        this.f30061b = glVar;
        this.f30062c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30060a) {
            case 0:
                gl glVar = this.f30061b;
                glVar.f24411x0.b(this.f30062c, glVar.f24413y0, z10, i10, 0L);
                glVar.f26655b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f30061b;
                glVar2.f24411x0.b(this.f30062c, glVar2.f24413y0, z10, i10, 0L);
                glVar2.f26655b.dismiss(true);
                return;
        }
    }
}
