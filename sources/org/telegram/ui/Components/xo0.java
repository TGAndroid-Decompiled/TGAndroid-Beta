package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xo0 implements zf.x {
    public final pp0 f32618a;

    public xo0(pp0 pp0Var) {
        this.f32618a = pp0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLObject tLObject = ((zf.y) arrayList.get(i10)).f55696a;
            if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.w3.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        pp0 pp0Var = this.f32618a;
        pp0Var.f29503w2 = arrayList;
        for (int i11 = 0; i11 < pp0Var.f29503w2.size(); i11++) {
            zf.y yVar = (zf.y) pp0Var.f29503w2.get(i11);
            TLObject tLObject2 = yVar.f55696a;
            if (tLObject2 instanceof TLRPC.User) {
                org.telegram.messenger.wp.r1(pp0Var.f21584a).U3((TLRPC.User) yVar.f55696a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                org.telegram.messenger.wp.r1(pp0Var.f21584a).N3((TLRPC.Chat) yVar.f55696a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                org.telegram.messenger.wp.r1(pp0Var.f21584a).R3((TLRPC.EncryptedChat) yVar.f55696a, true);
            }
        }
        pp0Var.E1.f();
    }
}
