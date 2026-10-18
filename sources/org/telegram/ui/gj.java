package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class gj implements MessagesStorage.BooleanCallback {
    public final boolean f37222a;
    public final hj f37223b;

    public gj(hj hjVar, boolean z10) {
        this.f37223b = hjVar;
        this.f37222a = z10;
    }

    @Override
    public final void run(boolean z10) {
        sn snVar = this.f37223b.f37584b;
        if (z10) {
            TLRPC.User user = snVar.f41229f;
            boolean z11 = this.f37222a;
            if (user != null || z11) {
                snVar.getMessagesStorage().getMessagesCount(snVar.T5, new fj(1, this, z11));
                return;
            }
        }
        snVar.va(snVar.f41209d4, z10);
    }
}
