package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jr implements x60 {
    public final c70 f39144a;
    public final sr f39145b;

    public jr(sr srVar, c70 c70Var) {
        this.f39145b = srVar;
        this.f39144a = c70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f39145b.t0(user.f20215id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f39144a.getParentActivity() == null) {
            return;
        }
        sr srVar = this.f39145b;
        srVar.getMessagesController().addUsersToChat(srVar.f41856r, srVar, arrayList, i10, new g3(this, 2), new ir(0), null);
    }
}
