package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gr implements u60 {
    public final z60 f34132a;
    public final pr f34133b;

    public gr(pr prVar, z60 z60Var) {
        this.f34133b = prVar;
        this.f34132a = z60Var;
    }

    @Override
    public final void g(TLRPC.User user) {
        this.f34133b.t0(user.f18499id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f34132a.getParentActivity() == null) {
            return;
        }
        pr prVar = this.f34133b;
        prVar.getMessagesController().addUsersToChat(prVar.f36746r, prVar, arrayList, i10, new h3(this, 2), new fr(0), null);
    }
}
