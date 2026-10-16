package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class em extends zu0 {
    public final fo f35332a;

    public em(fo foVar) {
        this.f35332a = foVar;
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return fo.E1(this.f35332a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
