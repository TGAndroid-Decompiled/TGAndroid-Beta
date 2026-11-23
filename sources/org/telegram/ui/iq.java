package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iq implements t40 {
    public final y40 f48900a;
    public final rq f48901b;

    public iq(rq rqVar, y40 y40Var) {
        this.f48901b = rqVar;
        this.f48900a = y40Var;
    }

    @Override
    public final void f(TLRPC.User user) {
        this.f48901b.y0(user.f28641id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void g(int i7, ArrayList arrayList) {
        if (this.f48900a.getParentActivity() == null) {
            return;
        }
        rq rqVar = this.f48901b;
        rqVar.getMessagesController().o(rqVar.f51839n, rqVar, arrayList, i7, new f3(this, 2), new hq(0), null);
    }
}
