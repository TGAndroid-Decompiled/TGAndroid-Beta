package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class nj implements MessagesStorage.BooleanCallback {
    public final boolean f40221a;
    public final oj f40222b;

    public nj(oj ojVar, boolean z10) {
        this.f40222b = ojVar;
        this.f40221a = z10;
    }

    @Override
    public final void run(boolean z10) {
        zn znVar = this.f40222b.f40543b;
        if (z10) {
            TLRPC.User user = znVar.f44763f;
            boolean z11 = this.f40221a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new mj(1, this, z11));
                return;
            }
        }
        znVar.va(znVar.f44742d4, z10);
    }
}
