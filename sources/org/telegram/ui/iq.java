package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iq implements u40 {
    public final z40 f48778a;
    public final rq f48779b;

    public iq(rq rqVar, z40 z40Var) {
        this.f48779b = rqVar;
        this.f48778a = z40Var;
    }

    @Override
    public final void f(TLRPC.User user) {
        this.f48779b.y0(user.f28554id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i7, ArrayList arrayList) {
        if (this.f48778a.getParentActivity() == null) {
            return;
        }
        rq rqVar = this.f48779b;
        rqVar.getMessagesController().o(rqVar.f51756n, rqVar, arrayList, i7, new f3(this, 2), new hq(0), null);
    }
}
