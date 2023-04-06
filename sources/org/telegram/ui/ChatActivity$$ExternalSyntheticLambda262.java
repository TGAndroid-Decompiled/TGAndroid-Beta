package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class ChatActivity$$ExternalSyntheticLambda262 implements RequestDelegate {
    public static final ChatActivity$$ExternalSyntheticLambda262 INSTANCE = new ChatActivity$$ExternalSyntheticLambda262();

    private ChatActivity$$ExternalSyntheticLambda262() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatActivity.lambda$markSponsoredAsRead$268(tLObject, tLRPC$TL_error);
    }
}
