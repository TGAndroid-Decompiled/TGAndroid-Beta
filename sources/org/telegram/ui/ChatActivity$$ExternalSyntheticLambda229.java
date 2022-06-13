package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class ChatActivity$$ExternalSyntheticLambda229 implements RequestDelegate {
    public static final ChatActivity$$ExternalSyntheticLambda229 INSTANCE = new ChatActivity$$ExternalSyntheticLambda229();

    private ChatActivity$$ExternalSyntheticLambda229() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatActivity.lambda$markSponsoredAsRead$242(tLObject, tLRPC$TL_error);
    }
}
