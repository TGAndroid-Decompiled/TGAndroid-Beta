package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jr implements z60 {
    public final e70 f34998a;
    public final sr f34999b;

    public jr(sr srVar, e70 e70Var) {
        this.f34999b = srVar;
        this.f34998a = e70Var;
    }

    @Override
    public final void g(TLRPC.User user) {
        this.f34999b.t0(user.f18490id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f34998a.getParentActivity() == null) {
            return;
        }
        sr srVar = this.f34999b;
        srVar.getMessagesController().addUsersToChat(srVar.f37508r, srVar, arrayList, i10, new g3(this, 2), new ir(0), null);
    }
}
