package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ql extends fu0 {
    public final xn f40546a;

    public ql(xn xnVar) {
        this.f40546a = xnVar;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return xn.A1(this.f40546a, messageObject, fileLocation, i10, z4, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
