package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ql extends vu0 {
    public final bo f36930a;

    public ql(bo boVar) {
        this.f36930a = boVar;
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return bo.A1(this.f36930a, messageObject, fileLocation, i10, z10, false);
    }
}
