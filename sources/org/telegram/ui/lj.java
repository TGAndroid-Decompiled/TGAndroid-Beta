package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class lj implements MessagesStorage.BooleanCallback {
    public final boolean f35362a;
    public final mj f35363b;

    public lj(mj mjVar, boolean z10) {
        this.f35363b = mjVar;
        this.f35362a = z10;
    }

    @Override
    public final void run(boolean z10) {
        xn xnVar = this.f35363b.f35714b;
        if (z10) {
            TLRPC.User user = xnVar.f39752f;
            boolean z11 = this.f35362a;
            if (user != null || z11) {
                xnVar.getMessagesStorage().getMessagesCount(xnVar.T5, new kj(1, this, z11));
                return;
            }
        }
        xnVar.qa(xnVar.f39732d4, z10);
    }
}
