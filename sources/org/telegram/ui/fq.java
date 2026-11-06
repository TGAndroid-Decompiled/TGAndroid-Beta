package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fq implements r40 {
    public final w40 f45684a;
    public final oq f45685b;

    public fq(oq oqVar, w40 w40Var) {
        this.f45685b = oqVar;
        this.f45684a = w40Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f45685b.y0(user.f27101id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void f(int i7, ArrayList arrayList) {
        if (this.f45684a.getParentActivity() == null) {
            return;
        }
        oq oqVar = this.f45685b;
        oqVar.getMessagesController().o(oqVar.f48470n, oqVar, arrayList, i7, new f3(this, 2), new eq(0), null);
    }
}
