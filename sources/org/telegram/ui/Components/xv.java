package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xv extends g.p {
    public final ly f41770c;

    public xv(ly lyVar) {
        this.f41770c = lyVar;
    }

    @Override
    public final int i(int i7) {
        ly lyVar = this.f41770c;
        gy gyVar = lyVar.A0;
        v4.h0 adapter = lyVar.E0.getAdapter();
        dy dyVar = lyVar.f37010z0;
        if (adapter == dyVar) {
            if (i7 == 0) {
                return dyVar.d;
            }
            if (i7 == dyVar.f34104s || (dyVar.h.get(i7) != null && !(dyVar.h.get(i7) instanceof TLRPC.Document))) {
                return dyVar.d;
            }
            return 1;
        } else if (i7 != gyVar.f35091y && (gyVar.f35087r.get(i7) == null || (gyVar.f35087r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return dyVar.d;
        }
    }
}
