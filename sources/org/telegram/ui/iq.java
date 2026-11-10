package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iq implements u40 {
    public final z40 f46717a;
    public final rq f46718b;

    public iq(rq rqVar, z40 z40Var) {
        this.f46718b = rqVar;
        this.f46717a = z40Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f46718b.y0(user.f27109id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void f(int i7, ArrayList arrayList) {
        if (this.f46717a.getParentActivity() == null) {
            return;
        }
        rq rqVar = this.f46718b;
        rqVar.getMessagesController().o(rqVar.f49525n, rqVar, arrayList, i7, new f3(this, 2), new hq(0), null);
    }
}
