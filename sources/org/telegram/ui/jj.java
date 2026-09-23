package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.BooleanCallback {
    public final boolean f34464a;
    public final kj f34465b;

    public jj(kj kjVar, boolean z10) {
        this.f34465b = kjVar;
        this.f34464a = z10;
    }

    @Override
    public final void run(boolean z10) {
        xn xnVar = this.f34465b.f34737b;
        if (z10) {
            TLRPC.User user = xnVar.f39372f;
            boolean z11 = this.f34464a;
            if (user != null || z11) {
                xnVar.getMessagesStorage().getMessagesCount(xnVar.T5, new ij(1, this, z11));
                return;
            }
        }
        xnVar.qa(xnVar.f39352d4, z10);
    }
}
