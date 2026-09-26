package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.BooleanCallback {
    public final boolean f34815a;
    public final kj f34816b;

    public jj(kj kjVar, boolean z10) {
        this.f34816b = kjVar;
        this.f34815a = z10;
    }

    @Override
    public final void run(boolean z10) {
        wn wnVar = this.f34816b.f35077b;
        if (z10) {
            TLRPC.User user = wnVar.f39471f;
            boolean z11 = this.f34815a;
            if (user != null || z11) {
                wnVar.getMessagesStorage().getMessagesCount(wnVar.T5, new ij(1, this, z11));
                return;
            }
        }
        wnVar.qa(wnVar.f39451d4, z10);
    }
}
