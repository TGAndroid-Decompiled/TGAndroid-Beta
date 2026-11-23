package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ho0 implements jg.f0 {
    public final zo0 f35781a;

    public ho0(zo0 zo0Var) {
        this.f35781a = zo0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLObject tLObject = ((jg.g0) arrayList.get(i7)).f17556a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.v3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        zo0 zo0Var = this.f35781a;
        zo0Var.A2 = arrayList;
        for (int i10 = 0; i10 < zo0Var.A2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) zo0Var.A2.get(i10);
            TLObject tLObject2 = g0Var.f17556a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.mp.u1(zo0Var.f30223a).e4((TLRPC.User) g0Var.f17556a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.mp.u1(zo0Var.f30223a).X3((TLRPC.Chat) g0Var.f17556a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.mp.u1(zo0Var.f30223a).b4((TLRPC.EncryptedChat) g0Var.f17556a, true);
            }
        }
        zo0Var.I1.f();
    }
}
