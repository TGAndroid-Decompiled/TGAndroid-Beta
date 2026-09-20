package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ku0 extends MessageObject {
    @Override
    public final boolean canDeleteMessage(boolean z10, TLRPC.Chat chat) {
        return false;
    }
}
