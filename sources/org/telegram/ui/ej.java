package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ej implements MessagesStorage.BooleanCallback {
    public final boolean f36672a;
    public final fj f36673b;

    public ej(fj fjVar, boolean z10) {
        this.f36673b = fjVar;
        this.f36672a = z10;
    }

    @Override
    public final void run(boolean z10) {
        qn qnVar = this.f36673b.f37024b;
        if (z10) {
            TLRPC.User user = qnVar.f40680f;
            boolean z11 = this.f36672a;
            if (user != null || z11) {
                qnVar.getMessagesStorage().getMessagesCount(qnVar.T5, new dj(1, this, z11));
                return;
            }
        }
        qnVar.va(qnVar.f40660d4, z10);
    }
}
