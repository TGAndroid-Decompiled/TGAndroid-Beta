package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xw extends g.p {
    public final mz f30482c;

    public xw(mz mzVar) {
        this.f30482c = mzVar;
    }

    @Override
    public final int i(int i10) {
        mz mzVar = this.f30482c;
        hz hzVar = mzVar.f26621z0;
        s4.h0 adapter = mzVar.D0.getAdapter();
        dz dzVar = mzVar.f26618y0;
        if (adapter == dzVar) {
            if (i10 == 0) {
                return dzVar.d;
            }
            if (i10 == dzVar.f23775s || (dzVar.h.get(i10) != null && !(dzVar.h.get(i10) instanceof TLRPC.Document))) {
                return dzVar.d;
            }
            return 1;
        } else if (i10 != hzVar.f24914x && (hzVar.f24911r.get(i10) == null || (hzVar.f24911r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return dzVar.d;
        }
    }
}
