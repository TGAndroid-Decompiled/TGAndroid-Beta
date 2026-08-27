package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class br implements j60 {

    public final o60 f36869a;

    public final lr f36870b;

    public br(lr lrVar, o60 o60Var) {
        this.f36870b = lrVar;
        this.f36869a = o60Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f36870b.t0(user.f22527id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f36869a.getParentActivity() == null) {
            return;
        }
        lr lrVar = this.f36870b;
        lrVar.getMessagesController().addUsersToChat(lrVar.f40217r, lrVar, arrayList, i10, new l3(this, 2), new ar(0), null);
    }
}
