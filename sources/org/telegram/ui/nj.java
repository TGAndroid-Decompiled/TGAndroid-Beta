package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class nj implements MessagesStorage.BooleanCallback {
    public final boolean f40299a;
    public final oj f40300b;

    public nj(oj ojVar, boolean z10) {
        this.f40300b = ojVar;
        this.f40299a = z10;
    }

    @Override
    public final void run(boolean z10) {
        zn znVar = this.f40300b.f40590b;
        if (z10) {
            TLRPC.User user = znVar.f44798f;
            boolean z11 = this.f40299a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new mj(1, this, z11));
                return;
            }
        }
        znVar.va(znVar.f44777d4, z10);
    }
}
