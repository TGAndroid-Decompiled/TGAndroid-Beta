package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class nj implements MessagesStorage.BooleanCallback {
    public final boolean f40265a;
    public final oj f40266b;

    public nj(oj ojVar, boolean z10) {
        this.f40266b = ojVar;
        this.f40265a = z10;
    }

    @Override
    public final void run(boolean z10) {
        zn znVar = this.f40266b.f40556b;
        if (z10) {
            TLRPC.User user = znVar.f44764f;
            boolean z11 = this.f40265a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new mj(1, this, z11));
                return;
            }
        }
        znVar.va(znVar.f44743d4, z10);
    }
}
