package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xw extends g.p {
    public final mz f30496c;

    public xw(mz mzVar) {
        this.f30496c = mzVar;
    }

    @Override
    public final int i(int i10) {
        mz mzVar = this.f30496c;
        hz hzVar = mzVar.f26606z0;
        s4.h0 adapter = mzVar.D0.getAdapter();
        dz dzVar = mzVar.f26603y0;
        if (adapter == dzVar) {
            if (i10 == 0) {
                return dzVar.d;
            }
            if (i10 == dzVar.f23762s || (dzVar.h.get(i10) != null && !(dzVar.h.get(i10) instanceof TLRPC.Document))) {
                return dzVar.d;
            }
            return 1;
        } else if (i10 != hzVar.f24951x && (hzVar.f24948r.get(i10) == null || (hzVar.f24948r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return dzVar.d;
        }
    }
}
