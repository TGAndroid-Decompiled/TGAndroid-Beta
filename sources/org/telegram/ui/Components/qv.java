package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qv extends g.p {
    public final ey f37547c;

    public qv(ey eyVar) {
        this.f37547c = eyVar;
    }

    @Override
    public final int i(int i3) {
        ey eyVar = this.f37547c;
        yx yxVar = eyVar.A0;
        u4.h0 adapter = eyVar.E0.getAdapter();
        vx vxVar = eyVar.f33599z0;
        if (adapter == vxVar) {
            if (i3 == 0) {
                return vxVar.d;
            }
            if (i3 == vxVar.f39816s || (vxVar.h.get(i3) != null && !(vxVar.h.get(i3) instanceof TLRPC.Document))) {
                return vxVar.d;
            }
            return 1;
        } else if (i3 != yxVar.f40849y && (yxVar.f40845r.get(i3) == null || (yxVar.f40845r.get(i3) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return vxVar.d;
        }
    }
}
