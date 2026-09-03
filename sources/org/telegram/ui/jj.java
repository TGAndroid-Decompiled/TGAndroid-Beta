package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.IntCallback {
    public final int f35294a;
    public final boolean f35295b;
    public final Object f35296c;

    public jj(int i10, Object obj, boolean z4) {
        this.f35294a = i10;
        this.f35296c = obj;
        this.f35295b = z4;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.pc pcVar;
        switch (this.f35294a) {
            case 0:
                zn znVar = ((lj) this.f35296c).f35790b;
                if (i10 > 0 && znVar.getParentActivity() != null) {
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar);
                    if (this.f35295b) {
                        pcVar = org.telegram.ui.Components.pc.D;
                    } else {
                        pcVar = org.telegram.ui.Components.pc.F;
                    }
                    a02.m(pcVar, i10, 0, 0, znVar.f40534ba).j();
                    return;
                }
                return;
            default:
                kj kjVar = (kj) this.f35296c;
                zn znVar2 = kjVar.f35550b.f35790b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = znVar2.e;
                    TLRPC.User user = znVar2.f40575f;
                    boolean z4 = this.f35295b;
                    org.telegram.ui.Components.z4.s(znVar2, true, chat, user, false, false, false, z4, new c1(kjVar, z4));
                    return;
                }
                znVar2.qa(znVar2.f40514a4, true);
                return;
        }
    }
}
