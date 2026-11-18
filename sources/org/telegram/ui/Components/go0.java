package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class go0 implements jg.f0 {
    public final yo0 f35546a;

    public go0(yo0 yo0Var) {
        this.f35546a = yo0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLObject tLObject = ((jg.g0) arrayList.get(i7)).f17460a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.v3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        yo0 yo0Var = this.f35546a;
        yo0Var.A2 = arrayList;
        for (int i10 = 0; i10 < yo0Var.A2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) yo0Var.A2.get(i10);
            TLObject tLObject2 = g0Var.f17460a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.mp.u1(yo0Var.f30187a).e4((TLRPC.User) g0Var.f17460a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.mp.u1(yo0Var.f30187a).X3((TLRPC.Chat) g0Var.f17460a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.mp.u1(yo0Var.f30187a).b4((TLRPC.EncryptedChat) g0Var.f17460a, true);
            }
        }
        yo0Var.I1.f();
    }
}
