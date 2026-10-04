package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class kj implements MessagesStorage.BooleanCallback {
    public final boolean f37993a;
    public final lj f37994b;

    public kj(lj ljVar, boolean z10) {
        this.f37994b = ljVar;
        this.f37993a = z10;
    }

    @Override
    public final void run(boolean z10) {
        yn ynVar = this.f37994b.f38279b;
        if (z10) {
            TLRPC.User user = ynVar.f43327f;
            boolean z11 = this.f37993a;
            if (user != null || z11) {
                ynVar.getMessagesStorage().getMessagesCount(ynVar.R5, new jj(1, this, z11));
                return;
            }
        }
        ynVar.pa(ynVar.f43280b4, z10);
    }
}
