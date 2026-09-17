package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements d5 {
    public final int f32303a;
    public final gl f32304b;
    public final TLRPC.TL_messageMediaVenue f32305c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f32303a = i10;
        this.f32304b = glVar;
        this.f32305c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f32303a) {
            case 0:
                gl glVar = this.f32304b;
                glVar.f26483x0.b(this.f32305c, glVar.f26485y0, z10, i10, 0L);
                glVar.f28781b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f32304b;
                glVar2.f26483x0.b(this.f32305c, glVar2.f26485y0, z10, i10, 0L);
                glVar2.f28781b.dismiss(true);
                return;
        }
    }
}
