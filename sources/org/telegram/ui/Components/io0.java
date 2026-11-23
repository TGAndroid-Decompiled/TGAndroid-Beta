package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class io0 implements jg.f0 {
    public final ap0 f36297a;

    public io0(ap0 ap0Var) {
        this.f36297a = ap0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLObject tLObject = ((jg.g0) arrayList.get(i7)).f17488a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.v3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        ap0 ap0Var = this.f36297a;
        ap0Var.A2 = arrayList;
        for (int i10 = 0; i10 < ap0Var.A2.size(); i10++) {
            jg.g0 g0Var = (jg.g0) ap0Var.A2.get(i10);
            TLObject tLObject2 = g0Var.f17488a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.np.u1(ap0Var.f30173a).e4((TLRPC.User) g0Var.f17488a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.np.u1(ap0Var.f30173a).X3((TLRPC.Chat) g0Var.f17488a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.np.u1(ap0Var.f30173a).b4((TLRPC.EncryptedChat) g0Var.f17488a, true);
            }
        }
        ap0Var.I1.f();
    }
}
