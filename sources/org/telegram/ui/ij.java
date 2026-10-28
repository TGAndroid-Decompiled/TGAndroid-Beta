package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ij implements MessagesStorage.BooleanCallback {
    public final boolean f40198a;
    public final jj f40199b;

    public ij(jj jjVar, boolean z10) {
        this.f40199b = jjVar;
        this.f40198a = z10;
    }

    @Override
    public final void run(boolean z10) {
        wn wnVar = this.f40199b.f40550b;
        if (z10) {
            TLRPC.User user = wnVar.f45113f;
            boolean z11 = this.f40198a;
            if (user != null || z11) {
                wnVar.getMessagesStorage().getMessagesCount(wnVar.f45168j6, new hj(1, this, z11));
                return;
            }
        }
        wnVar.Da(wnVar.f45241p4, z10);
    }
}
