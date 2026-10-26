package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class br implements m60 {
    public final r60 f38148a;
    public final kr f38149b;

    public br(kr krVar, r60 r60Var) {
        this.f38149b = krVar;
        this.f38148a = r60Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f38149b.u0(user.f22176id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void f(int i10, ArrayList arrayList) {
        if (this.f38148a.getParentActivity() == null) {
            return;
        }
        kr krVar = this.f38149b;
        krVar.getMessagesController().addUsersToChat(krVar.f41032n, krVar, arrayList, i10, new h3(this, 2), new ar(0), null);
    }
}
