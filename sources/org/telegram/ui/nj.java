package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class nj implements MessagesStorage.BooleanCallback {
    public final boolean f40223a;
    public final oj f40224b;

    public nj(oj ojVar, boolean z10) {
        this.f40224b = ojVar;
        this.f40223a = z10;
    }

    @Override
    public final void run(boolean z10) {
        zn znVar = this.f40224b.f40545b;
        if (z10) {
            TLRPC.User user = znVar.f44765f;
            boolean z11 = this.f40223a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new mj(1, this, z11));
                return;
            }
        }
        znVar.va(znVar.f44744d4, z10);
    }
}
