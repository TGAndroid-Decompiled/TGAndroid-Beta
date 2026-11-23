package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iq implements u40 {
    public final z40 f48816a;
    public final rq f48817b;

    public iq(rq rqVar, z40 z40Var) {
        this.f48817b = rqVar;
        this.f48816a = z40Var;
    }

    @Override
    public final void f(TLRPC.User user) {
        this.f48817b.y0(user.f28547id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i7, ArrayList arrayList) {
        if (this.f48816a.getParentActivity() == null) {
            return;
        }
        rq rqVar = this.f48817b;
        rqVar.getMessagesController().o(rqVar.f51754n, rqVar, arrayList, i7, new f3(this, 2), new hq(0), null);
    }
}
