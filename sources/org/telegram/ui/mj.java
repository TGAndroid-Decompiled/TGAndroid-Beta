package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.BooleanCallback {
    public final boolean f38747a;
    public final nj f38748b;

    public mj(nj njVar, boolean z10) {
        this.f38748b = njVar;
        this.f38747a = z10;
    }

    @Override
    public final void run(boolean z10) {
        co coVar = this.f38748b.f38994b;
        if (z10) {
            TLRPC.User user = coVar.f35276f;
            boolean z11 = this.f38747a;
            if (user != null || z11) {
                coVar.getMessagesStorage().getMessagesCount(coVar.T5, new lj(1, this, z11));
                return;
            }
        }
        coVar.qa(coVar.f35255d4, z10);
    }
}
