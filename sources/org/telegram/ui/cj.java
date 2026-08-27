package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

public final class cj implements MessagesStorage.BooleanCallback {

    public final boolean f37102a;

    public final dj f37103b;

    public cj(dj djVar, boolean z10) {
        this.f37103b = djVar;
        this.f37102a = z10;
    }

    @Override
    public final void run(boolean z10) {
        rn rnVar = this.f37103b.f37415b;
        if (z10) {
            TLRPC.User user = rnVar.f42039f;
            boolean z11 = this.f37102a;
            if (user != null || z11) {
                rnVar.getMessagesStorage().getMessagesCount(rnVar.P5, new bj(1, this, z11));
                return;
            }
        }
        rnVar.qa(rnVar.Z3, z10);
    }
}
