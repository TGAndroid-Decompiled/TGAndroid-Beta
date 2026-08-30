package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rw extends f2.v {
    public final kz f28545c;

    public rw(kz kzVar) {
        this.f28545c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f28545c;
        fz fzVar = kzVar.f26480w0;
        f2.o0 adapter = kzVar.A0.getAdapter();
        bz bzVar = kzVar.f26476v0;
        if (adapter == bzVar) {
            if (i10 == 0) {
                return bzVar.d;
            }
            if (i10 == bzVar.f23768s || (bzVar.h.get(i10) != null && !(bzVar.h.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        } else if (i10 != fzVar.f24998x && (fzVar.f24995r.get(i10) == null || (fzVar.f24995r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return bzVar.d;
        }
    }
}
