package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class kj implements MessagesStorage.BooleanCallback {
    public final boolean f38066a;
    public final lj f38067b;

    public kj(lj ljVar, boolean z10) {
        this.f38067b = ljVar;
        this.f38066a = z10;
    }

    @Override
    public final void run(boolean z10) {
        yn ynVar = this.f38067b.f38338b;
        if (z10) {
            TLRPC.User user = ynVar.f43327f;
            boolean z11 = this.f38066a;
            if (user != null || z11) {
                ynVar.getMessagesStorage().getMessagesCount(ynVar.R5, new jj(1, this, z11));
                return;
            }
        }
        ynVar.pa(ynVar.f43280b4, z10);
    }
}
