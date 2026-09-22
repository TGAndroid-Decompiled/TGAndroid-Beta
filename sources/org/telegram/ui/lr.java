package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lr implements z60 {
    public final e70 f35529a;
    public final ur f35530b;

    public lr(ur urVar, e70 e70Var) {
        this.f35530b = urVar;
        this.f35529a = e70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f35530b.t0(user.f18256id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f35529a.getParentActivity() == null) {
            return;
        }
        ur urVar = this.f35530b;
        urVar.getMessagesController().addUsersToChat(urVar.f38144r, urVar, arrayList, i10, new g3(this, 2), new kr(0), null);
    }
}
