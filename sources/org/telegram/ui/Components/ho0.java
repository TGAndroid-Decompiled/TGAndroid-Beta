package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ho0 extends jg.z1 {
    @Override
    public final boolean d(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.Chat) && !org.telegram.messenger.t3.B((TLRPC.Chat) tLObject)) {
            return false;
        }
        return true;
    }
}
