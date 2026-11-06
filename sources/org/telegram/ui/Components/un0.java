package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class un0 implements jg.f0 {
    public final mo0 f38687a;

    public un0(mo0 mo0Var) {
        this.f38687a = mo0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLObject tLObject = ((jg.g0) arrayList.get(i7)).f16724a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.t3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        mo0 mo0Var = this.f38687a;
        mo0Var.f36026w2 = arrayList;
        for (int i10 = 0; i10 < mo0Var.f36026w2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) mo0Var.f36026w2.get(i10);
            TLObject tLObject2 = g0Var.f16724a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.qp.s1(mo0Var.f28612a).X3((TLRPC.User) g0Var.f16724a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.qp.s1(mo0Var.f28612a).Q3((TLRPC.Chat) g0Var.f16724a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.qp.s1(mo0Var.f28612a).U3((TLRPC.EncryptedChat) g0Var.f16724a, true);
            }
        }
        mo0Var.E1.f();
    }
}
