package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class kj implements MessagesStorage.BooleanCallback {
    public final boolean f37992a;
    public final lj f37993b;

    public kj(lj ljVar, boolean z10) {
        this.f37993b = ljVar;
        this.f37992a = z10;
    }

    @Override
    public final void run(boolean z10) {
        yn ynVar = this.f37993b.f38278b;
        if (z10) {
            TLRPC.User user = ynVar.f43326f;
            boolean z11 = this.f37992a;
            if (user != null || z11) {
                ynVar.getMessagesStorage().getMessagesCount(ynVar.R5, new jj(1, this, z11));
                return;
            }
        }
        ynVar.pa(ynVar.f43279b4, z10);
    }
}
