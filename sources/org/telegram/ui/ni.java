package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ni implements org.telegram.messenger.ir {
    public final boolean f48009a;
    public final oi f48010b;

    public ni(oi oiVar, boolean z10) {
        this.f48010b = oiVar;
        this.f48009a = z10;
    }

    @Override
    public final void o(boolean z10) {
        wm wmVar = this.f48010b.f48298b;
        if (z10) {
            TLRPC.User user = wmVar.f51306f;
            boolean z11 = this.f48009a;
            if (user != null || z11) {
                org.telegram.messenger.qr messagesStorage = wmVar.getMessagesStorage();
                messagesStorage.f24934a.c(new org.telegram.messenger.wq(messagesStorage, wmVar.f51376k6, new mi(1, this, z11), 0));
                return;
            }
        }
        wmVar.Qa(wmVar.f51475s4, z10);
    }
}
