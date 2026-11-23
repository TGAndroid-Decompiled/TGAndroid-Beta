package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fw extends g.p {
    public final ty f35323c;

    public fw(ty tyVar) {
        this.f35323c = tyVar;
    }

    @Override
    public final int i(int i7) {
        ty tyVar = this.f35323c;
        oy oyVar = tyVar.A0;
        v4.i0 adapter = tyVar.E0.getAdapter();
        ly lyVar = tyVar.f40160z0;
        if (adapter == lyVar) {
            if (i7 == 0) {
                return lyVar.d;
            }
            if (i7 == lyVar.f37328s || (lyVar.h.get(i7) != null && !(lyVar.h.get(i7) instanceof TLRPC.Document))) {
                return lyVar.d;
            }
            return 1;
        } else if (i7 != oyVar.f38411y && (oyVar.f38407r.get(i7) == null || (oyVar.f38407r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return lyVar.d;
        }
    }
}
