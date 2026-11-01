package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mj implements org.telegram.messenger.as {
    public final boolean f39542a;
    public final nj f39543b;

    public mj(nj njVar, boolean z10) {
        this.f39543b = njVar;
        this.f39542a = z10;
    }

    @Override
    public final void i(boolean z10) {
        un unVar = this.f39543b.f39917b;
        if (z10) {
            TLRPC.User user = unVar.f42054f;
            boolean z11 = this.f39542a;
            if (user != null || z11) {
                org.telegram.messenger.is messagesStorage = unVar.getMessagesStorage();
                messagesStorage.f16331a.c(new org.telegram.messenger.mr(messagesStorage, unVar.f42108j6, new lj(1, this, z11), 0));
                return;
            }
        }
        unVar.La(unVar.f42205r4, z10);
    }
}
