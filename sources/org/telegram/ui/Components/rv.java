package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rv extends g.p {
    public final gy f37800c;

    public rv(gy gyVar) {
        this.f37800c = gyVar;
    }

    @Override
    public final int i(int i7) {
        gy gyVar = this.f37800c;
        ay ayVar = gyVar.f34096z0;
        v4.g0 adapter = gyVar.D0.getAdapter();
        xx xxVar = gyVar.f34093y0;
        if (adapter == xxVar) {
            if (i7 == 0) {
                return xxVar.d;
            }
            if (i7 == xxVar.f40458s || (xxVar.h.get(i7) != null && !(xxVar.h.get(i7) instanceof TLRPC.Document))) {
                return xxVar.d;
            }
            return 1;
        } else if (i7 != ayVar.f31952y && (ayVar.f31948r.get(i7) == null || (ayVar.f31948r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return xxVar.d;
        }
    }
}
