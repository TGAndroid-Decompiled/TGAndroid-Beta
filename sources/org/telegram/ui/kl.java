package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class kl extends pt0 {
    public final tn f39922a;

    public kl(tn tnVar) {
        this.f39922a = tnVar;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return tn.A1(this.f39922a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
