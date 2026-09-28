package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gr implements u60 {
    public final z60 f34039a;
    public final pr f34040b;

    public gr(pr prVar, z60 z60Var) {
        this.f34040b = prVar;
        this.f34039a = z60Var;
    }

    @Override
    public final void g(TLRPC.User user) {
        this.f34040b.t0(user.f18482id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f34039a.getParentActivity() == null) {
            return;
        }
        pr prVar = this.f34040b;
        prVar.getMessagesController().addUsersToChat(prVar.f36646r, prVar, arrayList, i10, new h3(this, 2), new fr(0), null);
    }
}
