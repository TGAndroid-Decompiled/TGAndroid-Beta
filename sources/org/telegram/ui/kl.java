package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class kl extends zt0 {
    public final qn f38635a;

    public kl(qn qnVar) {
        this.f38635a = qnVar;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return qn.E1(this.f38635a, messageObject, fileLocation, i10, z10, false);
    }
}
