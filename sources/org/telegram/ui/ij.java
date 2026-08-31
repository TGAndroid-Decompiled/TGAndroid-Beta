package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ij implements MessagesStorage.BooleanCallback {
    public final boolean f37867a;
    public final jj f37868b;

    public ij(jj jjVar, boolean z4) {
        this.f37868b = jjVar;
        this.f37867a = z4;
    }

    @Override
    public final void run(boolean z4) {
        xn xnVar = this.f37868b.f38171b;
        if (z4) {
            TLRPC.User user = xnVar.f43178f;
            boolean z10 = this.f37867a;
            if (user != null || z10) {
                xnVar.getMessagesStorage().getMessagesCount(xnVar.Q5, new hj(1, this, z10));
                return;
            }
        }
        xnVar.qa(xnVar.f43116a4, z4);
    }
}
