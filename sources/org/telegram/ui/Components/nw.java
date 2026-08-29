package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nw extends f2.v {
    public final fz f31157c;

    public nw(fz fzVar) {
        this.f31157c = fzVar;
    }

    @Override
    public final int i(int i10) {
        fz fzVar = this.f31157c;
        az azVar = fzVar.f28642v0;
        f2.p0 adapter = fzVar.f28657z0.getAdapter();
        wy wyVar = fzVar.f28639u0;
        if (adapter == wyVar) {
            if (i10 == 0) {
                return wyVar.d;
            }
            if (i10 == wyVar.f34514s || (wyVar.h.get(i10) != null && !(wyVar.h.get(i10) instanceof TLRPC.Document))) {
                return wyVar.d;
            }
            return 1;
        } else if (i10 != azVar.f26920x && (azVar.f26917r.get(i10) == null || (azVar.f26917r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return wyVar.d;
        }
    }
}
