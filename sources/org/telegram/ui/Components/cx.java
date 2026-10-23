package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cx extends g.o {
    public final tz f25446c;

    public cx(tz tzVar) {
        this.f25446c = tzVar;
    }

    @Override
    public final int i(int i10) {
        tz tzVar = this.f25446c;
        oz ozVar = tzVar.f31039z0;
        s4.g0 adapter = tzVar.D0.getAdapter();
        kz kzVar = tzVar.f31036y0;
        if (adapter == kzVar) {
            if (i10 == 0) {
                return kzVar.d;
            }
            if (i10 == kzVar.f28182s || (kzVar.h.get(i10) != null && !(kzVar.h.get(i10) instanceof TLRPC.Document))) {
                return kzVar.d;
            }
            return 1;
        } else if (i10 != ozVar.f29366x && (ozVar.f29363r.get(i10) == null || (ozVar.f29363r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return kzVar.d;
        }
    }
}
