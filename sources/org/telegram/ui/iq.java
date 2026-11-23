package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iq implements u40 {
    public final z40 f48804a;
    public final rq f48805b;

    public iq(rq rqVar, z40 z40Var) {
        this.f48805b = rqVar;
        this.f48804a = z40Var;
    }

    @Override
    public final void f(TLRPC.User user) {
        this.f48805b.y0(user.f28583id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i7, ArrayList arrayList) {
        if (this.f48804a.getParentActivity() == null) {
            return;
        }
        rq rqVar = this.f48805b;
        rqVar.getMessagesController().o(rqVar.f51724n, rqVar, arrayList, i7, new f3(this, 2), new hq(0), null);
    }
}
