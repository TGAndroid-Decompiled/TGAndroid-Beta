package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class pl extends lu0 {
    public final wn f36572a;

    public pl(wn wnVar) {
        this.f36572a = wnVar;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.A1(this.f36572a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
