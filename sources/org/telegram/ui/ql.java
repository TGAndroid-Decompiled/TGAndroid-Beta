package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ql extends yt0 {
    public final xn f37793a;

    public ql(xn xnVar) {
        this.f37793a = xnVar;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return xn.A1(this.f37793a, messageObject, fileLocation, i10, z4, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
