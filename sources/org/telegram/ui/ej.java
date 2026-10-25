package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ej implements MessagesStorage.IntCallback {
    public final int f39122a;
    public final boolean f39123b;
    public final Object f39124c;

    public ej(int i10, Object obj, boolean z10) {
        this.f39122a = i10;
        this.f39124c = obj;
        this.f39123b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.vc vcVar;
        switch (this.f39122a) {
            case 0:
                un unVar = ((gj) this.f39124c).f39706b;
                if (i10 > 0 && unVar.getParentActivity() != null) {
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar);
                    if (this.f39123b) {
                        vcVar = org.telegram.ui.Components.vc.G;
                    } else {
                        vcVar = org.telegram.ui.Components.vc.I;
                    }
                    b02.m(vcVar, i10, 0, 0, unVar.f44385qa).j();
                    return;
                }
                return;
            default:
                fj fjVar = (fj) this.f39124c;
                un unVar2 = fjVar.f39395b.f39706b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = unVar2.e;
                    TLRPC.User user = unVar2.f44242f;
                    boolean z10 = this.f39123b;
                    org.telegram.ui.Components.g5.r(unVar2, true, chat, user, false, false, false, z10, new y0(fjVar, z10));
                    return;
                }
                unVar2.Aa(unVar2.f44370p4, true);
                return;
        }
    }
}
