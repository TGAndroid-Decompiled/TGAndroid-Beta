package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ax extends g.o {
    public final rz f24831c;

    public ax(rz rzVar) {
        this.f24831c = rzVar;
    }

    @Override
    public final int i(int i10) {
        rz rzVar = this.f24831c;
        mz mzVar = rzVar.f30383z0;
        s4.g0 adapter = rzVar.D0.getAdapter();
        iz izVar = rzVar.f30380y0;
        if (adapter == izVar) {
            if (i10 == 0) {
                return izVar.d;
            }
            if (i10 == izVar.f27519s || (izVar.h.get(i10) != null && !(izVar.h.get(i10) instanceof TLRPC.Document))) {
                return izVar.d;
            }
            return 1;
        } else if (i10 != mzVar.f28728x && (mzVar.f28725r.get(i10) == null || (mzVar.f28725r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return izVar.d;
        }
    }
}
