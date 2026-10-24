package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ll extends bu0 {
    public final sn f39312a;

    public ll(sn snVar) {
        this.f39312a = snVar;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return sn.E1(this.f39312a, messageObject, fileLocation, i10, z10, false);
    }
}
