package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ol extends iu0 {
    public final wn f42106a;

    public ol(wn wnVar) {
        this.f42106a = wnVar;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.H1(this.f42106a, messageObject, fileLocation, i10, z10, false);
    }
}
