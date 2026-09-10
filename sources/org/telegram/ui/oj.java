package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class oj implements MessagesStorage.BooleanCallback {
    public final boolean f35503a;
    public final pj f35504b;

    public oj(pj pjVar, boolean z10) {
        this.f35504b = pjVar;
        this.f35503a = z10;
    }

    @Override
    public final void run(boolean z10) {
        eo eoVar = this.f35504b.f35851b;
        if (z10) {
            TLRPC.User user = eoVar.f32318f;
            boolean z11 = this.f35503a;
            if (user != null || z11) {
                eoVar.getMessagesStorage().getMessagesCount(eoVar.T5, new nj(1, this, z11));
                return;
            }
        }
        eoVar.qa(eoVar.f32298d4, z10);
    }
}
