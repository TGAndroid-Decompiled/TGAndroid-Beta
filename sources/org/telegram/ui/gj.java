package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class gj implements MessagesStorage.BooleanCallback {
    public final boolean f37252a;
    public final hj f37253b;

    public gj(hj hjVar, boolean z10) {
        this.f37253b = hjVar;
        this.f37252a = z10;
    }

    @Override
    public final void run(boolean z10) {
        sn snVar = this.f37253b.f37566b;
        if (z10) {
            TLRPC.User user = snVar.f41208f;
            boolean z11 = this.f37252a;
            if (user != null || z11) {
                snVar.getMessagesStorage().getMessagesCount(snVar.T5, new fj(1, this, z11));
                return;
            }
        }
        snVar.va(snVar.f41188d4, z10);
    }
}
