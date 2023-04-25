package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class ChatActivity$$ExternalSyntheticLambda266 implements RequestDelegate {
    public static final ChatActivity$$ExternalSyntheticLambda266 INSTANCE = new ChatActivity$$ExternalSyntheticLambda266();

    private ChatActivity$$ExternalSyntheticLambda266() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatActivity.lambda$markSponsoredAsRead$271(tLObject, tLRPC$TL_error);
    }
}
