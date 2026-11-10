package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rv extends g.p {
    public final gy f37741c;

    public rv(gy gyVar) {
        this.f37741c = gyVar;
    }

    @Override
    public final int i(int i7) {
        gy gyVar = this.f37741c;
        ay ayVar = gyVar.f34088z0;
        v4.g0 adapter = gyVar.D0.getAdapter();
        xx xxVar = gyVar.f34085y0;
        if (adapter == xxVar) {
            if (i7 == 0) {
                return xxVar.d;
            }
            if (i7 == xxVar.f40430s || (xxVar.h.get(i7) != null && !(xxVar.h.get(i7) instanceof TLRPC.Document))) {
                return xxVar.d;
            }
            return 1;
        } else if (i7 != ayVar.f32037y && (ayVar.f32033r.get(i7) == null || (ayVar.f32033r.get(i7) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return xxVar.d;
        }
    }
}
