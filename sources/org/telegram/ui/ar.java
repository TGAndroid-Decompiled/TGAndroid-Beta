package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ar implements i60 {
    public final n60 f35505a;
    public final jr f35506b;

    public ar(jr jrVar, n60 n60Var) {
        this.f35506b = jrVar;
        this.f35505a = n60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f35506b.t0(user.f20426id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f35505a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.f35506b;
        jrVar.getMessagesController().addUsersToChat(jrVar.f38310r, jrVar, arrayList, i10, new j3(this, 2), new zq(0), null);
    }
}
