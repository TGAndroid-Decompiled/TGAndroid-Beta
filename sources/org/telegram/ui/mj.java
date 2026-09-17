package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.BooleanCallback {
    public final boolean f38748a;
    public final nj f38749b;

    public mj(nj njVar, boolean z10) {
        this.f38749b = njVar;
        this.f38748a = z10;
    }

    @Override
    public final void run(boolean z10) {
        co coVar = this.f38749b.f38995b;
        if (z10) {
            TLRPC.User user = coVar.f35277f;
            boolean z11 = this.f38748a;
            if (user != null || z11) {
                coVar.getMessagesStorage().getMessagesCount(coVar.T5, new lj(1, this, z11));
                return;
            }
        }
        coVar.qa(coVar.f35256d4, z10);
    }
}
