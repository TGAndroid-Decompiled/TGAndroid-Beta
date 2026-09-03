package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class tw extends f2.v {
    public final mz f31421c;

    public tw(mz mzVar) {
        this.f31421c = mzVar;
    }

    @Override
    public final int i(int i10) {
        mz mzVar = this.f31421c;
        hz hzVar = mzVar.f29337w0;
        f2.p0 adapter = mzVar.A0.getAdapter();
        dz dzVar = mzVar.f29333v0;
        if (adapter == dzVar) {
            if (i10 == 0) {
                return dzVar.d;
            }
            if (i10 == dzVar.f26380s || (dzVar.h.get(i10) != null && !(dzVar.h.get(i10) instanceof TLRPC.Document))) {
                return dzVar.d;
            }
            return 1;
        } else if (i10 != hzVar.f27667x && (hzVar.f27664r.get(i10) == null || (hzVar.f27664r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return dzVar.d;
        }
    }
}
