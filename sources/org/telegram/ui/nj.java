package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class nj implements MessagesStorage.IntCallback {
    public final int f35287a;
    public final boolean f35288b;
    public final Object f35289c;

    public nj(int i10, Object obj, boolean z10) {
        this.f35287a = i10;
        this.f35289c = obj;
        this.f35288b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.vc vcVar;
        switch (this.f35287a) {
            case 0:
                eo eoVar = ((pj) this.f35289c).f35851b;
                if (i10 > 0 && eoVar.getParentActivity() != null) {
                    org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar);
                    if (this.f35288b) {
                        vcVar = org.telegram.ui.Components.vc.G;
                    } else {
                        vcVar = org.telegram.ui.Components.vc.I;
                    }
                    a02.m(vcVar, i10, 0, 0, eoVar.f32316ea).j();
                    return;
                }
                return;
            default:
                oj ojVar = (oj) this.f35289c;
                eo eoVar2 = ojVar.f35504b.f35851b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = eoVar2.e;
                    TLRPC.User user = eoVar2.f32318f;
                    boolean z10 = this.f35288b;
                    org.telegram.ui.Components.d5.s(eoVar2, true, chat, user, false, false, false, z10, new a1(ojVar, z10));
                    return;
                }
                eoVar2.qa(eoVar2.f32298d4, true);
                return;
        }
    }
}
