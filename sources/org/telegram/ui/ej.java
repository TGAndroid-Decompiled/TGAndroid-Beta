package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ej implements MessagesStorage.BooleanCallback {
    public final boolean f36671a;
    public final fj f36672b;

    public ej(fj fjVar, boolean z10) {
        this.f36672b = fjVar;
        this.f36671a = z10;
    }

    @Override
    public final void run(boolean z10) {
        qn qnVar = this.f36672b.f37023b;
        if (z10) {
            TLRPC.User user = qnVar.f40679f;
            boolean z11 = this.f36671a;
            if (user != null || z11) {
                qnVar.getMessagesStorage().getMessagesCount(qnVar.T5, new dj(1, this, z11));
                return;
            }
        }
        qnVar.va(qnVar.f40659d4, z10);
    }
}
