package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xw extends g.p {
    public final mz f30495c;

    public xw(mz mzVar) {
        this.f30495c = mzVar;
    }

    @Override
    public final int i(int i10) {
        mz mzVar = this.f30495c;
        hz hzVar = mzVar.f26605z0;
        s4.h0 adapter = mzVar.D0.getAdapter();
        dz dzVar = mzVar.f26602y0;
        if (adapter == dzVar) {
            if (i10 == 0) {
                return dzVar.d;
            }
            if (i10 == dzVar.f23761s || (dzVar.h.get(i10) != null && !(dzVar.h.get(i10) instanceof TLRPC.Document))) {
                return dzVar.d;
            }
            return 1;
        } else if (i10 != hzVar.f24950x && (hzVar.f24947r.get(i10) == null || (hzVar.f24947r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return dzVar.d;
        }
    }
}
