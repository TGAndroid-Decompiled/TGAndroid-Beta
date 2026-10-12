package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class gx extends g.o {
    public final wz f25433c;

    public gx(wz wzVar) {
        this.f25433c = wzVar;
    }

    @Override
    public final int i(int i10) {
        wz wzVar = this.f25433c;
        rz rzVar = wzVar.f31087z0;
        s4.g0 adapter = wzVar.D0.getAdapter();
        mz mzVar = wzVar.f31084y0;
        if (adapter == mzVar) {
            if (i10 == 0) {
                return mzVar.d;
            }
            if (i10 == mzVar.f27540s || (mzVar.h.get(i10) != null && !(mzVar.h.get(i10) instanceof TLRPC.Document))) {
                return mzVar.d;
            }
            return 1;
        } else if (i10 != rzVar.f28970x && (rzVar.f28967r.get(i10) == null || (rzVar.f28967r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return mzVar.d;
        }
    }
}
