package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.BooleanCallback {
    public final boolean f38720a;
    public final nj f38721b;

    public mj(nj njVar, boolean z10) {
        this.f38721b = njVar;
        this.f38720a = z10;
    }

    @Override
    public final void run(boolean z10) {
        co coVar = this.f38721b.f38967b;
        if (z10) {
            TLRPC.User user = coVar.f35249f;
            boolean z11 = this.f38720a;
            if (user != null || z11) {
                coVar.getMessagesStorage().getMessagesCount(coVar.T5, new lj(1, this, z11));
                return;
            }
        }
        coVar.qa(coVar.f35228d4, z10);
    }
}
