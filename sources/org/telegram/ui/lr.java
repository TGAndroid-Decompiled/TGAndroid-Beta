package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lr implements b70 {
    public final g70 f35610a;
    public final ur f35611b;

    public lr(ur urVar, g70 g70Var) {
        this.f35611b = urVar;
        this.f35610a = g70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f35611b.t0(user.f18268id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f35610a.getParentActivity() == null) {
            return;
        }
        ur urVar = this.f35611b;
        urVar.getMessagesController().addUsersToChat(urVar.f38154r, urVar, arrayList, i10, new g3(this, 2), new kr(0), null);
    }
}
