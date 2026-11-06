package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fq implements r40 {
    public final w40 f45690a;
    public final oq f45691b;

    public fq(oq oqVar, w40 w40Var) {
        this.f45691b = oqVar;
        this.f45690a = w40Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f45691b.y0(user.f27102id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void f(int i7, ArrayList arrayList) {
        if (this.f45690a.getParentActivity() == null) {
            return;
        }
        oq oqVar = this.f45691b;
        oqVar.getMessagesController().o(oqVar.f48497n, oqVar, arrayList, i7, new f3(this, 2), new eq(0), null);
    }
}
