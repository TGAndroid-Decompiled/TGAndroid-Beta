package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class au implements tw, yr {
    public final du f43818a;

    public au(du duVar) {
        this.f43818a = duVar;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(zw zwVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f43818a.q0(user);
    }

    @Override
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26524a;
            if (org.telegram.messenger.m5.E(j3)) {
                du duVar = this.f43818a;
                duVar.q0(duVar.getMessagesController().a2(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}
