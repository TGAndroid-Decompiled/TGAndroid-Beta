package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class ChatActivity$$ExternalSyntheticLambda223 implements RequestDelegate {
    public static final ChatActivity$$ExternalSyntheticLambda223 INSTANCE = new ChatActivity$$ExternalSyntheticLambda223();

    private ChatActivity$$ExternalSyntheticLambda223() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatActivity.lambda$markSponsoredAsRead$238(tLObject, tLRPC$TL_error);
    }
}
