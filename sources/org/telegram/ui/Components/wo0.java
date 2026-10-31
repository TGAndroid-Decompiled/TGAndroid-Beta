package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wo0 implements zf.x {
    public final op0 f32223a;

    public wo0(op0 op0Var) {
        this.f32223a = op0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLObject tLObject = ((zf.y) arrayList.get(i10)).f55678a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.w3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        op0 op0Var = this.f32223a;
        op0Var.f29148w2 = arrayList;
        for (int i11 = 0; i11 < op0Var.f29148w2.size(); i11++) {
            zf.y yVar = (zf.y) op0Var.f29148w2.get(i11);
            TLObject tLObject2 = yVar.f55678a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.vp.r1(op0Var.f21583a).U3((TLRPC.User) yVar.f55678a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.vp.r1(op0Var.f21583a).N3((TLRPC.Chat) yVar.f55678a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.vp.r1(op0Var.f21583a).R3((TLRPC.EncryptedChat) yVar.f55678a, true);
            }
        }
        op0Var.E1.f();
    }
}
