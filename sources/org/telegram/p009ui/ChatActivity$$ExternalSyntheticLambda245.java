package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class ChatActivity$$ExternalSyntheticLambda245 implements RequestDelegate {
    public static final ChatActivity$$ExternalSyntheticLambda245 INSTANCE = new ChatActivity$$ExternalSyntheticLambda245();

    private ChatActivity$$ExternalSyntheticLambda245() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatActivity.lambda$markSponsoredAsRead$257(tLObject, tLRPC$TL_error);
    }
}
