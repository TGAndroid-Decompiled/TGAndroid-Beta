package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.IntCallback {
    public final int f39930a;
    public final boolean f39931b;
    public final Object f39932c;

    public mj(int i10, Object obj, boolean z10) {
        this.f39930a = i10;
        this.f39932c = obj;
        this.f39931b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.zc zcVar;
        switch (this.f39930a) {
            case 0:
                zn znVar = ((oj) this.f39932c).f40545b;
                if (i10 > 0 && znVar.getParentActivity() != null) {
                    org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(znVar);
                    if (this.f39931b) {
                        zcVar = org.telegram.ui.Components.zc.G;
                    } else {
                        zcVar = org.telegram.ui.Components.zc.I;
                    }
                    a02.m(zcVar, i10, 0, 0, znVar.f44763ea).j();
                    return;
                }
                return;
            default:
                nj njVar = (nj) this.f39932c;
                zn znVar2 = njVar.f40224b.f40545b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = znVar2.f44753e;
                    TLRPC.User user = znVar2.f44765f;
                    boolean z10 = this.f39931b;
                    org.telegram.ui.Components.g5.r(znVar2, true, chat, user, false, false, false, z10, new z0(njVar, z10));
                    return;
                }
                znVar2.va(znVar2.f44744d4, true);
                return;
        }
    }
}
