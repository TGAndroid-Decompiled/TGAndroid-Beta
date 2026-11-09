package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class sv extends g.p {
    public final hy f38157c;

    public sv(hy hyVar) {
        this.f38157c = hyVar;
    }

    @Override
    public final int i(int i7) {
        hy hyVar = this.f38157c;
        cy cyVar = hyVar.f34487z0;
        v4.g0 adapter = hyVar.D0.getAdapter();
        yx yxVar = hyVar.f34484y0;
        if (adapter == yxVar) {
            if (i7 == 0) {
                return yxVar.d;
            }
            if (i7 == yxVar.f40835s || (yxVar.h.get(i7) != null && !(yxVar.h.get(i7) instanceof TLRPC.Document))) {
                return yxVar.d;
            }
            return 1;
        } else if (i7 != cyVar.f32787y && (cyVar.f32783r.get(i7) == null || (cyVar.f32783r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return yxVar.d;
        }
    }
}
