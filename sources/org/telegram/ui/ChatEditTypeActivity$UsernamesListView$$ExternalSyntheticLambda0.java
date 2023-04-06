package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.ChatEditTypeActivity;
public final class ChatEditTypeActivity$UsernamesListView$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final ChatEditTypeActivity$UsernamesListView$$ExternalSyntheticLambda0 INSTANCE = new ChatEditTypeActivity$UsernamesListView$$ExternalSyntheticLambda0();

    private ChatEditTypeActivity$UsernamesListView$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatEditTypeActivity.UsernamesListView.lambda$sendReorder$0(tLObject, tLRPC$TL_error);
    }
}
