package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nx extends g.o {
    public final d00 f28984c;

    public nx(d00 d00Var) {
        this.f28984c = d00Var;
    }

    @Override
    public final int i(int i10) {
        d00 d00Var = this.f28984c;
        yz yzVar = d00Var.f25146z0;
        s4.i0 adapter = d00Var.D0.getAdapter();
        tz tzVar = d00Var.f25143y0;
        if (adapter == tzVar) {
            if (i10 == 0) {
                return tzVar.d;
            }
            if (i10 == tzVar.f30997s || (tzVar.h.get(i10) != null && !(tzVar.h.get(i10) instanceof TLRPC.Document))) {
                return tzVar.d;
            }
            return 1;
        } else if (i10 != yzVar.f33235x && (yzVar.f33232r.get(i10) == null || (yzVar.f33232r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return tzVar.d;
        }
    }
}
