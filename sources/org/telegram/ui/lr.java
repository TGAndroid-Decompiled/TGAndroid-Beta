package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lr implements z60 {
    public final e70 f35546a;
    public final ur f35547b;

    public lr(ur urVar, e70 e70Var) {
        this.f35547b = urVar;
        this.f35546a = e70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f35547b.t0(user.f18259id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f35546a.getParentActivity() == null) {
            return;
        }
        ur urVar = this.f35547b;
        urVar.getMessagesController().addUsersToChat(urVar.f38130r, urVar, arrayList, i10, new g3(this, 2), new kr(0), null);
    }
}
