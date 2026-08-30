package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class nl extends yt0 {
    public final xn f36683a;

    public nl(xn xnVar) {
        this.f36683a = xnVar;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return xn.A1(this.f36683a, messageObject, fileLocation, i10, z4, false);
    }
}
