package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class ChatActivity$$ExternalSyntheticLambda217 implements RequestDelegate {
    public static final ChatActivity$$ExternalSyntheticLambda217 INSTANCE = new ChatActivity$$ExternalSyntheticLambda217();

    private ChatActivity$$ExternalSyntheticLambda217() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatActivity.lambda$markSponsoredAsRead$232(tLObject, tLRPC$TL_error);
    }
}
