package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ql extends tu0 {
    public final bo f36899a;

    public ql(bo boVar) {
        this.f36899a = boVar;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return bo.A1(this.f36899a, messageObject, fileLocation, i10, z10, false);
    }
}
