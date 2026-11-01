package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gr implements p50 {
    public final u50 f37546a;
    public final pr f37547b;

    public gr(pr prVar, u50 u50Var) {
        this.f37547b = prVar;
        this.f37546a = u50Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f37547b.y0(user.f19943id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void g(int i10, ArrayList arrayList) {
        if (this.f37546a.getParentActivity() == null) {
            return;
        }
        pr prVar = this.f37547b;
        prVar.getMessagesController().o(prVar.f40553n, prVar, arrayList, i10, new f3(this, 2), new fr(0), null);
    }
}
