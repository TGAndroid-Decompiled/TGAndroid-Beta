package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hq implements r40 {
    public final w40 f47786a;
    public final qq f47787b;

    public hq(qq qqVar, w40 w40Var) {
        this.f47787b = qqVar;
        this.f47786a = w40Var;
    }

    @Override
    public final void f(TLRPC.User user) {
        this.f47787b.y0(user.f28200id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i7, ArrayList arrayList) {
        if (this.f47786a.getParentActivity() == null) {
            return;
        }
        qq qqVar = this.f47787b;
        qqVar.getMessagesController().o(qqVar.f50737n, qqVar, arrayList, i7, new f3(this, 2), new gq(0), null);
    }
}
