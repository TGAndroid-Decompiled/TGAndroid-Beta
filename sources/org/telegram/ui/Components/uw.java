package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class uw extends g.p {
    public final kz f28504c;

    public uw(kz kzVar) {
        this.f28504c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f28504c;
        fz fzVar = kzVar.f25786z0;
        s4.h0 adapter = kzVar.D0.getAdapter();
        bz bzVar = kzVar.f25783y0;
        if (adapter == bzVar) {
            if (i10 == 0) {
                return bzVar.d;
            }
            if (i10 == bzVar.f22828s || (bzVar.h.get(i10) != null && !(bzVar.h.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        } else if (i10 != fzVar.f24037x && (fzVar.f24034r.get(i10) == null || (fzVar.f24034r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return bzVar.d;
        }
    }
}
