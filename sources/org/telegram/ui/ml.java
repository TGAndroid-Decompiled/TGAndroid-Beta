package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ml extends lu0 {
    public final wn f35605a;

    public ml(wn wnVar) {
        this.f35605a = wnVar;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.A1(this.f35605a, messageObject, fileLocation, i10, z10, false);
    }
}
