package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class fj implements MessagesStorage.BooleanCallback {
    public final boolean f39397a;
    public final gj f39398b;

    public fj(gj gjVar, boolean z10) {
        this.f39398b = gjVar;
        this.f39397a = z10;
    }

    @Override
    public final void run(boolean z10) {
        un unVar = this.f39398b.f39709b;
        if (z10) {
            TLRPC.User user = unVar.f44245f;
            boolean z11 = this.f39397a;
            if (user != null || z11) {
                unVar.getMessagesStorage().getMessagesCount(unVar.f44252f6, new ej(1, this, z11));
                return;
            }
        }
        unVar.Aa(unVar.f44373p4, z10);
    }
}
