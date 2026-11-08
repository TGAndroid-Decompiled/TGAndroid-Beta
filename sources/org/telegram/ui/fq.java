package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fq implements r40 {
    public final w40 f45667a;
    public final oq f45668b;

    public fq(oq oqVar, w40 w40Var) {
        this.f45668b = oqVar;
        this.f45667a = w40Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f45668b.y0(user.f27105id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void f(int i7, ArrayList arrayList) {
        if (this.f45667a.getParentActivity() == null) {
            return;
        }
        oq oqVar = this.f45668b;
        oqVar.getMessagesController().o(oqVar.f48491n, oqVar, arrayList, i7, new f3(this, 2), new eq(0), null);
    }
}
