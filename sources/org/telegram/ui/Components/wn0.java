package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wn0 implements kg.c0 {
    public final oo0 f40034a;

    public wn0(oo0 oo0Var) {
        this.f40034a = oo0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i3 = 0;
        while (i3 < arrayList.size()) {
            TLObject tLObject = ((kg.d0) arrayList.get(i3)).f16946a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.t3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        oo0 oo0Var = this.f40034a;
        oo0Var.f36910x2 = arrayList;
        for (int i10 = 0; i10 < oo0Var.f36910x2.size(); i10++) {
            kg.d0 d0Var = (kg.d0) oo0Var.f36910x2.get(i10);
            TLObject tLObject2 = d0Var.f16946a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.hp.s1(oo0Var.f28583a).X3((TLRPC.User) d0Var.f16946a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.hp.s1(oo0Var.f28583a).Q3((TLRPC.Chat) d0Var.f16946a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.hp.s1(oo0Var.f28583a).U3((TLRPC.EncryptedChat) d0Var.f16946a, true);
            }
        }
        oo0Var.F1.f();
    }
}
