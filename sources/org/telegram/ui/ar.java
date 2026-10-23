package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ar implements k60 {
    public final p60 f35768a;
    public final jr f35769b;

    public ar(jr jrVar, p60 p60Var) {
        this.f35769b = jrVar;
        this.f35768a = p60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f35769b.t0(user.f20490id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f35768a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.f35769b;
        jrVar.getMessagesController().addUsersToChat(jrVar.f38665r, jrVar, arrayList, i10, new i3(this, 2), new zq(0), null);
    }
}
