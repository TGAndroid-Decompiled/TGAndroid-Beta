package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class au0 extends MessageObject {
    @Override
    public final boolean canDeleteMessage(boolean z4, TLRPC.Chat chat) {
        return false;
    }
}
