package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class dj implements MessagesStorage.IntCallback {
    public final int f36399a;
    public final boolean f36400b;
    public final Object f36401c;

    public dj(int i10, Object obj, boolean z10) {
        this.f36399a = i10;
        this.f36401c = obj;
        this.f36400b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f36399a) {
            case 0:
                qn qnVar = ((fj) this.f36401c).f37019b;
                if (i10 > 0 && qnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar);
                    if (this.f36400b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, qnVar.f40675ea).j();
                    return;
                }
                return;
            default:
                ej ejVar = (ej) this.f36401c;
                qn qnVar2 = ejVar.f36676b.f37019b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = qnVar2.e;
                    TLRPC.User user = qnVar2.f40678f;
                    boolean z10 = this.f36400b;
                    org.telegram.ui.Components.f5.r(qnVar2, true, chat, user, false, false, false, z10, new b1(ejVar, z10));
                    return;
                }
                qnVar2.va(qnVar2.f40658d4, true);
                return;
        }
    }
}
