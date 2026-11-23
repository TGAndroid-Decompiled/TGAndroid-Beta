package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class au implements vw, yr {
    public final du f45811a;

    public au(du duVar) {
        this.f45811a = duVar;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public boolean O(bx bxVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f45811a.q0(user);
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26946a;
            if (org.telegram.messenger.n5.E(j3)) {
                du duVar = this.f45811a;
                duVar.q0(duVar.getMessagesController().c2(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}
