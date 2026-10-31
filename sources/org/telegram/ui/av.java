package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class av implements ux, vs {
    public final dv f35750a;

    public av(dv dvVar) {
        this.f35750a = dvVar;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void c(TLRPC.User user) {
        this.f35750a.p0(user);
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
            if (org.telegram.messenger.o5.E(j10)) {
                dv dvVar = this.f35750a;
                dvVar.p0(dvVar.getMessagesController().Z1(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}
