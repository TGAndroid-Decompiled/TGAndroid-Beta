package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements d5 {
    public final int f32276a;
    public final gl f32277b;
    public final TLRPC.TL_messageMediaVenue f32278c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f32276a = i10;
        this.f32277b = glVar;
        this.f32278c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f32276a) {
            case 0:
                gl glVar = this.f32277b;
                glVar.f26456x0.b(this.f32278c, glVar.f26458y0, z10, i10, 0L);
                glVar.f28754b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f32277b;
                glVar2.f26456x0.b(this.f32278c, glVar2.f26458y0, z10, i10, 0L);
                glVar2.f28754b.dismiss(true);
                return;
        }
    }
}
