package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ml extends ou0 {
    public final yn f38664a;

    public ml(yn ynVar) {
        this.f38664a = ynVar;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return yn.A1(this.f38664a, messageObject, fileLocation, i10, z10, false);
    }
}
