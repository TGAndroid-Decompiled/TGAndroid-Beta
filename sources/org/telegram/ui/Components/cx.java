package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cx extends g.o {
    public final tz f25278c;

    public cx(tz tzVar) {
        this.f25278c = tzVar;
    }

    @Override
    public final int i(int i10) {
        tz tzVar = this.f25278c;
        oz ozVar = tzVar.f30799z0;
        s4.g0 adapter = tzVar.D0.getAdapter();
        kz kzVar = tzVar.f30796y0;
        if (adapter == kzVar) {
            if (i10 == 0) {
                return kzVar.d;
            }
            if (i10 == kzVar.f27989s || (kzVar.h.get(i10) != null && !(kzVar.h.get(i10) instanceof TLRPC.Document))) {
                return kzVar.d;
            }
            return 1;
        } else if (i10 != ozVar.f29164x && (ozVar.f29161r.get(i10) == null || (ozVar.f29161r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return kzVar.d;
        }
    }
}
