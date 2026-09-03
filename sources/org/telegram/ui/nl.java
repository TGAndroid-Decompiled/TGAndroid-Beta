package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class nl extends fu0 {
    public final xn f39393a;

    public nl(xn xnVar) {
        this.f39393a = xnVar;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return xn.A1(this.f39393a, messageObject, fileLocation, i10, z4, false);
    }
}
