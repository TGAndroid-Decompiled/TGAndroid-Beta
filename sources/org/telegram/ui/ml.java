package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ml extends gu0 {
    public final un f41574a;

    public ml(un unVar) {
        this.f41574a = unVar;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.G1(this.f41574a, messageObject, fileLocation, i10, z10, false);
    }
}
