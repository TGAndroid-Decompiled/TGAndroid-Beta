package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class hj implements MessagesStorage.IntCallback {
    public final int f34887a;
    public final boolean f34888b;
    public final Object f34889c;

    public hj(int i10, Object obj, boolean z4) {
        this.f34887a = i10;
        this.f34889c = obj;
        this.f34888b = z4;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.pc pcVar;
        switch (this.f34887a) {
            case 0:
                xn xnVar = ((jj) this.f34889c).f35363b;
                if (i10 > 0 && xnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
                    if (this.f34888b) {
                        pcVar = org.telegram.ui.Components.pc.D;
                    } else {
                        pcVar = org.telegram.ui.Components.pc.F;
                    }
                    a02.m(pcVar, i10, 0, 0, xnVar.f39968ba).j();
                    return;
                }
                return;
            default:
                ij ijVar = (ij) this.f34889c;
                xn xnVar2 = ijVar.f35132b.f35363b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = xnVar2.e;
                    TLRPC.User user = xnVar2.f40009f;
                    boolean z4 = this.f34888b;
                    org.telegram.ui.Components.z4.s(xnVar2, true, chat, user, false, false, false, z4, new a1(ijVar, z4));
                    return;
                }
                xnVar2.qa(xnVar2.f39948a4, true);
                return;
        }
    }
}
