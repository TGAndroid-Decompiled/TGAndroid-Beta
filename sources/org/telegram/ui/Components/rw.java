package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rw extends f2.v {
    public final kz f28594c;

    public rw(kz kzVar) {
        this.f28594c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f28594c;
        fz fzVar = kzVar.f26492w0;
        f2.o0 adapter = kzVar.A0.getAdapter();
        bz bzVar = kzVar.f26488v0;
        if (adapter == bzVar) {
            if (i10 == 0) {
                return bzVar.d;
            }
            if (i10 == bzVar.f23775s || (bzVar.h.get(i10) != null && !(bzVar.h.get(i10) instanceof TLRPC.Document))) {
                return bzVar.d;
            }
            return 1;
        } else if (i10 != fzVar.f25004x && (fzVar.f25001r.get(i10) == null || (fzVar.f25001r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return bzVar.d;
        }
    }
}
