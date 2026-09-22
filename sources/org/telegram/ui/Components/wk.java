package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements c5 {
    public final int f30032a;
    public final gl f30033b;
    public final TLRPC.TL_messageMediaVenue f30034c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30032a = i10;
        this.f30033b = glVar;
        this.f30034c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30032a) {
            case 0:
                gl glVar = this.f30033b;
                glVar.f24590x0.b(this.f30034c, glVar.f24592y0, z10, i10, 0L);
                glVar.f26786b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f30033b;
                glVar2.f24590x0.b(this.f30034c, glVar2.f24592y0, z10, i10, 0L);
                glVar2.f26786b.dismiss(true);
                return;
        }
    }
}
