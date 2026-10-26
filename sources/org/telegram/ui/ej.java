package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ej implements MessagesStorage.IntCallback {
    public final int f39125a;
    public final boolean f39126b;
    public final Object f39127c;

    public ej(int i10, Object obj, boolean z10) {
        this.f39125a = i10;
        this.f39127c = obj;
        this.f39126b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.vc vcVar;
        switch (this.f39125a) {
            case 0:
                un unVar = ((gj) this.f39127c).f39709b;
                if (i10 > 0 && unVar.getParentActivity() != null) {
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar);
                    if (this.f39126b) {
                        vcVar = org.telegram.ui.Components.vc.G;
                    } else {
                        vcVar = org.telegram.ui.Components.vc.I;
                    }
                    b02.m(vcVar, i10, 0, 0, unVar.f44388qa).j();
                    return;
                }
                return;
            default:
                fj fjVar = (fj) this.f39127c;
                un unVar2 = fjVar.f39398b.f39709b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = unVar2.e;
                    TLRPC.User user = unVar2.f44245f;
                    boolean z10 = this.f39126b;
                    org.telegram.ui.Components.g5.r(unVar2, true, chat, user, false, false, false, z10, new y0(fjVar, z10));
                    return;
                }
                unVar2.Aa(unVar2.f44373p4, true);
                return;
        }
    }
}
