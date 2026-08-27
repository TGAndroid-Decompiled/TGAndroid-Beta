package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

public final class bj implements MessagesStorage.IntCallback {

    public final int f36841a;

    public final boolean f36842b;

    public final Object f36843c;

    public bj(int i10, Object obj, boolean z10) {
        this.f36841a = i10;
        this.f36843c = obj;
        this.f36842b = z10;
    }

    @Override
    public final void run(int i10) {
        switch (this.f36841a) {
            case 0:
                rn rnVar = ((dj) this.f36843c).f37415b;
                if (i10 > 0 && rnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.mc.a0(rnVar).m(this.f36842b ? org.telegram.ui.Components.lc.C : org.telegram.ui.Components.lc.E, i10, 0, 0, rnVar.f41983aa).j();
                    break;
                }
                break;
            default:
                cj cjVar = (cj) this.f36843c;
                rn rnVar2 = cjVar.f37103b.f37415b;
                if (i10 < 50) {
                    rnVar2.qa(rnVar2.Z3, true);
                } else {
                    TLRPC.Chat chat = rnVar2.f42026e;
                    TLRPC.User user = rnVar2.f42039f;
                    boolean z10 = this.f36842b;
                    org.telegram.ui.Components.y4.s(rnVar2, true, chat, user, false, false, false, z10, new c1(cjVar, z10));
                }
                break;
        }
    }
}
