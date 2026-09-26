package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.BooleanCallback {
    public final boolean f34814a;
    public final kj f34815b;

    public jj(kj kjVar, boolean z10) {
        this.f34815b = kjVar;
        this.f34814a = z10;
    }

    @Override
    public final void run(boolean z10) {
        wn wnVar = this.f34815b.f35076b;
        if (z10) {
            TLRPC.User user = wnVar.f39470f;
            boolean z11 = this.f34814a;
            if (user != null || z11) {
                wnVar.getMessagesStorage().getMessagesCount(wnVar.T5, new ij(1, this, z11));
                return;
            }
        }
        wnVar.qa(wnVar.f39450d4, z10);
    }
}
