package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cx extends g.o {
    public final tz f25361c;

    public cx(tz tzVar) {
        this.f25361c = tzVar;
    }

    @Override
    public final int i(int i10) {
        tz tzVar = this.f25361c;
        oz ozVar = tzVar.f30841z0;
        s4.g0 adapter = tzVar.D0.getAdapter();
        kz kzVar = tzVar.f30838y0;
        if (adapter == kzVar) {
            if (i10 == 0) {
                return kzVar.d;
            }
            if (i10 == kzVar.f28031s || (kzVar.h.get(i10) != null && !(kzVar.h.get(i10) instanceof TLRPC.Document))) {
                return kzVar.d;
            }
            return 1;
        } else if (i10 != ozVar.f29119x && (ozVar.f29116r.get(i10) == null || (ozVar.f29116r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return kzVar.d;
        }
    }
}
