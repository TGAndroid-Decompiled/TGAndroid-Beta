package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class bx extends g.o {
    public final sz f26975c;

    public bx(sz szVar) {
        this.f26975c = szVar;
    }

    @Override
    public final int i(int i10) {
        sz szVar = this.f26975c;
        nz nzVar = szVar.f32789z0;
        s4.h0 adapter = szVar.D0.getAdapter();
        jz jzVar = szVar.f32786y0;
        if (adapter == jzVar) {
            if (i10 == 0) {
                return jzVar.d;
            }
            if (i10 == jzVar.f29748s || (jzVar.h.get(i10) != null && !(jzVar.h.get(i10) instanceof TLRPC.Document))) {
                return jzVar.d;
            }
            return 1;
        } else if (i10 != nzVar.f31098x && (nzVar.f31095r.get(i10) == null || (nzVar.f31095r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return jzVar.d;
        }
    }
}
