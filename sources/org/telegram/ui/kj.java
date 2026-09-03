package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class kj implements MessagesStorage.BooleanCallback {
    public final boolean f35549a;
    public final lj f35550b;

    public kj(lj ljVar, boolean z4) {
        this.f35550b = ljVar;
        this.f35549a = z4;
    }

    @Override
    public final void run(boolean z4) {
        zn znVar = this.f35550b.f35790b;
        if (z4) {
            TLRPC.User user = znVar.f40575f;
            boolean z10 = this.f35549a;
            if (user != null || z10) {
                znVar.getMessagesStorage().getMessagesCount(znVar.Q5, new jj(1, this, z10));
                return;
            }
        }
        znVar.qa(znVar.f40514a4, z4);
    }
}
