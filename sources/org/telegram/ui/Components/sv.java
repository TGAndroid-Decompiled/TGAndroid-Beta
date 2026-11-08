package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class sv extends g.p {
    public final hy f38146c;

    public sv(hy hyVar) {
        this.f38146c = hyVar;
    }

    @Override
    public final int i(int i7) {
        hy hyVar = this.f38146c;
        cy cyVar = hyVar.f34472z0;
        v4.g0 adapter = hyVar.D0.getAdapter();
        yx yxVar = hyVar.f34469y0;
        if (adapter == yxVar) {
            if (i7 == 0) {
                return yxVar.d;
            }
            if (i7 == yxVar.f40821s || (yxVar.h.get(i7) != null && !(yxVar.h.get(i7) instanceof TLRPC.Document))) {
                return yxVar.d;
            }
            return 1;
        } else if (i7 != cyVar.f32727y && (cyVar.f32723r.get(i7) == null || (cyVar.f32723r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return yxVar.d;
        }
    }
}
