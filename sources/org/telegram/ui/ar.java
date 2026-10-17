package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ar implements i60 {
    public final n60 f35481a;
    public final jr f35482b;

    public ar(jr jrVar, n60 n60Var) {
        this.f35482b = jrVar;
        this.f35481a = n60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f35482b.t0(user.f20419id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f35481a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.f35482b;
        jrVar.getMessagesController().addUsersToChat(jrVar.f38301r, jrVar, arrayList, i10, new j3(this, 2), new zq(0), null);
    }
}
