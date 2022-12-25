package org.telegram.p009ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class ChatActivity$$ExternalSyntheticLambda238 implements RequestDelegate {
    public static final ChatActivity$$ExternalSyntheticLambda238 INSTANCE = new ChatActivity$$ExternalSyntheticLambda238();

    private ChatActivity$$ExternalSyntheticLambda238() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatActivity.lambda$markSponsoredAsRead$250(tLObject, tLRPC$TL_error);
    }
}
