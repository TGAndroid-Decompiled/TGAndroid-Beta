package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class lj implements MessagesStorage.BooleanCallback {
    public final boolean f35388a;
    public final mj f35389b;

    public lj(mj mjVar, boolean z10) {
        this.f35389b = mjVar;
        this.f35388a = z10;
    }

    @Override
    public final void run(boolean z10) {
        zn znVar = this.f35389b.f35681b;
        if (z10) {
            TLRPC.User user = znVar.f40263f;
            boolean z11 = this.f35388a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new kj(1, this, z11));
                return;
            }
        }
        znVar.qa(znVar.f40243d4, z10);
    }
}
