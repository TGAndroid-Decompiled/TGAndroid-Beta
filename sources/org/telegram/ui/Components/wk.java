package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements d5 {
    public final int f32302a;
    public final gl f32303b;
    public final TLRPC.TL_messageMediaVenue f32304c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f32302a = i10;
        this.f32303b = glVar;
        this.f32304c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f32302a) {
            case 0:
                gl glVar = this.f32303b;
                glVar.f26482x0.b(this.f32304c, glVar.f26484y0, z10, i10, 0L);
                glVar.f28780b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f32303b;
                glVar2.f26482x0.b(this.f32304c, glVar2.f26484y0, z10, i10, 0L);
                glVar2.f28780b.dismiss(true);
                return;
        }
    }
}
