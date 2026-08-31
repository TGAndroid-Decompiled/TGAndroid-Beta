package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class hj implements MessagesStorage.IntCallback {
    public final int f37521a;
    public final boolean f37522b;
    public final Object f37523c;

    public hj(int i10, Object obj, boolean z4) {
        this.f37521a = i10;
        this.f37523c = obj;
        this.f37522b = z4;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.pc pcVar;
        switch (this.f37521a) {
            case 0:
                xn xnVar = ((jj) this.f37523c).f38171b;
                if (i10 > 0 && xnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
                    if (this.f37522b) {
                        pcVar = org.telegram.ui.Components.pc.D;
                    } else {
                        pcVar = org.telegram.ui.Components.pc.F;
                    }
                    a02.m(pcVar, i10, 0, 0, xnVar.f43136ba).j();
                    return;
                }
                return;
            default:
                ij ijVar = (ij) this.f37523c;
                xn xnVar2 = ijVar.f37868b.f38171b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = xnVar2.f43165e;
                    TLRPC.User user = xnVar2.f43178f;
                    boolean z4 = this.f37522b;
                    org.telegram.ui.Components.z4.s(xnVar2, true, chat, user, false, false, false, z4, new a1(ijVar, z4));
                    return;
                }
                xnVar2.qa(xnVar2.f43116a4, true);
                return;
        }
    }
}
