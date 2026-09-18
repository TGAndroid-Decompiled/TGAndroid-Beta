package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vw extends g.p {
    public final kz f29779c;

    public vw(kz kzVar) {
        this.f29779c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f29779c;
        fz fzVar = kzVar.f25965z0;
        s4.h0 adapter = kzVar.D0.getAdapter();
        bz bzVar = kzVar.f25962y0;
        if (adapter == bzVar) {
            if (i10 == 0) {
                return bzVar.d;
            }
            if (i10 == bzVar.f23125s || (bzVar.h.get(i10) != null && !(bzVar.h.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        } else if (i10 != fzVar.f24258x && (fzVar.f24255r.get(i10) == null || (fzVar.f24255r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return bzVar.d;
        }
    }
}
