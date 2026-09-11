package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements d5 {
    public final int f32275a;
    public final gl f32276b;
    public final TLRPC.TL_messageMediaVenue f32277c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f32275a = i10;
        this.f32276b = glVar;
        this.f32277c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f32275a) {
            case 0:
                gl glVar = this.f32276b;
                glVar.f26455x0.b(this.f32277c, glVar.f26457y0, z10, i10, 0L);
                glVar.f28753b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f32276b;
                glVar2.f26455x0.b(this.f32277c, glVar2.f26457y0, z10, i10, 0L);
                glVar2.f28753b.dismiss(true);
                return;
        }
    }
}
