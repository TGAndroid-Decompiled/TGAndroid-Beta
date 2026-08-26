package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ReactedUsersListView;

public final class ChatActivity$$ExternalSyntheticLambda37 implements ReactedUsersListView.OnProfileSelectedListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final boolean f$1;
    public final MessageObject f$2;

    public ChatActivity$$ExternalSyntheticLambda37(ChatActivity chatActivity, boolean z, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = z;
        this.f$2 = messageObject;
    }

    @Override
    public final void onProfileSelected(ReactedUsersListView reactedUsersListView, long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didPressReaction$468(this.f$1, this.f$2, reactedUsersListView, j, messagePeerReaction);
                break;
            default:
                this.f$0.lambda$createMenu$262(this.f$1, this.f$2, reactedUsersListView, j, messagePeerReaction);
                break;
        }
    }
}
