package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cx extends g.o {
    public final tz f25396c;

    public cx(tz tzVar) {
        this.f25396c = tzVar;
    }

    @Override
    public final int i(int i10) {
        tz tzVar = this.f25396c;
        oz ozVar = tzVar.f30820z0;
        s4.g0 adapter = tzVar.D0.getAdapter();
        kz kzVar = tzVar.f30817y0;
        if (adapter == kzVar) {
            if (i10 == 0) {
                return kzVar.d;
            }
            if (i10 == kzVar.f28032s || (kzVar.h.get(i10) != null && !(kzVar.h.get(i10) instanceof TLRPC.Document))) {
                return kzVar.d;
            }
            return 1;
        } else if (i10 != ozVar.f29114x && (ozVar.f29111r.get(i10) == null || (ozVar.f29111r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return kzVar.d;
        }
    }
}
