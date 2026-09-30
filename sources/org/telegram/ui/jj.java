package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.BooleanCallback {
    public final boolean f34908a;
    public final kj f34909b;

    public jj(kj kjVar, boolean z10) {
        this.f34909b = kjVar;
        this.f34908a = z10;
    }

    @Override
    public final void run(boolean z10) {
        wn wnVar = this.f34909b.f35167b;
        if (z10) {
            TLRPC.User user = wnVar.f39564f;
            boolean z11 = this.f34908a;
            if (user != null || z11) {
                wnVar.getMessagesStorage().getMessagesCount(wnVar.T5, new ij(1, this, z11));
                return;
            }
        }
        wnVar.qa(wnVar.f39544d4, z10);
    }
}
