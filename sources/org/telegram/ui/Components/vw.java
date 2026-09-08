package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vw extends g.p {
    public final kz f32019c;

    public vw(kz kzVar) {
        this.f32019c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f32019c;
        fz fzVar = kzVar.f28033z0;
        s4.h0 adapter = kzVar.D0.getAdapter();
        bz bzVar = kzVar.f28030y0;
        if (adapter == bzVar) {
            if (i10 == 0) {
                return bzVar.d;
            }
            if (i10 == bzVar.f24856s || (bzVar.h.get(i10) != null && !(bzVar.h.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        } else if (i10 != fzVar.f26236x && (fzVar.f26233r.get(i10) == null || (fzVar.f26233r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return bzVar.d;
        }
    }
}
