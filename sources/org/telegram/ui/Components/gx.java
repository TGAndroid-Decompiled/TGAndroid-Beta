package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class gx extends g.o {
    public final wz f25121c;

    public gx(wz wzVar) {
        this.f25121c = wzVar;
    }

    @Override
    public final int i(int i10) {
        wz wzVar = this.f25121c;
        rz rzVar = wzVar.f30780z0;
        s4.g0 adapter = wzVar.D0.getAdapter();
        mz mzVar = wzVar.f30777y0;
        if (adapter == mzVar) {
            if (i10 == 0) {
                return mzVar.d;
            }
            if (i10 == mzVar.f27245s || (mzVar.h.get(i10) != null && !(mzVar.h.get(i10) instanceof TLRPC.Document))) {
                return mzVar.d;
            }
            return 1;
        } else if (i10 != rzVar.f28670x && (rzVar.f28667r.get(i10) == null || (rzVar.f28667r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return mzVar.d;
        }
    }
}
