package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mj implements org.telegram.messenger.zr {
    public final boolean f39711a;
    public final nj f39712b;

    public mj(nj njVar, boolean z10) {
        this.f39712b = njVar;
        this.f39711a = z10;
    }

    @Override
    public final void i(boolean z10) {
        un unVar = this.f39712b.f39956b;
        if (z10) {
            TLRPC.User user = unVar.f42243f;
            boolean z11 = this.f39711a;
            if (user != null || z11) {
                org.telegram.messenger.hs messagesStorage = unVar.getMessagesStorage();
                messagesStorage.f15938a.c(new org.telegram.messenger.lr(messagesStorage, unVar.f42297j6, new lj(1, this, z11), 0));
                return;
            }
        }
        unVar.Ga(unVar.f42394r4, z10);
    }
}
