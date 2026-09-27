package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class nl extends ou0 {
    public final xn f36043a;

    public nl(xn xnVar) {
        this.f36043a = xnVar;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return xn.A1(this.f36043a, messageObject, fileLocation, i10, z10, false);
    }
}
