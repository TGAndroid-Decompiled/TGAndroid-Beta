package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.BooleanCallback {
    public final boolean f34817a;
    public final kj f34818b;

    public jj(kj kjVar, boolean z10) {
        this.f34818b = kjVar;
        this.f34817a = z10;
    }

    @Override
    public final void run(boolean z10) {
        wn wnVar = this.f34818b.f35080b;
        if (z10) {
            TLRPC.User user = wnVar.f39471f;
            boolean z11 = this.f34817a;
            if (user != null || z11) {
                wnVar.getMessagesStorage().getMessagesCount(wnVar.T5, new ij(1, this, z11));
                return;
            }
        }
        wnVar.qa(wnVar.f39451d4, z10);
    }
}
