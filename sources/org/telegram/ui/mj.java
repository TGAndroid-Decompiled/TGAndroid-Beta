package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.BooleanCallback {
    public final boolean f38721a;
    public final nj f38722b;

    public mj(nj njVar, boolean z10) {
        this.f38722b = njVar;
        this.f38721a = z10;
    }

    @Override
    public final void run(boolean z10) {
        co coVar = this.f38722b.f38968b;
        if (z10) {
            TLRPC.User user = coVar.f35250f;
            boolean z11 = this.f38721a;
            if (user != null || z11) {
                coVar.getMessagesStorage().getMessagesCount(coVar.T5, new lj(1, this, z11));
                return;
            }
        }
        coVar.qa(coVar.f35229d4, z10);
    }
}
