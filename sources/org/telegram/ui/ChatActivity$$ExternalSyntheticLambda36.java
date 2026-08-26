package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ReactedUsersListView;

public final class ChatActivity$$ExternalSyntheticLambda36 implements ReactedUsersListView.OnProfileSelectedListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final MessageObject f$1;

    public ChatActivity$$ExternalSyntheticLambda36(ChatActivity chatActivity, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = messageObject;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$processSelectedOption$346(this.f$1, alertDialog, i);
    }

    @Override
    public void onProfileSelected(ReactedUsersListView reactedUsersListView, long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didPressReaction$465(this.f$1, reactedUsersListView, j, messagePeerReaction);
                break;
            default:
                this.f$0.lambda$createMenu$259(this.f$1, reactedUsersListView, j, messagePeerReaction);
                break;
        }
    }
}
