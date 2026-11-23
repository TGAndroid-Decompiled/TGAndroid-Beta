package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cw extends g.p {
    public final qy f34154c;

    public cw(qy qyVar) {
        this.f34154c = qyVar;
    }

    @Override
    public final int i(int i7) {
        qy qyVar = this.f34154c;
        ly lyVar = qyVar.A0;
        v4.i0 adapter = qyVar.E0.getAdapter();
        iy iyVar = qyVar.f39116z0;
        if (adapter == iyVar) {
            if (i7 == 0) {
                return iyVar.d;
            }
            if (i7 == iyVar.f36202s || (iyVar.h.get(i7) != null && !(iyVar.h.get(i7) instanceof TLRPC.Document))) {
                return iyVar.d;
            }
            return 1;
        } else if (i7 != lyVar.f37258y && (lyVar.f37254r.get(i7) == null || (lyVar.f37254r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return iyVar.d;
        }
    }
}
