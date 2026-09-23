package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class nl extends mu0 {
    public final xn f35550a;

    public nl(xn xnVar) {
        this.f35550a = xnVar;
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return xn.A1(this.f35550a, messageObject, fileLocation, i10, z10, false);
    }
}
