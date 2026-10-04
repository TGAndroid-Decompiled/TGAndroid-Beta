package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xw extends g.p {
    public final nz f32994c;

    public xw(nz nzVar) {
        this.f32994c = nzVar;
    }

    @Override
    public final int i(int i10) {
        nz nzVar = this.f32994c;
        iz izVar = nzVar.f29171z0;
        s4.h0 adapter = nzVar.D0.getAdapter();
        ez ezVar = nzVar.f29168y0;
        if (adapter == ezVar) {
            if (i10 == 0) {
                return ezVar.d;
            }
            if (i10 == ezVar.f26187s || (ezVar.h.get(i10) != null && !(ezVar.h.get(i10) instanceof TLRPC.Document))) {
                return ezVar.d;
            }
            return 1;
        } else if (i10 != izVar.f27528x && (izVar.f27525r.get(i10) == null || (izVar.f27525r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return ezVar.d;
        }
    }
}
