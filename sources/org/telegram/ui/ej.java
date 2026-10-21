package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ej implements MessagesStorage.BooleanCallback {
    public final boolean f36668a;
    public final fj f36669b;

    public ej(fj fjVar, boolean z10) {
        this.f36669b = fjVar;
        this.f36668a = z10;
    }

    @Override
    public final void run(boolean z10) {
        qn qnVar = this.f36669b.f37020b;
        if (z10) {
            TLRPC.User user = qnVar.f40676f;
            boolean z11 = this.f36668a;
            if (user != null || z11) {
                qnVar.getMessagesStorage().getMessagesCount(qnVar.T5, new dj(1, this, z11));
                return;
            }
        }
        qnVar.va(qnVar.f40656d4, z10);
    }
}
