package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cx extends g.o {
    public final tz f25279c;

    public cx(tz tzVar) {
        this.f25279c = tzVar;
    }

    @Override
    public final int i(int i10) {
        tz tzVar = this.f25279c;
        oz ozVar = tzVar.f30800z0;
        s4.g0 adapter = tzVar.D0.getAdapter();
        kz kzVar = tzVar.f30797y0;
        if (adapter == kzVar) {
            if (i10 == 0) {
                return kzVar.d;
            }
            if (i10 == kzVar.f27990s || (kzVar.h.get(i10) != null && !(kzVar.h.get(i10) instanceof TLRPC.Document))) {
                return kzVar.d;
            }
            return 1;
        } else if (i10 != ozVar.f29165x && (ozVar.f29162r.get(i10) == null || (ozVar.f29162r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return kzVar.d;
        }
    }
}
