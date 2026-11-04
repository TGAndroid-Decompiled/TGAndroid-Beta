package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dq implements m40 {
    public final r40 f44793a;
    public final nq f44794b;

    public dq(nq nqVar, r40 r40Var) {
        this.f44794b = nqVar;
        this.f44793a = r40Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f44794b.y0(user.f27150id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void h(int i3, ArrayList arrayList) {
        if (this.f44793a.getParentActivity() == null) {
            return;
        }
        nq nqVar = this.f44794b;
        nqVar.getMessagesController().o(nqVar.f48074n, nqVar, arrayList, i3, new g3(this, 2), new cq(0), null);
    }
}
