package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gr implements t60 {
    public final y60 f34664a;
    public final pr f34665b;

    public gr(pr prVar, y60 y60Var) {
        this.f34665b = prVar;
        this.f34664a = y60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f34665b.t0(user.f19331id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f34664a.getParentActivity() == null) {
            return;
        }
        pr prVar = this.f34665b;
        prVar.getMessagesController().addUsersToChat(prVar.f37481r, prVar, arrayList, i10, new j3(this, 2), new fr(0), null);
    }
}
