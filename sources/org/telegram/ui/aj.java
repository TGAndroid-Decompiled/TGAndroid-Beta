package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class aj implements MessagesStorage.BooleanCallback {
    public final boolean f36508a;
    public final bj f36509b;

    public aj(bj bjVar, boolean z10) {
        this.f36509b = bjVar;
        this.f36508a = z10;
    }

    @Override
    public final void run(boolean z10) {
        qn qnVar = this.f36509b.f36877b;
        if (z10) {
            TLRPC.User user = qnVar.f41903f;
            boolean z11 = this.f36508a;
            if (user != null || z11) {
                qnVar.getMessagesStorage().getMessagesCount(qnVar.P5, new zi(1, this, z11));
                return;
            }
        }
        qnVar.qa(qnVar.Z3, z10);
    }
}
