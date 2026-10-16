package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pr implements e70 {
    public final j70 f38997a;
    public final yr f38998b;

    public pr(yr yrVar, j70 j70Var) {
        this.f38998b = yrVar;
        this.f38997a = j70Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f38998b.t0(user.f19063id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f38997a.getParentActivity() == null) {
            return;
        }
        yr yrVar = this.f38998b;
        yrVar.getMessagesController().addUsersToChat(yrVar.f41926r, yrVar, arrayList, i10, new j3(this, 2), new or(0), null);
    }
}
