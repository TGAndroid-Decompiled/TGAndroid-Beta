package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class dj implements MessagesStorage.IntCallback {
    public final int f36400a;
    public final boolean f36401b;
    public final Object f36402c;

    public dj(int i10, Object obj, boolean z10) {
        this.f36400a = i10;
        this.f36402c = obj;
        this.f36401b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f36400a) {
            case 0:
                qn qnVar = ((fj) this.f36402c).f37013b;
                if (i10 > 0 && qnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar);
                    if (this.f36401b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, qnVar.f40667ea).j();
                    return;
                }
                return;
            default:
                ej ejVar = (ej) this.f36402c;
                qn qnVar2 = ejVar.f36662b.f37013b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = qnVar2.e;
                    TLRPC.User user = qnVar2.f40670f;
                    boolean z10 = this.f36401b;
                    org.telegram.ui.Components.f5.r(qnVar2, true, chat, user, false, false, false, z10, new b1(ejVar, z10));
                    return;
                }
                qnVar2.va(qnVar2.f40650d4, true);
                return;
        }
    }
}
