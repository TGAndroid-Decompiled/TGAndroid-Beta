package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ir implements v60 {
    public final a70 f35018a;
    public final rr f35019b;

    public ir(rr rrVar, a70 a70Var) {
        this.f35019b = rrVar;
        this.f35018a = a70Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f35019b.t0(user.f19306id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f35018a.getParentActivity() == null) {
            return;
        }
        rr rrVar = this.f35019b;
        rrVar.getMessagesController().addUsersToChat(rrVar.f37992r, rrVar, arrayList, i10, new l3(this, 2), new hr(0), null);
    }
}
