package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class nj implements MessagesStorage.BooleanCallback {
    public final boolean f40267a;
    public final oj f40268b;

    public nj(oj ojVar, boolean z10) {
        this.f40268b = ojVar;
        this.f40267a = z10;
    }

    @Override
    public final void run(boolean z10) {
        zn znVar = this.f40268b.f40589b;
        if (z10) {
            TLRPC.User user = znVar.f44809f;
            boolean z11 = this.f40267a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new mj(1, this, z11));
                return;
            }
        }
        znVar.va(znVar.f44788d4, z10);
    }
}
