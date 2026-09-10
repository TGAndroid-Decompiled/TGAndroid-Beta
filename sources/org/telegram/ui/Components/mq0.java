package org.telegram.ui.Components;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mq0 extends fg.d2 {
    @Override
    public final boolean d(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
            return false;
        }
        return true;
    }
}
