package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ej implements MessagesStorage.BooleanCallback {
    public final boolean f36919a;
    public final fj f36920b;

    public ej(fj fjVar, boolean z10) {
        this.f36920b = fjVar;
        this.f36919a = z10;
    }

    @Override
    public final void run(boolean z10) {
        sn snVar = this.f36920b.f37347b;
        if (z10) {
            TLRPC.User user = snVar.f41509f;
            boolean z11 = this.f36919a;
            if (user != null || z11) {
                snVar.getMessagesStorage().getMessagesCount(snVar.f41516f6, new dj(1, this, z11));
                return;
            }
        }
        snVar.va(snVar.f41635p4, z10);
    }
}
