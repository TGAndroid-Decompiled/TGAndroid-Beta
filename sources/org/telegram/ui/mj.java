package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.BooleanCallback {
    public final boolean f35765a;
    public final nj f35766b;

    public mj(nj njVar, boolean z10) {
        this.f35766b = njVar;
        this.f35765a = z10;
    }

    @Override
    public final void run(boolean z10) {
        zn znVar = this.f35766b.f36059b;
        if (z10) {
            TLRPC.User user = znVar.f40326f;
            boolean z11 = this.f35765a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new lj(1, this, z11));
                return;
            }
        }
        znVar.qa(znVar.f40306d4, z10);
    }
}
