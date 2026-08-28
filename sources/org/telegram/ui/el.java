package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class el extends rt0 {
    public final qn f37986a;

    public el(qn qnVar) {
        this.f37986a = qnVar;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        return qn.A1(this.f37986a, messageObject, fileLocation, i9, z10, false);
    }
}
