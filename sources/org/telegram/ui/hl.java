package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class hl extends rt0 {
    public final qn f38827a;

    public hl(qn qnVar) {
        this.f38827a = qnVar;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        return qn.A1(this.f38827a, messageObject, fileLocation, i9, z10, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
