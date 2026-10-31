package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gr implements q50 {
    public final v50 f37619a;
    public final pr f37620b;

    public gr(pr prVar, v50 v50Var) {
        this.f37620b = prVar;
        this.f37619a = v50Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f37620b.x0(user.f19942id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void g(int i10, ArrayList arrayList) {
        if (this.f37619a.getParentActivity() == null) {
            return;
        }
        pr prVar = this.f37620b;
        prVar.getMessagesController().o(prVar.f40746n, prVar, arrayList, i10, new f3(this, 2), new fr(0), null);
    }
}
