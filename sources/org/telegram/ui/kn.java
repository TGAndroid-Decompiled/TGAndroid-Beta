package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class kn extends MessageObject {
    @Override
    public final boolean canDeleteMessage(boolean z4, TLRPC.Chat chat) {
        return false;
    }
}
