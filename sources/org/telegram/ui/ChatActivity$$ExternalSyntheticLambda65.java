package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ChatGreetingsView;

public final class ChatActivity$$ExternalSyntheticLambda65 implements AlertDialog.OnButtonClickListener, ChatGreetingsView.Listener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda65(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$showGigagroupConvertAlert$200(alertDialog, i);
    }

    @Override
    public void onGreetings(TLRPC.Document document) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$createEmptyView$304(document);
                break;
            default:
                this.f$0.lambda$createEmptyView$305(document);
                break;
        }
    }
}
