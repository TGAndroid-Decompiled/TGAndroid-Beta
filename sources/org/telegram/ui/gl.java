package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class gl extends st0 {

    public final rn f38440a;

    public gl(rn rnVar) {
        this.f38440a = rnVar;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return rn.A1(this.f38440a, messageObject, fileLocation, i10, z10, false);
    }
}
