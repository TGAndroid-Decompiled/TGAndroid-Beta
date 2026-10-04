package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ir implements y60 {
    public final d70 f37493a;
    public final rr f37494b;

    public ir(rr rrVar, d70 d70Var) {
        this.f37494b = rrVar;
        this.f37493a = d70Var;
    }

    @Override
    public final void c(TLRPC.User user) {
        this.f37494b.t0(user.f20189id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f37493a.getParentActivity() == null) {
            return;
        }
        rr rrVar = this.f37494b;
        rrVar.getMessagesController().addUsersToChat(rrVar.f40227r, rrVar, arrayList, i10, new h3(this, 2), new hr(0), null);
    }
}
