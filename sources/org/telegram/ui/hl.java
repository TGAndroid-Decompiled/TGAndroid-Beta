package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class hl extends pt0 {
    public final tn f38955a;

    public hl(tn tnVar) {
        this.f38955a = tnVar;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return tn.A1(this.f38955a, messageObject, fileLocation, i10, z10, false);
    }
}
