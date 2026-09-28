package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.BooleanCallback {
    public final boolean f34816a;
    public final kj f34817b;

    public jj(kj kjVar, boolean z10) {
        this.f34817b = kjVar;
        this.f34816a = z10;
    }

    @Override
    public final void run(boolean z10) {
        wn wnVar = this.f34817b.f35078b;
        if (z10) {
            TLRPC.User user = wnVar.f39472f;
            boolean z11 = this.f34816a;
            if (user != null || z11) {
                wnVar.getMessagesStorage().getMessagesCount(wnVar.T5, new ij(1, this, z11));
                return;
            }
        }
        wnVar.qa(wnVar.f39452d4, z10);
    }
}
