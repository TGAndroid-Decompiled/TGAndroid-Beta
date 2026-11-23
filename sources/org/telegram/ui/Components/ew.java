package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ew extends g.p {
    public final ty f34979c;

    public ew(ty tyVar) {
        this.f34979c = tyVar;
    }

    @Override
    public final int i(int i7) {
        ty tyVar = this.f34979c;
        oy oyVar = tyVar.A0;
        v4.h0 adapter = tyVar.E0.getAdapter();
        ly lyVar = tyVar.f40143z0;
        if (adapter == lyVar) {
            if (i7 == 0) {
                return lyVar.d;
            }
            if (i7 == lyVar.f37288s || (lyVar.h.get(i7) != null && !(lyVar.h.get(i7) instanceof TLRPC.Document))) {
                return lyVar.d;
            }
            return 1;
        } else if (i7 != oyVar.f38369y && (oyVar.f38365r.get(i7) == null || (oyVar.f38365r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return lyVar.d;
        }
    }
}
