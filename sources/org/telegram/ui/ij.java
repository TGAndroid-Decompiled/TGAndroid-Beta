package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ij implements MessagesStorage.IntCallback {
    public final int f34151a;
    public final boolean f34152b;
    public final Object f34153c;

    public ij(int i10, Object obj, boolean z10) {
        this.f34151a = i10;
        this.f34153c = obj;
        this.f34152b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f34151a) {
            case 0:
                xn xnVar = ((kj) this.f34153c).f34737b;
                if (i10 > 0 && xnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(xnVar);
                    if (this.f34152b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, xnVar.f39370ea).j();
                    return;
                }
                return;
            default:
                jj jjVar = (jj) this.f34153c;
                xn xnVar2 = jjVar.f34465b.f34737b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = xnVar2.e;
                    TLRPC.User user = xnVar2.f39372f;
                    boolean z10 = this.f34152b;
                    org.telegram.ui.Components.e5.s(xnVar2, true, chat, user, false, false, false, z10, new z0(jjVar, z10));
                    return;
                }
                xnVar2.qa(xnVar2.f39352d4, true);
                return;
        }
    }
}
