package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class em extends wu0 {
    public final eo f37186a;

    public em(eo eoVar) {
        this.f37186a = eoVar;
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return eo.E1(this.f37186a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
