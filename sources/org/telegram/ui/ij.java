package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ij implements MessagesStorage.BooleanCallback {
    public final boolean f35131a;
    public final jj f35132b;

    public ij(jj jjVar, boolean z4) {
        this.f35132b = jjVar;
        this.f35131a = z4;
    }

    @Override
    public final void run(boolean z4) {
        xn xnVar = this.f35132b.f35363b;
        if (z4) {
            TLRPC.User user = xnVar.f40009f;
            boolean z10 = this.f35131a;
            if (user != null || z10) {
                xnVar.getMessagesStorage().getMessagesCount(xnVar.Q5, new hj(1, this, z10));
                return;
            }
        }
        xnVar.qa(xnVar.f39948a4, z4);
    }
}
