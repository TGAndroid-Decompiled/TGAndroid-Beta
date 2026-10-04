package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ir implements y60 {
    public final d70 f37488a;
    public final rr f37489b;

    public ir(rr rrVar, d70 d70Var) {
        this.f37489b = rrVar;
        this.f37488a = d70Var;
    }

    @Override
    public final void c(TLRPC.User user) {
        this.f37489b.t0(user.f20185id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f37488a.getParentActivity() == null) {
            return;
        }
        rr rrVar = this.f37489b;
        rrVar.getMessagesController().addUsersToChat(rrVar.f40222r, rrVar, arrayList, i10, new h3(this, 2), new hr(0), null);
    }
}
