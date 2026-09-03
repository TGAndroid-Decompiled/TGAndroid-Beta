package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class hj implements MessagesStorage.IntCallback {
    public final int f37401a;
    public final boolean f37402b;
    public final Object f37403c;

    public hj(int i10, Object obj, boolean z4) {
        this.f37401a = i10;
        this.f37403c = obj;
        this.f37402b = z4;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.pc pcVar;
        switch (this.f37401a) {
            case 0:
                xn xnVar = ((jj) this.f37403c).f38068b;
                if (i10 > 0 && xnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
                    if (this.f37402b) {
                        pcVar = org.telegram.ui.Components.pc.D;
                    } else {
                        pcVar = org.telegram.ui.Components.pc.F;
                    }
                    a02.m(pcVar, i10, 0, 0, xnVar.f43114ba).j();
                    return;
                }
                return;
            default:
                ij ijVar = (ij) this.f37403c;
                xn xnVar2 = ijVar.f37717b.f38068b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = xnVar2.f43143e;
                    TLRPC.User user = xnVar2.f43156f;
                    boolean z4 = this.f37402b;
                    org.telegram.ui.Components.z4.s(xnVar2, true, chat, user, false, false, false, z4, new a1(ijVar, z4));
                    return;
                }
                xnVar2.qa(xnVar2.f43094a4, true);
                return;
        }
    }
}
