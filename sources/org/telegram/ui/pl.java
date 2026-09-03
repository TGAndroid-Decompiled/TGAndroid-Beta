package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class pl extends fu0 {
    public final zn f37181a;

    public pl(zn znVar) {
        this.f37181a = znVar;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return zn.A1(this.f37181a, messageObject, fileLocation, i10, z4, false);
    }
}
