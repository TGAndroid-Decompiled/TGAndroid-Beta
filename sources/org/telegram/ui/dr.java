package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dr implements o60 {
    public final t60 f38665a;
    public final mr f38666b;

    public dr(mr mrVar, t60 t60Var) {
        this.f38666b = mrVar;
        this.f38665a = t60Var;
    }

    @Override
    public final void e(TLRPC.User user) {
        this.f38666b.u0(user.f22177id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void f(int i10, ArrayList arrayList) {
        if (this.f38665a.getParentActivity() == null) {
            return;
        }
        mr mrVar = this.f38666b;
        mrVar.getMessagesController().addUsersToChat(mrVar.f41530n, mrVar, arrayList, i10, new h3(this, 2), new cr(0), null);
    }
}
