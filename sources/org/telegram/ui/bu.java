package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bu implements ww, yr {
    public final eu f46302a;

    public bu(eu euVar) {
        this.f46302a = euVar;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f46302a.q0(user);
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((org.telegram.messenger.tr) arrayList.get(0)).f27037a;
            if (org.telegram.messenger.n5.E(j3)) {
                eu euVar = this.f46302a;
                euVar.q0(euVar.getMessagesController().c2(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}
