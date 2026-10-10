package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jr implements x60 {
    public final c70 f39053a;
    public final tr f39054b;

    public jr(tr trVar, c70 c70Var) {
        this.f39054b = trVar;
        this.f39053a = c70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f39054b.t0(user.f20189id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f39053a.getParentActivity() == null) {
            return;
        }
        tr trVar = this.f39054b;
        trVar.getMessagesController().addUsersToChat(trVar.f42134r, trVar, arrayList, i10, new h3(this, 2), new ir(0), null);
    }
}
