package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xn0 implements jg.f0 {
    public final po0 f41734a;

    public xn0(po0 po0Var) {
        this.f41734a = po0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLObject tLObject = ((jg.g0) arrayList.get(i7)).f17077a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.t3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        po0 po0Var = this.f41734a;
        po0Var.A2 = arrayList;
        for (int i10 = 0; i10 < po0Var.A2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) po0Var.A2.get(i10);
            TLObject tLObject2 = g0Var.f17077a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.np.s1(po0Var.f29679a).X3((TLRPC.User) g0Var.f17077a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.np.s1(po0Var.f29679a).Q3((TLRPC.Chat) g0Var.f17077a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.np.s1(po0Var.f29679a).U3((TLRPC.EncryptedChat) g0Var.f17077a, true);
            }
        }
        po0Var.I1.f();
    }
}
