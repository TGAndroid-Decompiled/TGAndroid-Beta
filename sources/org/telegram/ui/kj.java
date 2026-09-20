package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class kj implements MessagesStorage.IntCallback {
    public final int f35195a;
    public final boolean f35196b;
    public final Object f35197c;

    public kj(int i10, Object obj, boolean z10) {
        this.f35195a = i10;
        this.f35197c = obj;
        this.f35196b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f35195a) {
            case 0:
                zn znVar = ((mj) this.f35197c).f35746b;
                if (i10 > 0 && znVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(znVar);
                    if (this.f35196b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, znVar.f40303ea).j();
                    return;
                }
                return;
            default:
                lj ljVar = (lj) this.f35197c;
                zn znVar2 = ljVar.f35458b.f35746b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = znVar2.e;
                    TLRPC.User user = znVar2.f40305f;
                    boolean z10 = this.f35196b;
                    org.telegram.ui.Components.d5.s(znVar2, true, chat, user, false, false, false, z10, new y0(ljVar, z10));
                    return;
                }
                znVar2.qa(znVar2.f40285d4, true);
                return;
        }
    }
}
