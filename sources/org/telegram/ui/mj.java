package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.IntCallback {
    public final int f39990a;
    public final boolean f39991b;
    public final Object f39992c;

    public mj(int i10, Object obj, boolean z10) {
        this.f39990a = i10;
        this.f39992c = obj;
        this.f39991b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.zc zcVar;
        switch (this.f39990a) {
            case 0:
                zn znVar = ((oj) this.f39992c).f40590b;
                if (i10 > 0 && znVar.getParentActivity() != null) {
                    org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(znVar);
                    if (this.f39991b) {
                        zcVar = org.telegram.ui.Components.zc.G;
                    } else {
                        zcVar = org.telegram.ui.Components.zc.I;
                    }
                    a02.m(zcVar, i10, 0, 0, znVar.f44796ea).j();
                    return;
                }
                return;
            default:
                nj njVar = (nj) this.f39992c;
                zn znVar2 = njVar.f40300b.f40590b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = znVar2.f44786e;
                    TLRPC.User user = znVar2.f44798f;
                    boolean z10 = this.f39991b;
                    org.telegram.ui.Components.g5.r(znVar2, true, chat, user, false, false, false, z10, new y0(njVar, z10));
                    return;
                }
                znVar2.va(znVar2.f44777d4, true);
                return;
        }
    }
}
