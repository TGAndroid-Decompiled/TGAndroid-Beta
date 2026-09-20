package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class lj implements MessagesStorage.BooleanCallback {
    public final boolean f35457a;
    public final mj f35458b;

    public lj(mj mjVar, boolean z10) {
        this.f35458b = mjVar;
        this.f35457a = z10;
    }

    @Override
    public final void run(boolean z10) {
        zn znVar = this.f35458b.f35746b;
        if (z10) {
            TLRPC.User user = znVar.f40305f;
            boolean z11 = this.f35457a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new kj(1, this, z11));
                return;
            }
        }
        znVar.qa(znVar.f40285d4, z10);
    }
}
