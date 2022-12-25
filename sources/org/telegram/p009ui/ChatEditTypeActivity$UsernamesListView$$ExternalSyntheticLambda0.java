package org.telegram.p009ui;

import org.telegram.p009ui.ChatEditTypeActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class ChatEditTypeActivity$UsernamesListView$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final ChatEditTypeActivity$UsernamesListView$$ExternalSyntheticLambda0 INSTANCE = new ChatEditTypeActivity$UsernamesListView$$ExternalSyntheticLambda0();

    private ChatEditTypeActivity$UsernamesListView$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatEditTypeActivity.UsernamesListView.lambda$sendReorder$0(tLObject, tLRPC$TL_error);
    }
}
