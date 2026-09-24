package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.BooleanCallback {
    public final boolean f34801a;
    public final kj f34802b;

    public jj(kj kjVar, boolean z10) {
        this.f34802b = kjVar;
        this.f34801a = z10;
    }

    @Override
    public final void run(boolean z10) {
        wn wnVar = this.f34802b.f35064b;
        if (z10) {
            TLRPC.User user = wnVar.f39456f;
            boolean z11 = this.f34801a;
            if (user != null || z11) {
                wnVar.getMessagesStorage().getMessagesCount(wnVar.T5, new ij(1, this, z11));
                return;
            }
        }
        wnVar.qa(wnVar.f39436d4, z10);
    }
}
