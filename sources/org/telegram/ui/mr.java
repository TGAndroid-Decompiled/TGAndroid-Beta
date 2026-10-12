package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mr implements z60 {
    public final e70 f40118a;
    public final wr f40119b;

    public mr(wr wrVar, e70 e70Var) {
        this.f40119b = wrVar;
        this.f40118a = e70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f40119b.t0(user.f19949id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f40118a.getParentActivity() == null) {
            return;
        }
        wr wrVar = this.f40119b;
        wrVar.getMessagesController().addUsersToChat(wrVar.f43646r, wrVar, arrayList, i10, new h3(this, 2), new lr(0), null);
    }
}
