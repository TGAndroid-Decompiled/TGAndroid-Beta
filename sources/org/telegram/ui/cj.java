package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class cj implements MessagesStorage.IntCallback {
    public final int f37152a;
    public final boolean f37153b;
    public final Object f37154c;

    public cj(int i10, Object obj, boolean z10) {
        this.f37152a = i10;
        this.f37154c = obj;
        this.f37153b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.sc scVar;
        switch (this.f37152a) {
            case 0:
                tn tnVar = ((ej) this.f37154c).f37848b;
                if (i10 > 0 && tnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar);
                    if (this.f37153b) {
                        scVar = org.telegram.ui.Components.sc.C;
                    } else {
                        scVar = org.telegram.ui.Components.sc.E;
                    }
                    a02.m(scVar, i10, 0, 0, tnVar.f42746aa).j();
                    return;
                }
                return;
            default:
                dj djVar = (dj) this.f37154c;
                tn tnVar2 = djVar.f37549b.f37848b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = tnVar2.f42787e;
                    TLRPC.User user = tnVar2.f42801f;
                    boolean z10 = this.f37153b;
                    org.telegram.ui.Components.c5.s(tnVar2, true, chat, user, false, false, false, z10, new c1(djVar, z10));
                    return;
                }
                tnVar2.qa(tnVar2.Z3, true);
                return;
        }
    }
}
