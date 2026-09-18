package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lr implements b70 {
    public final g70 f35615a;
    public final ur f35616b;

    public lr(ur urVar, g70 g70Var) {
        this.f35616b = urVar;
        this.f35615a = g70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f35616b.t0(user.f18268id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f35615a.getParentActivity() == null) {
            return;
        }
        ur urVar = this.f35616b;
        urVar.getMessagesController().addUsersToChat(urVar.f38159r, urVar, arrayList, i10, new g3(this, 2), new kr(0), null);
    }
}
