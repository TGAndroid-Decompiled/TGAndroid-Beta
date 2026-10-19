package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ej implements MessagesStorage.BooleanCallback {
    public final boolean f36675a;
    public final fj f36676b;

    public ej(fj fjVar, boolean z10) {
        this.f36676b = fjVar;
        this.f36675a = z10;
    }

    @Override
    public final void run(boolean z10) {
        qn qnVar = this.f36676b.f37019b;
        if (z10) {
            TLRPC.User user = qnVar.f40678f;
            boolean z11 = this.f36675a;
            if (user != null || z11) {
                qnVar.getMessagesStorage().getMessagesCount(qnVar.T5, new dj(1, this, z11));
                return;
            }
        }
        qnVar.va(qnVar.f40658d4, z10);
    }
}
