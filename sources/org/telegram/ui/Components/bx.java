package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class bx extends g.o {
    public final sz f26998c;

    public bx(sz szVar) {
        this.f26998c = szVar;
    }

    @Override
    public final int i(int i10) {
        sz szVar = this.f26998c;
        nz nzVar = szVar.f32786z0;
        s4.h0 adapter = szVar.D0.getAdapter();
        jz jzVar = szVar.f32783y0;
        if (adapter == jzVar) {
            if (i10 == 0) {
                return jzVar.d;
            }
            if (i10 == jzVar.f29789s || (jzVar.h.get(i10) != null && !(jzVar.h.get(i10) instanceof TLRPC.Document))) {
                return jzVar.d;
            }
            return 1;
        } else if (i10 != nzVar.f31104x && (nzVar.f31101r.get(i10) == null || (nzVar.f31101r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return jzVar.d;
        }
    }
}
