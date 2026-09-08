package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ql extends su0 {
    public final co f39929a;

    public ql(co coVar) {
        this.f39929a = coVar;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return co.A1(this.f39929a, messageObject, fileLocation, i10, z10, false);
    }
}
