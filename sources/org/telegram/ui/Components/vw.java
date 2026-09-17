package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vw extends g.p {
    public final kz f31993c;

    public vw(kz kzVar) {
        this.f31993c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f31993c;
        fz fzVar = kzVar.f28007z0;
        s4.h0 adapter = kzVar.D0.getAdapter();
        bz bzVar = kzVar.f28004y0;
        if (adapter == bzVar) {
            if (i10 == 0) {
                return bzVar.d;
            }
            if (i10 == bzVar.f24830s || (bzVar.h.get(i10) != null && !(bzVar.h.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        } else if (i10 != fzVar.f26210x && (fzVar.f26207r.get(i10) == null || (fzVar.f26207r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return bzVar.d;
        }
    }
}
