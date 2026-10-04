package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xw extends g.p {
    public final nz f32988c;

    public xw(nz nzVar) {
        this.f32988c = nzVar;
    }

    @Override
    public final int i(int i10) {
        nz nzVar = this.f32988c;
        iz izVar = nzVar.f29166z0;
        s4.h0 adapter = nzVar.D0.getAdapter();
        ez ezVar = nzVar.f29163y0;
        if (adapter == ezVar) {
            if (i10 == 0) {
                return ezVar.d;
            }
            if (i10 == ezVar.f26182s || (ezVar.h.get(i10) != null && !(ezVar.h.get(i10) instanceof TLRPC.Document))) {
                return ezVar.d;
            }
            return 1;
        } else if (i10 != izVar.f27523x && (izVar.f27520r.get(i10) == null || (izVar.f27520r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return ezVar.d;
        }
    }
}
