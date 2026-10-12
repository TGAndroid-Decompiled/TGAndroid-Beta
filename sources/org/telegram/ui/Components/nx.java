package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nx extends g.o {
    public final d00 f28980c;

    public nx(d00 d00Var) {
        this.f28980c = d00Var;
    }

    @Override
    public final int i(int i10) {
        d00 d00Var = this.f28980c;
        yz yzVar = d00Var.f25154z0;
        s4.i0 adapter = d00Var.D0.getAdapter();
        tz tzVar = d00Var.f25151y0;
        if (adapter == tzVar) {
            if (i10 == 0) {
                return tzVar.d;
            }
            if (i10 == tzVar.f31002s || (tzVar.h.get(i10) != null && !(tzVar.h.get(i10) instanceof TLRPC.Document))) {
                return tzVar.d;
            }
            return 1;
        } else if (i10 != yzVar.f33229x && (yzVar.f33226r.get(i10) == null || (yzVar.f33226r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return tzVar.d;
        }
    }
}
