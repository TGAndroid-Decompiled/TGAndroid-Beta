package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ax extends g.p {
    public final rz f21651c;

    public ax(rz rzVar) {
        this.f21651c = rzVar;
    }

    @Override
    public final int i(int i10) {
        rz rzVar = this.f21651c;
        mz mzVar = rzVar.f26878z0;
        s4.h0 adapter = rzVar.D0.getAdapter();
        iz izVar = rzVar.f26875y0;
        if (adapter == izVar) {
            if (i10 == 0) {
                return izVar.d;
            }
            if (i10 == izVar.f24173s || (izVar.h.get(i10) != null && !(izVar.h.get(i10) instanceof TLRPC.Document))) {
                return izVar.d;
            }
            return 1;
        } else if (i10 != mzVar.f25324x && (mzVar.f25321r.get(i10) == null || (mzVar.f25321r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return izVar.d;
        }
    }
}
