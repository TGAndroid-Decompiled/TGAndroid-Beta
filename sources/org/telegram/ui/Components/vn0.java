package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vn0 implements jg.f0 {
    public final no0 f39139a;

    public vn0(no0 no0Var) {
        this.f39139a = no0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLObject tLObject = ((jg.g0) arrayList.get(i7)).f16727a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.t3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        no0 no0Var = this.f39139a;
        no0Var.f36464w2 = arrayList;
        for (int i10 = 0; i10 < no0Var.f36464w2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) no0Var.f36464w2.get(i10);
            TLObject tLObject2 = g0Var.f16727a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.qp.s1(no0Var.f28621a).X3((TLRPC.User) g0Var.f16727a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.qp.s1(no0Var.f28621a).Q3((TLRPC.Chat) g0Var.f16727a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.qp.s1(no0Var.f28621a).U3((TLRPC.EncryptedChat) g0Var.f16727a, true);
            }
        }
        no0Var.E1.f();
    }
}
