package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class nl extends tu0 {
    public final zn f35974a;

    public nl(zn znVar) {
        this.f35974a = znVar;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return zn.A1(this.f35974a, messageObject, fileLocation, i10, z10, false);
    }
}
