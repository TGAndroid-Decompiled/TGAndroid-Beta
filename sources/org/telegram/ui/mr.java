package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mr implements a70 {
    public final f70 f38775a;
    public final vr f38776b;

    public mr(vr vrVar, f70 f70Var) {
        this.f38776b = vrVar;
        this.f38775a = f70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f38776b.t0(user.f20043id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f38775a.getParentActivity() == null) {
            return;
        }
        vr vrVar = this.f38776b;
        vrVar.getMessagesController().addUsersToChat(vrVar.f41694r, vrVar, arrayList, i10, new h3(this, 2), new lr(0), null);
    }
}
