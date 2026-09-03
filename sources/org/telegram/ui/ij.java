package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ij implements MessagesStorage.BooleanCallback {
    public final boolean f37716a;
    public final jj f37717b;

    public ij(jj jjVar, boolean z4) {
        this.f37717b = jjVar;
        this.f37716a = z4;
    }

    @Override
    public final void run(boolean z4) {
        xn xnVar = this.f37717b.f38068b;
        if (z4) {
            TLRPC.User user = xnVar.f43156f;
            boolean z10 = this.f37716a;
            if (user != null || z10) {
                xnVar.getMessagesStorage().getMessagesCount(xnVar.Q5, new hj(1, this, z10));
                return;
            }
        }
        xnVar.qa(xnVar.f43094a4, z4);
    }
}
