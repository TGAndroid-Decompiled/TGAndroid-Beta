package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class dj implements MessagesStorage.BooleanCallback {
    public final boolean f37548a;
    public final ej f37549b;

    public dj(ej ejVar, boolean z10) {
        this.f37549b = ejVar;
        this.f37548a = z10;
    }

    @Override
    public final void run(boolean z10) {
        tn tnVar = this.f37549b.f37848b;
        if (z10) {
            TLRPC.User user = tnVar.f42801f;
            boolean z11 = this.f37548a;
            if (user != null || z11) {
                tnVar.getMessagesStorage().getMessagesCount(tnVar.P5, new cj(1, this, z11));
                return;
            }
        }
        tnVar.qa(tnVar.Z3, z10);
    }
}
