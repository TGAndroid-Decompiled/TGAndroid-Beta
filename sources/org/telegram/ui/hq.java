package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hq implements t40 {
    public final y40 f46370a;
    public final qq f46371b;

    public hq(qq qqVar, y40 y40Var) {
        this.f46371b = qqVar;
        this.f46370a = y40Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f46371b.y0(user.f27105id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void f(int i7, ArrayList arrayList) {
        if (this.f46370a.getParentActivity() == null) {
            return;
        }
        qq qqVar = this.f46371b;
        qqVar.getMessagesController().o(qqVar.f49144n, qqVar, arrayList, i7, new f3(this, 2), new gq(0), null);
    }
}
