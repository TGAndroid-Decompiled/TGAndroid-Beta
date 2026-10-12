package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pr implements e70 {
    public final j70 f39277a;
    public final yr f39278b;

    public pr(yr yrVar, j70 j70Var) {
        this.f39278b = yrVar;
        this.f39277a = j70Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f39278b.t0(user.f19363id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f39277a.getParentActivity() == null) {
            return;
        }
        yr yrVar = this.f39278b;
        yrVar.getMessagesController().addUsersToChat(yrVar.f42249r, yrVar, arrayList, i10, new j3(this, 2), new or(0), null);
    }
}
