package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class lj implements MessagesStorage.IntCallback {
    public final int f38377a;
    public final boolean f38378b;
    public final Object f38379c;

    public lj(int i10, Object obj, boolean z10) {
        this.f38377a = i10;
        this.f38379c = obj;
        this.f38378b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.xc xcVar;
        switch (this.f38377a) {
            case 0:
                co coVar = ((nj) this.f38379c).f38968b;
                if (i10 > 0 && coVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar);
                    if (this.f38378b) {
                        xcVar = org.telegram.ui.Components.xc.G;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.I;
                    }
                    a02.m(xcVar, i10, 0, 0, coVar.f35248ea).j();
                    return;
                }
                return;
            default:
                mj mjVar = (mj) this.f38379c;
                co coVar2 = mjVar.f38722b.f38968b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = coVar2.f35238e;
                    TLRPC.User user = coVar2.f35250f;
                    boolean z10 = this.f38378b;
                    org.telegram.ui.Components.e5.s(coVar2, true, chat, user, false, false, false, z10, new z0(mjVar, z10));
                    return;
                }
                coVar2.qa(coVar2.f35229d4, true);
                return;
        }
    }
}
