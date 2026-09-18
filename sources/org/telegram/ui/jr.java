package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jr implements z60 {
    public final e70 f34931a;
    public final sr f34932b;

    public jr(sr srVar, e70 e70Var) {
        this.f34932b = srVar;
        this.f34931a = e70Var;
    }

    @Override
    public final void g(TLRPC.User user) {
        this.f34932b.t0(user.f18443id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f34931a.getParentActivity() == null) {
            return;
        }
        sr srVar = this.f34932b;
        srVar.getMessagesController().addUsersToChat(srVar.f37429r, srVar, arrayList, i10, new g3(this, 2), new ir(0), null);
    }
}
