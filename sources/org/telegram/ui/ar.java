package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ar implements i60 {
    public final n60 f35466a;
    public final jr f35467b;

    public ar(jr jrVar, n60 n60Var) {
        this.f35467b = jrVar;
        this.f35466a = n60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f35467b.t0(user.f20419id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f35466a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.f35467b;
        jrVar.getMessagesController().addUsersToChat(jrVar.f38295r, jrVar, arrayList, i10, new j3(this, 2), new zq(0), null);
    }
}
