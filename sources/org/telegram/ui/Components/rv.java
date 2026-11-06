package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rv extends g.p {
    public final gy f37760c;

    public rv(gy gyVar) {
        this.f37760c = gyVar;
    }

    @Override
    public final int i(int i7) {
        gy gyVar = this.f37760c;
        ay ayVar = gyVar.f34104z0;
        v4.g0 adapter = gyVar.D0.getAdapter();
        xx xxVar = gyVar.f34101y0;
        if (adapter == xxVar) {
            if (i7 == 0) {
                return xxVar.d;
            }
            if (i7 == xxVar.f40479s || (xxVar.h.get(i7) != null && !(xxVar.h.get(i7) instanceof TLRPC.Document))) {
                return xxVar.d;
            }
            return 1;
        } else if (i7 != ayVar.f31949y && (ayVar.f31945r.get(i7) == null || (ayVar.f31945r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return xxVar.d;
        }
    }
}
