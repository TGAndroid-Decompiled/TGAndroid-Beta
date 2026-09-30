package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yw extends g.p {
    public final nz f30824c;

    public yw(nz nzVar) {
        this.f30824c = nzVar;
    }

    @Override
    public final int i(int i10) {
        nz nzVar = this.f30824c;
        iz izVar = nzVar.f26891z0;
        s4.h0 adapter = nzVar.D0.getAdapter();
        ez ezVar = nzVar.f26888y0;
        if (adapter == ezVar) {
            if (i10 == 0) {
                return ezVar.d;
            }
            if (i10 == ezVar.f24083s || (ezVar.h.get(i10) != null && !(ezVar.h.get(i10) instanceof TLRPC.Document))) {
                return ezVar.d;
            }
            return 1;
        } else if (i10 != izVar.f25245x && (izVar.f25242r.get(i10) == null || (izVar.f25242r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return ezVar.d;
        }
    }
}
