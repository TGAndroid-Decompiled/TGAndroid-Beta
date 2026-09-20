package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jr implements z60 {
    public final e70 f34976a;
    public final sr f34977b;

    public jr(sr srVar, e70 e70Var) {
        this.f34977b = srVar;
        this.f34976a = e70Var;
    }

    @Override
    public final void g(TLRPC.User user) {
        this.f34977b.t0(user.f18475id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f34976a.getParentActivity() == null) {
            return;
        }
        sr srVar = this.f34977b;
        srVar.getMessagesController().addUsersToChat(srVar.f37484r, srVar, arrayList, i10, new g3(this, 2), new ir(0), null);
    }
}
