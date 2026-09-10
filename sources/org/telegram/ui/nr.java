package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nr implements z60 {
    public final e70 f35327a;
    public final wr f35328b;

    public nr(wr wrVar, e70 e70Var) {
        this.f35328b = wrVar;
        this.f35327a = e70Var;
    }

    @Override
    public final void j(TLRPC.User user) {
        this.f35328b.t0(user.f17342id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void k(int i10, ArrayList arrayList) {
        if (this.f35327a.getParentActivity() == null) {
            return;
        }
        wr wrVar = this.f35328b;
        wrVar.getMessagesController().addUsersToChat(wrVar.f38354r, wrVar, arrayList, i10, new i3(this, 2), new mr(0), null);
    }
}
