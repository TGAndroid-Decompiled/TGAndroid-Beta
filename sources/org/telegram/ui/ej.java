package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ej implements MessagesStorage.BooleanCallback {
    public final boolean f36661a;
    public final fj f36662b;

    public ej(fj fjVar, boolean z10) {
        this.f36662b = fjVar;
        this.f36661a = z10;
    }

    @Override
    public final void run(boolean z10) {
        qn qnVar = this.f36662b.f37013b;
        if (z10) {
            TLRPC.User user = qnVar.f40670f;
            boolean z11 = this.f36661a;
            if (user != null || z11) {
                qnVar.getMessagesStorage().getMessagesCount(qnVar.T5, new dj(1, this, z11));
                return;
            }
        }
        qnVar.va(qnVar.f40650d4, z10);
    }
}
