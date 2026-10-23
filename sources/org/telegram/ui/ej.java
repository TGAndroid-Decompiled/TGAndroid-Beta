package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ej implements MessagesStorage.BooleanCallback {
    public final boolean f36979a;
    public final fj f36980b;

    public ej(fj fjVar, boolean z10) {
        this.f36980b = fjVar;
        this.f36979a = z10;
    }

    @Override
    public final void run(boolean z10) {
        sn snVar = this.f36980b.f37343b;
        if (z10) {
            TLRPC.User user = snVar.f41512f;
            boolean z11 = this.f36979a;
            if (user != null || z11) {
                snVar.getMessagesStorage().getMessagesCount(snVar.f41519f6, new dj(1, this, z11));
                return;
            }
        }
        snVar.va(snVar.f41638p4, z10);
    }
}
