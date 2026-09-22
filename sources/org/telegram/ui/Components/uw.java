package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class uw extends g.p {
    public final kz f28516c;

    public uw(kz kzVar) {
        this.f28516c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f28516c;
        fz fzVar = kzVar.f25773z0;
        s4.h0 adapter = kzVar.D0.getAdapter();
        bz bzVar = kzVar.f25770y0;
        if (adapter == bzVar) {
            if (i10 == 0) {
                return bzVar.d;
            }
            if (i10 == bzVar.f22889s || (bzVar.h.get(i10) != null && !(bzVar.h.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        } else if (i10 != fzVar.f24125x && (fzVar.f24122r.get(i10) == null || (fzVar.f24122r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return bzVar.d;
        }
    }
}
