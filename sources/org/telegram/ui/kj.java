package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class kj implements MessagesStorage.BooleanCallback {
    public final boolean f37998a;
    public final lj f37999b;

    public kj(lj ljVar, boolean z10) {
        this.f37999b = ljVar;
        this.f37998a = z10;
    }

    @Override
    public final void run(boolean z10) {
        yn ynVar = this.f37999b.f38284b;
        if (z10) {
            TLRPC.User user = ynVar.f43334f;
            boolean z11 = this.f37998a;
            if (user != null || z11) {
                ynVar.getMessagesStorage().getMessagesCount(ynVar.R5, new jj(1, this, z11));
                return;
            }
        }
        ynVar.pa(ynVar.f43287b4, z10);
    }
}
