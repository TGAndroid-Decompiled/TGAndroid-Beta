package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ml extends ou0 {
    public final yn f38656a;

    public ml(yn ynVar) {
        this.f38656a = ynVar;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return yn.A1(this.f38656a, messageObject, fileLocation, i10, z10, false);
    }
}
