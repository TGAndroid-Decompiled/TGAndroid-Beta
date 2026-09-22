package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ol extends tu0 {
    public final zn f36359a;

    public ol(zn znVar) {
        this.f36359a = znVar;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return zn.A1(this.f36359a, messageObject, fileLocation, i10, z10, false);
    }
}
