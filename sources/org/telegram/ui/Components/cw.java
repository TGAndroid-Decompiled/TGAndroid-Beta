package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cw extends g.p {
    public final ry f34189c;

    public cw(ry ryVar) {
        this.f34189c = ryVar;
    }

    @Override
    public final int i(int i7) {
        ry ryVar = this.f34189c;
        my myVar = ryVar.A0;
        v4.i0 adapter = ryVar.E0.getAdapter();
        jy jyVar = ryVar.f39414z0;
        if (adapter == jyVar) {
            if (i7 == 0) {
                return jyVar.d;
            }
            if (i7 == jyVar.f36559s || (jyVar.h.get(i7) != null && !(jyVar.h.get(i7) instanceof TLRPC.Document))) {
                return jyVar.d;
            }
            return 1;
        } else if (i7 != myVar.f37664y && (myVar.f37660r.get(i7) == null || (myVar.f37660r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return jyVar.d;
        }
    }
}
