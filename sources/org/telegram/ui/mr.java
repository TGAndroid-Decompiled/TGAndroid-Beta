package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mr implements z60 {
    public final e70 f40121a;
    public final wr f40122b;

    public mr(wr wrVar, e70 e70Var) {
        this.f40122b = wrVar;
        this.f40121a = e70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f40122b.t0(user.f19950id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f40121a.getParentActivity() == null) {
            return;
        }
        wr wrVar = this.f40122b;
        wrVar.getMessagesController().addUsersToChat(wrVar.f43651r, wrVar, arrayList, i10, new h3(this, 2), new lr(0), null);
    }
}
