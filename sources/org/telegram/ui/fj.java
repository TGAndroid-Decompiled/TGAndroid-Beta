package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class fj implements MessagesStorage.BooleanCallback {
    public final boolean f39394a;
    public final gj f39395b;

    public fj(gj gjVar, boolean z10) {
        this.f39395b = gjVar;
        this.f39394a = z10;
    }

    @Override
    public final void run(boolean z10) {
        un unVar = this.f39395b.f39706b;
        if (z10) {
            TLRPC.User user = unVar.f44242f;
            boolean z11 = this.f39394a;
            if (user != null || z11) {
                unVar.getMessagesStorage().getMessagesCount(unVar.f44249f6, new ej(1, this, z11));
                return;
            }
        }
        unVar.Aa(unVar.f44370p4, z10);
    }
}
