package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements d5 {
    public final int f30054a;
    public final gl f30055b;
    public final TLRPC.TL_messageMediaVenue f30056c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f30054a = i10;
        this.f30055b = glVar;
        this.f30056c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30054a) {
            case 0:
                gl glVar = this.f30055b;
                glVar.f24452x0.b(this.f30056c, glVar.f24454y0, z10, i10, 0L);
                glVar.f26688b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f30055b;
                glVar2.f24452x0.b(this.f30056c, glVar2.f24454y0, z10, i10, 0L);
                glVar2.f26688b.dismiss(true);
                return;
        }
    }
}
