package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ql extends mu0 {
    public final xn f36469a;

    public ql(xn xnVar) {
        this.f36469a = xnVar;
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return xn.A1(this.f36469a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
