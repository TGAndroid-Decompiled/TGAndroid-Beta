package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ar implements k60 {
    public final p60 f35826a;
    public final jr f35827b;

    public ar(jr jrVar, p60 p60Var) {
        this.f35827b = jrVar;
        this.f35826a = p60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f35827b.t0(user.f20491id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f35826a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.f35827b;
        jrVar.getMessagesController().addUsersToChat(jrVar.f38653r, jrVar, arrayList, i10, new i3(this, 2), new zq(0), null);
    }
}
