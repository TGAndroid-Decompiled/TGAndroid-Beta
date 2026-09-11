package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vw extends g.p {
    public final kz f31992c;

    public vw(kz kzVar) {
        this.f31992c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f31992c;
        fz fzVar = kzVar.f28006z0;
        s4.h0 adapter = kzVar.D0.getAdapter();
        bz bzVar = kzVar.f28003y0;
        if (adapter == bzVar) {
            if (i10 == 0) {
                return bzVar.d;
            }
            if (i10 == bzVar.f24829s || (bzVar.h.get(i10) != null && !(bzVar.h.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        } else if (i10 != fzVar.f26209x && (fzVar.f26206r.get(i10) == null || (fzVar.f26206r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return bzVar.d;
        }
    }
}
