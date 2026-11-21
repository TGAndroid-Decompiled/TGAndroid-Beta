package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iq implements u40 {
    public final z40 f48800a;
    public final rq f48801b;

    public iq(rq rqVar, z40 z40Var) {
        this.f48801b = rqVar;
        this.f48800a = z40Var;
    }

    @Override
    public final void f(TLRPC.User user) {
        this.f48801b.y0(user.f28580id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i7, ArrayList arrayList) {
        if (this.f48800a.getParentActivity() == null) {
            return;
        }
        rq rqVar = this.f48801b;
        rqVar.getMessagesController().o(rqVar.f51720n, rqVar, arrayList, i7, new f3(this, 2), new hq(0), null);
    }
}
