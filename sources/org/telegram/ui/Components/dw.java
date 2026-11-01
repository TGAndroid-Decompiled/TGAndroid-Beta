package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class dw extends g.o {
    public final vy f25603c;

    public dw(vy vyVar) {
        this.f25603c = vyVar;
    }

    @Override
    public final int i(int i10) {
        vy vyVar = this.f25603c;
        qy qyVar = vyVar.f32016z0;
        s4.g0 adapter = vyVar.D0.getAdapter();
        ny nyVar = vyVar.f32013y0;
        if (adapter == nyVar) {
            if (i10 == 0) {
                return nyVar.d;
            }
            if (i10 == nyVar.f28984s || (nyVar.h.get(i10) != null && !(nyVar.h.get(i10) instanceof TLRPC.Document))) {
                return nyVar.d;
            }
            return 1;
        } else if (i10 != qyVar.f29830y && (qyVar.f29826r.get(i10) == null || (qyVar.f29826r.get(i10) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return nyVar.d;
        }
    }
}
