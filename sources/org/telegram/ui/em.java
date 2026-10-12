package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class em extends av0 {
    public final fo f35636a;

    public em(fo foVar) {
        this.f35636a = foVar;
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return fo.E1(this.f35636a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
