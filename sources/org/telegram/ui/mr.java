package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mr implements a70 {
    public final f70 f38776a;
    public final vr f38777b;

    public mr(vr vrVar, f70 f70Var) {
        this.f38777b = vrVar;
        this.f38776a = f70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f38777b.t0(user.f20043id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f38776a.getParentActivity() == null) {
            return;
        }
        vr vrVar = this.f38777b;
        vrVar.getMessagesController().addUsersToChat(vrVar.f41695r, vrVar, arrayList, i10, new h3(this, 2), new lr(0), null);
    }
}
