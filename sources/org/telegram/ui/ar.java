package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ar implements h60 {
    public final m60 f36586a;
    public final jr f36587b;

    public ar(jr jrVar, m60 m60Var) {
        this.f36587b = jrVar;
        this.f36586a = m60Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f36587b.t0(user.f22539id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f36586a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.f36587b;
        jrVar.getMessagesController().addUsersToChat(jrVar.f39656r, jrVar, arrayList, i10, new l3(this, 2), new zq(0), null);
    }
}
