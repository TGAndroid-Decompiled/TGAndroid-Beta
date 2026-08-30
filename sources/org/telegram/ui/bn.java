package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bn extends MessageObject {
    @Override
    public final boolean canDeleteMessage(boolean z4, TLRPC.Chat chat) {
        return false;
    }
}
